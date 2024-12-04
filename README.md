# DemoDaoJDBC 🚀
Projeto de estudo que implementa o padrão de arquitetura em camadas utilizando Java e JDBC para conexão e manipulação de dados em um banco de dados MySQL. 🐬

---

## Índice 📑
- Sobre o Projeto
- Estrutura do Projeto
- Tecnologias Utilizadas
- Requisitos
- Configuração do Ambiente
- Funcionalidades Implementadas
- Como Executar
- Testes Realizados

---

## Sobre o Projeto📖
Este projeto tem como objetivo demonstrar uma implementação prática de um sistema baseado em JDBC (Java Database Connectivity). O projeto segue uma abordagem modular, dividindo o código em camadas de:

1. Acesso a Dados (DAO - Data Access Object) 💾
2. Modelo de Negócio (Entities/Model) 📋
3. Controle (Application) 🕹️

O banco de dados utilizado é o MySQL, e todas as operações são realizadas através de consultas SQL estruturadas diretamente.

---

## Estrutura do Projeto 🗂️
A estrutura principal do projeto é organizada da seguinte maneira:

```bash
src/
├── application/       // Classes principais para executar o programa
├── db/                // Conexão com o banco de dados e gerenciamento de exceções
├── model/             
│   ├── entities/      // Classes que representam as entidades (ex: Seller, Department)
│   ├── dao/           // Interfaces DAO
│   └── dao.impl/      // Implementação das interfaces DAO com JDBC
└── resources/         // Arquivos de configuração, como db.properties
```

---

## Tecnologias Utilizadas 🛠️
- Java 17 (ou versão compatível) ☕
- JDBC para conexão com o banco de dados 🖧
- MySQL como banco de dados relacional 🐬
- IDE: Eclipse ou similar 💻

---

## Requisitos ✅
- Java Development Kit (JDK) instalado.
- Servidor MySQL em execução com banco de dados configurado.
- Arquivo db.properties configurado corretamente.

---

## Configuração do Ambiente ⚙️
### 1. Clone o Repositório 🧬

```bash
git clone https://github.com/eduardomoraesduarte/DemoDaoJDBC.git
cd DemoDaoJDBC
```

### 2. Configure o Banco de Dados 🗄️

- Certifique-se de que o banco de dados MySQL está rodando.
- Execute o seguinte script SQL para criar as tabelas necessárias:
```bash
CREATE DATABASE demo_dao_jdbc;

USE demo_dao_jdbc;

CREATE TABLE department (
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45) NOT NULL
);

CREATE TABLE seller (
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100),
    BirthDate DATE,
    BaseSalary DOUBLE,
    DepartmentId INT,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```
### 3. Configure o Arquivo db.properties 📝

Insira os dados de conexão no arquivo db.properties:

```bash
dburl=jdbc:mysql://localhost:3306/demo_dao_jdbc
user=seu_usuario
password=sua_senha
```
### 4. Importe o Projeto 📂

Abra o projeto na sua IDE favorita (como Eclipse).

---

## Funcionalidades Implementadas 🌟
Operações CRUD no Banco de Dados
- Departamento (Department):
  -- Inserção, busca por ID, listagem completa, e exclusão.
- Vendedor (Seller):
  --Inserção, busca por ID, listagem completa, listagem por departamento e exclusão.

---

## Como Executar ▶️
1. Certifique-se de que o banco de dados está configurado e rodando.
2. No Eclipse, execute a classe principal localizada em:

```bash
application.Program
```

---

## Testes Realizados 🧪
Foram implementados e testados os seguintes cenários:

1. Busca por ID 🔍
 - Teste de recuperação de registros específicos.
2. Listagem Completa 📋
 - Teste de retorno de todas as entradas de Department e Seller.
3. Inserção de Dados ➕
 - Inserção de novos registros e validação no banco.
4. Atualização de Dados 🔄
 - Alteração de informações existentes.
5. Exclusão de Registros 🗑️
 - Remoção de registros utilizando o método deleteById.
