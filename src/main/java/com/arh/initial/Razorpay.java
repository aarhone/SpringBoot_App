package com.arh.initial;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue="razorpay")
public class Razorpay implements Payment{

    public String pay(){
        System.out.println("*Processing Razorpay payment*");
        String pay_service = "Razorpay";
        return pay_service;
    }

}
