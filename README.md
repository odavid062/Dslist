Dslist
Dslist é uma aplicação web desenvolvida com Java e Spring Boot, projetada para gerenciar listas de jogos. Ela permite que os usuários visualizem e organizem jogos em diferentes listas, facilitando o acesso e a categorização de seus títulos favoritos.

🚀 Tecnologias Utilizadas
Java 17

Spring Boot

Maven

Docker

Banco de Dados H2 (ou outro, conforme configuração)

📦 Como Executar o Projeto
Pré-requisitos
Java 17 instalado

Maven instalado

Docker instalado (opcional, para execução via Docker)

Passos para Execução
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/odavid062/Dslist.git
cd Dslist
Compile o projeto com Maven:

bash
Copiar
Editar
./mvnw clean install
Execute a aplicação:

bash
Copiar
Editar
./mvnw spring-boot:run
Acesse a aplicação no navegador:

arduino
Copiar
Editar
http://localhost:8080
Executando com Docker
Se preferir, você pode executar a aplicação usando Docker:

bash
Copiar
Editar
docker-compose up
🛠️ Estrutura do Projeto
O projeto segue a estrutura padrão do Spring Boot:

src/main/java: Contém o código-fonte da aplicação

src/main/resources: Contém os arquivos de configuração e recursos estáticos

pom.xml: Arquivo de configuração do Maven

📄 Documentação da API
A documentação da API pode ser acessada (se configurada) através do Swagger:

bash
Copiar
Editar
http://localhost:8080/swagger-ui.html
🤝 Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

📄 Licença
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE para obter mais informações.
