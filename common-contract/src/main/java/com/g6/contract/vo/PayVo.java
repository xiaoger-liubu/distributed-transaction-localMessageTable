package com.g6.contract.vo;

import com.g6.contract.entity.PayInfoEntity;
import lombok.Builder;

import java.util.Date;

/**
 * @Author: g6
 * @Date: 2020/5/5 20:33
 */
@Builder
public class PayVo {

    /**
     * 支付表ID
     */
    private String payId;
    /**
     * 支付用户ID
     */
    private String userId;
    /**
     * 支付金额
     */
    private Long payFee;
    /**
     * 支付时间
     */
    @Builder.Default
    private Date createTime = new Date();


    public static PayVo resolve(PayInfoEntity payInfoEntity){
        return PayVo.builder()
                .payId(payInfoEntity.getId())
                .payFee(payInfoEntity.getPayFee())
                .userId(payInfoEntity.getUserId()).build();
    }

}
