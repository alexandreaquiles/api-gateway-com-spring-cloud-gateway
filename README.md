# api-gateway-com-spring-cloud-gateway

API Gateway do curso [Microservices com Spring Cloud](https://www.caelum.com.br/curso-microservices-spring-cloud) da Caelum reimplementado com Spring Cloud Gateway ao invés de Spring Cloud Netflix Zuul.

![API Gateway como Edge Service](https://raw.githubusercontent.com/caelum/apostila-microservices-com-spring-cloud/master/imagens/06-api-gateway/api-gateway-como-edge-services.png)


## Versões utilizadas

- Spring Boot: 2.1.8.RELEASE
- Spring Cloud: Greenwich.SR2
- Spring Cloud Gateway (implícita): 2.1.2.RELEASE

## Documentação
	
- Docs (v2.1.x): https://cloud.spring.io/spring-cloud-gateway/2.1.x/single/spring-cloud-gateway.html
- Docs (v2.1.1): https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.1.1.RELEASE/single/spring-cloud-gateway.html
- API:  https://javadoc.io/doc/org.springframework.cloud/spring-cloud-gateway-core/2.1.2.RELEASE/index.html
- Código: https://github.com/spring-cloud/spring-cloud-gateway/tree/v2.1.2.RELEASE
- Getting Started (com rotas em Java): https://spring.io/guides/gs/gateway/
- Página Principal: https://github.com/spring-cloud/spring-cloud-gateway
- Docs application.properties: https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.2.RELEASE/reference/html/appendix.html

## Execução dos Downstream Services

Execução dos BDs (via Docker Compose):

```sh
curl https://gitlab.com/snippets/1859850/raw > docker-compose.yml
docker-compose up -d
```

Execução do Monólito Modular:

```sh
git clone https://gitlab.com/aovs/projetos-cursos/fj33-eats-monolito-modular.git
git checkout cap5-integracao-pagamento-monolito-com-feign
mvn clean package
java -jar eats-application/target/eats-application-0.0.1-SNAPSHOT.jar 
```

Execução do Serviço de Pagamentos:

```sh
git clone https://gitlab.com/aovs/projetos-cursos/fj33-eats-pagamento-service.git
git checkout cap5-integracao-pagamento-monolito-com-feign
mvn clean spring-boot:run 
```

Execução do Serviço de Distância:

```sh
git clone https://gitlab.com/aovs/projetos-cursos/fj33-eats-distancia-service.git
git checkout cap5-integracao-monolito-distancia-com-rest-template
mvn clean spring-boot:run 
```

## URLs para testar

- http://localhost:9998/pagamentos/1
- http://localhost:9998/restaurantes/1
- http://localhost:9998/distancia/restaurantes/mais-proximos/71503510

### Referências

- Baeldung: https://www.baeldung.com/spring-cloud-gateway
- Uses Path: https://www.javainuse.com/spring/cloud-gateway
- http://www.appsdeveloperblog.com/spring-cloud-api-gateway-tutorial/
- https://github.com/fwfurtado/car-sharing/blob/master/api-gateway/src/main/resources/application.yml
- https://www.devglan.com/spring-cloud/spring-cloud-gateway-example

 