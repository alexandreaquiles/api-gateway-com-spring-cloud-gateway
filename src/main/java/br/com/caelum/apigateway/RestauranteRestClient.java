package br.com.caelum.apigateway;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${monolito.url}", name = "monolito")
interface RestauranteRestClient {

  @GetMapping("/restaurantes/{id}")
  Map<String,Object> porId(@PathVariable("id") Long id);

}
