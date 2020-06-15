package br.com.caelum.apigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class RestClientConfig {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

}