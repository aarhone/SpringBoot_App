package com.arh.initial;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue="stripe")
public class Stripe implements Payment{

    public String pay(){
        System.out.println("*Processing Stripe payment*");
        String pay_service = "Stripe";
        return pay_service;
    }

}
