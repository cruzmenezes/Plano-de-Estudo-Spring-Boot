# API REST
**O que é uma API REST?**
Uma API REST (sigla para Application Programming Interface - Representational State Transfer) é um conjunto de regras e padrões que define como dois sistemas de software se comunicam pela internet. Em termos mais simples, é a "linguagem" que permite que um cliente (como um navegador ou um aplicativo de celular) solicite informações de um servidor e receba uma resposta.

Imagine a internet como uma grande biblioteca. O cliente é você, e o servidor é o bibliotecário. A API REST são as regras que você e o bibliotecário seguem para interagir: você pede um livro (recurso) de uma forma específica (GET /livros/123), e o bibliotecário te dá o livro ou uma mensagem de erro se ele não existir.

**Para que serve e onde usar?**
O principal objetivo de uma API REST é permitir a comunicação e a troca de dados entre diferentes sistemas de forma padronizada e eficiente. Ela é a base da maioria das aplicações web modernas.

**Onde usar?**
- Aplicações Web: Para que o seu front-end (o que o usuário vê e interage) se comunique com o back-end (onde a lógica de negócio e os dados estão).

- Aplicativos Móveis: Permite que aplicativos de celular (iOS e Android) acessem dados de um servidor remoto.

- Microsserviços: Em uma arquitetura de microsserviços, cada serviço se comunica com os outros através de APIs REST para realizar tarefas complexas.

**Onde o Spring Boot se encaixa com API REST?**
O Spring Boot é a ferramenta perfeita para construir APIs REST. Com as dependências "starter" como **spring-boot-starter-web**, ele já configura tudo o que é necessário (servidor, mapeamento de rotas, conversão de JSON) para que você possa focar apenas em criar as classes e os métodos que respondem às requisições **HTTP (GET, POST, PUT, DELETE)** tornando o processo de desenvolvimento de APIs REST incrivelmente rápido e eficiente.