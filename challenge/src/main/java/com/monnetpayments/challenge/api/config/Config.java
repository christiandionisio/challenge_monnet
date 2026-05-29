package com.monnetpayments.challenge.api.config;

import com.monnetpayments.challenge.api.domain.EnglishQ;
import com.monnetpayments.challenge.api.domain.SpainQ;
import com.monnetpayments.challenge.api.domain.Q;
import com.monnetpayments.challenge.api.domain.UppercaseQ;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Q getQ(){
        return new SpainQ();
    }

    @Bean
    Q getQ2(){
        return new EnglishQ();
    }

    @Bean
    Q getQ3(Q getQ2){
        return new UppercaseQ(getQ2);
    }
}