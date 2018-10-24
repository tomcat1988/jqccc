package com.frd.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置静态资源映射,jq
 * @author 刘强
 * @since 2017/7/16
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/jquery/** 访问都映射到classpath:/jquery/ 目录下
        registry.addResourceHandler("/jq/**").addResourceLocations("classpath:/jq/");
        registry.addResourceHandler("/jQuery-Canvas/**").addResourceLocations("classpath:/jQuery-Canvas/");
    }
}
