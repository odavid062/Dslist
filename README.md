# 🕹️ Dslist

**Dslist** é uma aplicação web desenvolvida com Java e Spring Boot, projetada para gerenciar listas de jogos.  
Ela permite que os usuários visualizem e organizem jogos em diferentes listas, facilitando o acesso e a categorização de seus títulos favoritos.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Banco de Dados H2 (ou PostgreSQL, conforme configuração)

---

## 📦 Como Executar o Projeto

### ✅ Pré-requisitos

- Java 17 instalado
- Maven instalado

### ▶️ Passos para Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/odavid062/Dslist.git
   cd Dslist
   ```

2. Compile o projeto com Maven:

   ```bash
   ./mvnw clean install
   ```

3. Execute a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a aplicação no navegador:

   [http://localhost:8080](http://localhost:8080)


---

## 📂 Estrutura do Projeto

```
Dslist/
├── src/
│   └── main/
│       ├── java/          # Código-fonte da aplicação
│       └── resources/     # Arquivos de configuração e recursos estáticos
└──  pom.xml                # Arquivo de build e dependências (Maven)

```

---

## 📄 Documentação da API

Se o Swagger estiver habilitado, a documentação da API estará disponível em:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 🤝 Contribuindo

Contribuições são bem-vindas!  
Sinta-se à vontade para abrir *issues* ou enviar *pull requests*.

---

## 📜 Licença

Este projeto está licenciado sob a Licença MIT.  
Consulte o arquivo [LICENSE](LICENSE) para mais informações.
