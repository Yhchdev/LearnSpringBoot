package xyz.yhch.springboot04webrestfulcurd.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.yhch.springboot04webrestfulcurd.component.LoginHandlerInterceptor;
import xyz.yhch.springboot04webrestfulcurd.component.MyLocalrResolver;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/Main.html").setViewName("dashboard");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalrResolver();
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**") //拦截任意路径下的任意层请求(所有请求)
                .excludePathPatterns("/","/user/login","/webjars/**","/asserts/**"); //设置排除的路径 去往登录的路径,静态资源
    }
}

