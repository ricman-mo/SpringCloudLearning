package com.luas.xmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableHystrix
@EnableZuulProxy
@SpringBootApplication
public class XmallZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallZuulApplication.class, args);
    }

}
