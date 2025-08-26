# 📌 Estrutura de um projeto Spring Boot
Um projeto Spring Boot normalmente segue a convenção do Maven (ou Gradle). A organização facilita manutenção, testes e escalabilidade.

## 📂 Estrutura típica

meu-projeto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/exemplo/meuprojeto/
│   │   │       ├── MeuProjetoApplication.java
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/ (HTML, CSS, JS)
│   └── test/
│       └── java/
│           └── com/exemplo/meuprojeto/
│               └── MeuProjetoApplicationTests.java
└── pom.xml (arquivo de configuração Maven)

### pasta principais
- controller/ -> Onde ficam as classes que recebem as requisições HTTP.
- service/ -> Onde ficam a regras de negocios da aplicação.
- repository/ -> Acesso ao banco de dadoss (ex.: JPA?Hibernate).
- model/ -> As classes que representam os dados (entidades).




