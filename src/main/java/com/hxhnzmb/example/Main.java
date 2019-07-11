package com.hxhnzmb.example;

import com.hxhnzmb.example.factory.PaymentFactory;
import com.hxhnzmb.example.service.PaymentService;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/11 14:40
 */
public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = PaymentFactory.getPaymentService("Wechat");
        if (paymentService != null){
            paymentService.pay();
        }
    }
}
