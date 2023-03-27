package com.javabytes.springaopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.javabytes.springaopdemo")
@EnableAspectJAutoProxy
public class BeanConfig {

}
