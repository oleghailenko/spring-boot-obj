package org.test.WebModule;

import org.example.Module1.Module1Class;
import org.example.Module2.Module2Class;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Configuration
    @EnableWebMvc
    @ComponentScan(basePackages={"org.test.WebModule.controllers"})
    static public class WebMvcApplicationConfig extends WebMvcConfigurerAdapter {
    	@Bean
    	Module1Class module1Class() {
    		return new Module1Class("Name");
    	}
    	
    	@Bean
    	Module2Class module2Class() {
    		return new Module2Class("Name");
    	}
    }
    
}