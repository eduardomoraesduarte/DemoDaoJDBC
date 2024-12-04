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
- Contribuições
- Licença

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

src/
├── application/       // Classes principais para executar o programa
├── db/                // Conexão com o banco de dados e gerenciamento de exceções
├── model/             
│   ├── entities/      // Classes que representam as entidades (ex: Seller, Department)
│   ├── dao/           // Interfaces DAO
│   └── dao.impl/      // Implementação das interfaces DAO com JDBC
└── resources/         // Arquivos de configuração, como db.properties

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
Clone o Repositório 🧬

git clone https://github.com/eduardomoraesduarte/DemoDaoJDBC.git
cd DemoDaoJDBC

