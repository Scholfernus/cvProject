package com.example.cvproject.util.configuration.config;

import com.example.cvproject.util.configuration.beans.DummyLogger;
import com.example.cvproject.util.configuration.beans.ListUtil;
import com.example.cvproject.util.configuration.beans.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {
    @Bean
    public DummyLogger dummyLogger(){
        return new DummyLogger();
    }
    @Bean
    public ListUtil listUtility(){
        return new ListUtil();
    }
    @Bean("stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }
}
