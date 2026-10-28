package com.itheima.pinda;

import com.itheima.pinda.auth.client.EnableAuthClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 网关启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.itheima.pinda")
@EnableZuulProxy //开启网关代理
@EnableAuthClient //开启授权客户端，开启后可使用pd-tools-jwt提供的工具类进行jwt token解析
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class,args);
    }
}
