package com.example.springboot03web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;
// 扩展 mvc DispatcherServlet
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    // viewResolver 实现了视图解析器接口的类，我们就可以把他看成视图解析器
    @Bean
    public ViewResolver myViewResolver(){
    return new MyViewResolver();
    }
    // 自定义了一个自己的视图解析器 MyViewResolver
    public static class MyViewResolver implements ViewResolver{
        public View resolverViewName(String viewName, Locale locale) throws Exception{
            return null;

        }

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
