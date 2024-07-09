![thumbnail-Desafio Java](https://github.com/jacqueline-oliveira/3355-java-desafio/assets/66698429/4b068d55-5cfc-480c-b94f-7d48b3c91eb3)

# Screensound

Este projeto consiste em uma aplicação para armazenar dados de artistas e músicas em um banco de dados relacional, podendo buscar informações por artistas e consultar dados sobre os mesmos através de integração com a API do ChatGPT.

## Funcionalidades

- **Cadastro de Artistas**: Permite cadastrar informações sobre artistas, incluindo nome, tipo (solo, dupla, banda) e outras características relevantes.

- **Cadastro de Músicas**: Permite cadastrar informações sobre músicas, incluindo título, gênero, duração e o artista associado.

- **Listar Músicas**: Permite listar todas as músicas já cadastradas.

- **Pesquisa de Músicas por Artista**: Permite buscar músicas associadas a um determinado artista.
  
- **Pesquisa de dados sobre o Artista**: Permite buscar dados sobre o artista utilizando a API do ChatGPT.

## Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Como Executar o Projeto

1. Clone o repositório para a sua máquina local.
2. Configure o banco de dados PostgreSQL no arquivo `application.properties`.
3. Obtenha uma API_KEY no site da Open_AI e crie uma variável de ambiente com o valor da chave para utilizar na classe ChatGPTQuery no pacote service
4. Execute a aplicação.

## Exemplo de Uso

1. Acesse a página inicial da aplicação.
2. Clique na opção "Cadastrar Artista" para adicionar um novo artista.
3. Em seguida, clique na opção "Cadastrar Música" para associar uma música a um artista.
4. Utilize a opção "Pesquisar Músicas por Artista" para buscar músicas relacionadas a um artista específico.
5. Utilize a opção "Pesquisar Dados sobre um Artista" para buscar informações sobre o artista.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

