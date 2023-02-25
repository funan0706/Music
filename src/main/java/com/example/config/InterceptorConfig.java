package com.example.config;

import com.example.interceptors.JWTInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private JWTInterceptor jwtInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        //有待补充
        registry.addInterceptor(jwtInterceptor).
                excludePathPatterns("/user/**","/music/**","/mv/**","/musicList/**","/static/**")
                .addPathPatterns("/**"); // 拦截除了"/user/**的所有请求路径
    }
}