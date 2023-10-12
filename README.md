# Projeto - Spring API 👽

Este projeto é uma API simples e eficaz que permite aos usuários gerenciar alunos, professores e notas. Através de endpoints claros e bem definidos, os usuários podem criar, atualizar, deletar e consultar informações sobre alunos, professores e as notas associadas.

## 🚀 Instalando o Projeto

Para instalar o projeto, siga estas etapas:

### 👉🏼 Pré-requisitos:

Antes de começar, você precisa ter o Java e o Maven instalados em sua máquina.

### 👩🏻‍💻 Windows:

```
# Clone o repositório
git clone https://github.com/gabrielaanselmo/api_spring_sistema_aluno_professor/
cd api_spring_sistema_aluno_professor

# Compile e construa o projeto com Maven
mvn clean install

# Execute a aplicação
mvn spring-boot:run
```

## 📦 Configurando o Banco de Dados
Antes de executar a aplicação, é necessário configurar a conexão com o banco de dados PostgreSQL. Siga os passos abaixo:
* Certifique-se de ter o PostgreSQL instalado e em execução em sua máquina.
* Crie um banco de dados.
* Abra o arquivo application.properties localizado em src/main/resources.
Atualize as seguintes propriedades com suas informações de conexão:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/###seubanco###
spring.datasource.username=###seuusuario###
spring.datasource.password=##suasenha###
```
Substitua ###seubanco###, ###seuusuario### e ##suasenha### pelos valores apropriados de seu ambiente.


## 👾 Endpoints
Endpoints disponíveis:
```
/alunos: Gerencie informações dos alunos.
/professores: Gerencie informações dos professores.
/notas: Gerencie as notas dos alunos.
```
Para testar os endpoints, você pode usar ferramentas como Postman ou cURL.

## 🤖 API
A API estará rodando no endereço:
```
http://localhost:8080/
```
