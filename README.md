# Thdemo - Thymeleaf Demo Project

Projeto de pesquisa utilizando **Thymeleaf** e **Spring Boot** para criar uma aplicação web rodando do backend.

## Tecnologias Utilizadas

- **Java**: 17
- **Spring Boot**: 3.4.3
- **Thymeleaf**: 3.1.3.RELEASE
- **SLF4J**: 2.0.16
- **Maven**: 3.9.9

## Pré-requisitos

- **Java 17** ou superior
- **Maven** (opcional, pois o projeto já inclui o Maven Wrapper)

## Como Rodar o Projeto

1. Clone o repositório:

   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd Thdemo

## Compile e rode o projeto utilizando o Maven Wrapper:

No Linux/Mac:

./mvnw spring-boot:run

No Windows:

mvnw.cmd spring-boot:run

Acesse a aplicação no navegador:

http://localhost:8080/products

## Estrutura do Projeto
java: Contém o código-fonte da aplicação.

templates: Contém os templates Thymeleaf.

src/main/resources/application.properties: Configurações da aplicação.

<!--java: Contém os testes unitários.-->

## Observações
O projeto utiliza o Maven Wrapper para facilitar a execução sem a necessidade de instalar o Maven globalmente.

A aplicação exibe informações de um produto e seus comentários utilizando Thymeleaf.

## Licença
Este projeto é apenas para fins educacionais e não possui uma licença específica.
