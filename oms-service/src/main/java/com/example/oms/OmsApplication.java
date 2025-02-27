package com.example.oms;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
//@EnableAutoConfiguration
@EnableFeignClients(basePackages = "com.example.oms")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.example.oms")
@MapperScan("com.example.order.dao")
public class OmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(OmsApplication.class, args);
    }
}
