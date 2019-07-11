package com.hxhnzmb.example.factory;

import com.hxhnzmb.example.service.PaymentService;
import com.hxhnzmb.example.service.impl.AliPayServiceImpl;
import com.hxhnzmb.example.service.impl.WeChatPayServiceImpl;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/11 14:43
 */
public class PaymentFactory {

    public static PaymentService getPaymentService(String payType){
        PaymentService paymentService = null;
        if ("AliPay".equals(payType)){
            paymentService = new AliPayServiceImpl();
        }else if("Wechat".equals(payType)){
            paymentService = new WeChatPayServiceImpl();
        }
        return paymentService;
    }
}
