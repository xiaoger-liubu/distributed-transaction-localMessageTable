package com.g6.contract.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @Author hx
 * @Date 2019/12/11 3:53 PM
 * @Version 1.0
 * @Description TODO
 */

public class ZipUtil {

    public static void zip(String srcName, String zipName)throws IOException{

        File inputFile = new File(srcName);
        if (!inputFile.exists())
            throw new IllegalArgumentException("压缩源不存在。");
        File zipFile = new File(zipName);
        //创建目标压缩空文件
        if (!zipFile.exists())
        {
            File parentFile = zipFile.getParentFile();
            parentFile.mkdirs();
            zipFile.createNewFile();
        }

        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
        //调用实际执行的压缩方法
        zip(out, inputFile, inputFile.getName());
        //递归调用最后关闭压缩输出流
        out.close();
    }

    private static void zip(ZipOutputStream zipOut, File inputFile, String base)throws IOException{
        //储存数据缓冲的字节数组
        byte[] bts = new byte[1024];
        //当前读到的字节个数
        int num = 0;
        //压缩源是一个文件
        if (inputFile.isFile())
        {
            //写入一个条目，此条目名就是文件名
            zipOut.putNextEntry(new ZipEntry(base));
            //源文件输入流
            FileInputStream in = new FileInputStream(inputFile);
            //将源文件的二进制数据读取至bts后，再将bts储存的数据写入当前压缩条目中
            while ((num = in.read(bts)) != -1)
            {
                zipOut.write(bts, 0, num);
            }
            //关闭当前源文件流
            in.close();
        }
        else
        {
            //压缩源是一个目录时，罗列出其下所有文件/文件夹
            File[] subFiles = inputFile.listFiles();
            //是一个文件夹就将条目名前加一个“/”,“/”表示写入一个目录型的条目
            base = base.length() == 0 ? "" : base + "/";
            //递归调用
            for (int i = 0; i < subFiles.length; i++)
            {
                zip(zipOut, subFiles[i], base + subFiles[i].getName());
            }

        }
    }

    public static void unZip(String zipName, String desName)throws IOException{
        File zipFile = new File(zipName);
        if (!zipFile.exists())
            throw new IllegalArgumentException("解压源不存在。");
        File desDir = new File(desName);
        if (!desDir.exists())
            desDir.mkdirs();
        ZipInputStream in = new ZipInputStream(new FileInputStream(zipFile));
        unzip(in, desDir);
        in.close();
    }

    public static void unzip(ZipInputStream in, File desFile)throws IOException{
        ZipEntry entry = null;
        byte[] bts = new byte[1024];
        int num = 0;
        while ((entry = in.getNextEntry()) != null && !entry.isDirectory())
        {
            //解压出来的文件名必定是“目标目录名+‘/’+条目名”
            File file = new File(desFile.getAbsoluteFile() + File.separator + entry.getName());
            if (!file.exists())
            {
                File parentFile = file.getParentFile();
                parentFile.mkdirs();
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            while ((num = in.read(bts)) != -1)
            {
                fos.write(bts, 0, num);
            }
            fos.close();
            in.closeEntry();
        }
    }

}
