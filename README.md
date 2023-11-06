# Lojinha MOBILE Automação

Esse é um repositório que contém a automação de teste MOBILE de um software denominado Lojinha. Os subtópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas
- Java
  [Java Downloads | Oracle](https://www.oracle.com/java/technologies/downloads/#jdk21-windows)
- JUnit
  [Maven Repository: org.junit.jupiter » junit-jupiter-api » 5.10.0 (mvnrepository.com)](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- Appium
  [Maven Repository: io.appium » java-client » 8.5.1 (mvnrepository.com)](https://mvnrepository.com/artifact/io.appium/java-client/8.5.1)
- Maven
  [Maven – Welcome to Apache Maven](https://maven.apache.org/)

## Testes Automatizados
Teste para validar as Partições de Equivalência relacionadas ao valor do produto na Lojinha, que estão diretamente vinculados à Regra de Negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

## Notas Gerais
- Utilização da anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
- Armazenamento dos dados que são enviados para o dispositivo MOBILE através do uso de classes TELAS.
- Utilização do JUnit5, o que dá a possibilidade de usar a anotação DisplayName para dar descrições em português para o teste.