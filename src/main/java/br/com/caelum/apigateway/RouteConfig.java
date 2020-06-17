package br.com.caelum.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    return builder.routes()
      .route("pagamentos", r -> r.path("/pagamentos/**")
                                    .uri("http://localhost:8081"))

      .route("distancia", r -> r.path("/distancia/**")
                                   .filters(f -> f.stripPrefix(1))
                                   .uri("http://localhost:8082"))

      .route("monolito", r -> r.path("/**")
                                  .uri("http://localhost:8080"))
      .build();
  }
}
