package com.myapp.makemyfood.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

  @Bean
  public CommonJsonMapperInitializer commonJsonMapperInitializer() {
    return new CommonJsonMapperInitializer();

  }
}
