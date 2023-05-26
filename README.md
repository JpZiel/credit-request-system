# credit-request-system
 Uma empresa de empréstimo precisa criar um sistema de análise de solicitação de crédito. Sua tarefa será criar uma API REST SPRING BOOT E KOTLIN para a empresa fornecer aos seus clientes as seguintes funcionalidades:

Cliente (Customer):
Cadastrar:
Request: firstName, lastName, cpf, income, email, password, zipCode e street
Response: String
Editar cadastro:
Request: id, firstName, lastName, income, zipCode, street
Response: firstName, lastName, income, cpf, email, income, zipCode, street
Visualizar perfil:
Request: id
Response: firstName, lastName, income, cpf, email, income, zipCode, street
Deletar cadastro:
Request: id
Response: sem retorno
Solicitação de Empréstimo (Credit):
Cadastrar:
Request: creditValue, dayFirstOfInstallment, numberOfInstallments e customerId
Response: String
Listar todas as solicitações de emprestimo de um cliente:
Request: customerId
Response: creditCode, creditValue, numberOfInstallment
Visualizar um emprestimo:
Request: customerId e creditCode
Response: creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer
API para Sistema de Avaliação de Créditos
Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito

Arquitetura em 3 camadas Projeto Spring Boot
Arquitetura em 3 camadas Projeto Spring Boot


Links Úteis
https://start.spring.io/#!type=gradle-project&language=kotlin&platformVersion=3.0.3&packaging=jar&jvmVersion=17&groupId=me.dio&artifactId=credit-application-system&name=credit-application-system&description=Credit%20Application%20System%20with%20Spring%20Boot%20and%20Kotlin&packageName=me.dio.credit-application-system&dependencies=web,validation,data-jpa,flyway,h2
https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html
https://medium.com/cwi-software/versionar-sua-base-de-dados-com-spring-boot-e-flyway-be4081ddc7e5
https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/
https://pt.wikipedia.org/wiki/Objeto_de_Transfer%C3%AAncia_de_Dados
https://pt.wikipedia.org/wiki/CRUD
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#glossary
