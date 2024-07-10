![Imgur](https://i.imgur.com/nSzYlwZ.png)

<h1 align = "center">
  ScreenSound
</h1>
<p align="center">
  <a href="#descrição-do-projeto">Descrição</a> •
  <a href="#funcionalidades">Funcionalidades</a> •
  <a href="#tecnologias-utilizadas">Tecnologias</a> •
  <a href="#como-executar-o-projeto">Como Executar o Projeto</a> •
  <a href="#screenshots">Screenshots</a> •
  <a href="#contribuição">Contribuição</a> •
  <a href="#contato">Contato</a>
</p>

# Descrição do Projeto

Este projeto consiste em uma aplicação para armazenar dados de artistas e músicas em um banco de dados relacional, podendo buscar informações por artistas e consultar dados sobre os mesmos através de integração com a API do ChatGPT.

<a href="#--screensound">Voltar ao topo</a>

## Funcionalidades

1. **Cadastro de Artistas**: Permite cadastrar informações sobre artistas, incluindo nome, tipo (solo, dupla, banda) e outras características relevantes.

2. **Cadastro de Músicas**: Permite cadastrar informações sobre músicas, incluindo título, gênero, duração e o artista associado.

3. **Listar Músicas**: Permite listar todas as músicas já cadastradas.

4. **Pesquisa de Músicas por Artista**: Permite buscar músicas associadas a um determinado artista.
  
5. **Pesquisa de dados sobre o Artista**: Permite buscar dados sobre o artista utilizando a API do ChatGPT.

<a href="#--screensound">Voltar ao topo</a>

## Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL

<a href="#--screensound">Voltar ao topo</a>

## Como Executar o Projeto

1. Clone o repositório para a sua máquina local.
    ```bash
    git clone https://github.com/KarlaSilvaDev/screensound.git
    ```
    
2. Entre no diretório do projeto
    ```bash
    cd screensound
    ```
    
3. Configure o banco de dados no arquivo `application.properties` ou cria variáveis de ambiente na sua máquina:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/screensound
    spring.datasource.username=seu-usuario
    spring.datasource.password=sua-senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```
    
4. Obtenha uma API_KEY no site da Open_AI e crie uma variável de ambiente com o valor da chave para utilizar na classe ChatGPTQuery no pacote service
   
5. Execute a aplicação.
    ```bash
    mvn spring-boot:run
    ```

<a href="#--screensound">Voltar ao topo</a>

## Screenshots

**pendente**
1. Acesse a página inicial da aplicação.
2. Clique na opção "Cadastrar Artista" para adicionar um novo artista.
3. Em seguida, clique na opção "Cadastrar Música" para associar uma música a um artista.
4. Utilize a opção "Pesquisar Músicas por Artista" para buscar músicas relacionadas a um artista específico.
5. Utilize a opção "Pesquisar Dados sobre um Artista" para buscar informações sobre o artista.

<a href="#--screensound">Voltar ao topo</a>

## Contribuição

Se deseja contribuir para o projeto, siga os passos abaixo:

1. Faça um fork deste repositório
   
2. Crie uma branch para sua feature:
    ```bash
     git checkout -b feature/nova-feature
    ```
    
3. Faça commit das suas alterações:
    ```bash
    git commit -m "Adiciona nova feature"
    ```
    
4. Envie as alterações para o seu fork:
    ```bash
    git push origin feature/nova-feature
    ```
    
5. Abra um pull request neste repositório

<a href="#--screensound">Voltar ao topo</a>

## Contato

Caso tenha alguma dúvida ou sugestão, entre em contato pelo email karlasilvaeng@gmail.com.

