package com.g6.contract.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: g6
 * @Date: 2020/3/6 12:49
 */
@Slf4j
public class JsonUtils {


    private static final ObjectMapper objMapper = new ObjectMapper();

    static {
        objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * 将对象转换为JSON字符串
     * @param obj 对象
     * @return String
     */
    public static String toJSON(Object obj){
        if(obj == null){
            return "";
        }
        try {
            return objMapper.writeValueAsString(obj);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return "";
        }
    }

    /**
     * 将JSON字符串转换为对象
     * @param content JSON字符串
     * @param clazz 类
     * @return T
     */
    public static <T> T parseJSON(String content,Class<T> clazz){
        if(content == null || content.trim().equals("")){
            return null;
        }
        try {
            return objMapper.readValue(content, clazz);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 将JSON字符串转换为Java泛型对象
     * <pre>
     * 使用示例：
     * 1.将内容转换为List集合
     * <code>
     * List&lt;MyClass&gt; list = JsonUtil.parseJSON(content,new TypeReference&lt;List&lt;MyClass&gt;&gt;(){});
     * </code>
     * 2.将内容转换为Map
     * Map&lt;String, List&lt;MyClass&gt;&gt; map = JsonUtil.parseJSON(content, new TypeReference&lt;Map&lt;String, List&lt;MyClass&gt;&gt;&gt;(){});
     * </pre>
     * @param content JSON字符串
     * @param typeReference TypeReference 例如：new TypeReference&lt;List&lt;MyClass&gt;&gt;(){}
     * @return
     */
    public static <T> T parseJSON(String content,TypeReference<T> typeReference){
        if(content == null || content.trim().equals("")){
            return null;
        }
        try {
            return objMapper.readValue(content, typeReference);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

}
