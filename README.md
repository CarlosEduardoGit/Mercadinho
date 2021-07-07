# Aplicação Web de um Mercadinho-Virtual

#### Em Desenvolvimento!!!
#### Ultima atualização 07/07/2021

## Descrição: 

O sistema do mercadinho é uma plataforma de compras on line dos mais diversos produtos que um mercadinho possa oferecer aos seus clientes. A plataforma ainda conta com uma interface de gerenciamento para diretores, gestores e supervisores acompanharem as movimentações em tela ou gerarem diversos relatórios oferecidos pelo sistema. Podendo assim tomar decisões por exemplo da quantidade exata de items para repor em seus estoques. Ou mesmo saber a quantidade de produtos que foram vendidos.

## Criadores:

Sistema desenvolvido de forma colaborativa por Carlos Eduardo e Rosemeire Deconti

## Tecnologias utilizadas:

Metodologia: Ágil<br>
Framework para gestão do produto: SCRUM<br>
Repositórios: Git como repositório local e GitHub como repositório em nuvem<br>
Banco de dados: SQLServer / MySQL<br>
Aplicativo para administração do SQLServer: SSMS - SQL Server Management Studio<br>
IDE: Eclipse IDE for Enterprise Java and Web Developers - 2021-03<br>
Vesão do Java: JDK 11 - Kit de Desenvolvimento Java<br>
Tipo de aplicação: Aplicação web<br>
Linguagem ou Framework Front-end: Não<br>
Linguagem ou Framework Back-end: Spring Boot<br>
 - Dependencias:
   - Spring Web<br>



## Links de referencia para Implementação do Projeto:<br>
- Criando um blog com Spring Boot e deploy na AWS Elastic Beanstalk:<br>
https://www.youtube.com/watch?v=UdJYuwnqL3I&list=PL8iIphQOyG-AdKMQWtt1bqdVm8QUnX7_S

- Tipos de dados SQLServer:<br>
https://docs.microsoft.com/pt-br/sql/t-sql/data-types/data-types-transact-sql?view=sql-server-ver15

# Colaboração de Rosemeire Deconti
## Modelo de banco de dados:
- MySql script para criação BD 'groceryStore':<br> https://github.com/CarlosEduardoGit/Mercadinho-Virtual/blob/master/sql/GroceryStoreMySql.sql
- Tabelas:
  Carrinho de compras: CARTS e CARTS_ITEMS;
  Ordens de venda: SALES e SALES_ITEMS;
  Ordens de compra: PURCHASES e PURCHASES_ITEMS;
  Movimento de estoque: MOVEMENTS;
  Estoque: STOCKS;
  Lojas: STORES;
  Produtos: PRODUCTS;
  Clientes: CUSTOMERS;
  Fornecedores: VENDORS;
  Empregados: EMPLOYEES;
  Usuários: USERS;
  Contatos: CONTACTS (são os endereços das lojas, clientes, fornecedores e usuários);
  Imagens: IMAGES (são as fotos dos produtos armazenadas no Github e acessadas por URL para realizar os testes);
- Diagrama:<br> https://github.com/CarlosEduardoGit/Mercadinho-Virtual/blob/master/sql/model.pdf

