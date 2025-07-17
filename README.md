<p align="center">
  <a href="https://github.com/mauricioandrade/ProgressorAPI/blob/main/LICENSE"><img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="License"></a>
  <img src="https://img.shields.io/badge/Java-17-orange.svg" alt="Java 17">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-green.svg" alt="Spring Boot 3.x">
</p>

<h1 align="center">
  Progressor API 🏋️
</h1>

<p align="center">
  Uma API REST robusta e completa para gerenciar dados de treino, progresso e nutrição em aplicações de fitness.
  <br>
  <i>A robust and comprehensive REST API for managing workout, progress, and nutrition data in fitness applications.</i>
</p>

<p align="center">
  <a href="#-versão-em-português-br"><strong>Português (BR)</strong></a>
  ·
  <a href="#-english-us-version"><strong>English (US)</strong></a>
</p>

<br>

<div id="-versão-em-português-br">

## 🇧🇷 Versão em Português (BR)

### Índice

- [Sobre o Projeto](#-sobre-o-projeto)
  - [Principais Funcionalidades](#-principais-funcionalidades)
  - [Stack Tecnológica](#-stack-tecnológica)
- [Como Começar](#-como-começar)
  - [Pré-requisitos](#-pré-requisitos)
  - [Instalação](#-instalação)
- [Documentação da API](#-documentação-da-api)
- [Como Contribuir](#-como-contribuir)
- [Licença](#-licença)
- [Contato](#-contato)

---

### 📖 Sobre o Projeto

O **Progressor API** é um backend de código aberto projetado para ser a fundação de qualquer aplicação de saúde e fitness. Ele oferece endpoints para registrar treinos detalhados, acompanhar a progressão de carga, monitorar medidas corporais e gerenciar metas de calorias, permitindo que desenvolvedores foquem na criação de uma ótima experiência de usuário no front-end.

#### ✨ Principais Funcionalidades

* **🏋️ Gerenciamento de Treinos:** Crie, visualize e registre sessões de treino completas.
* **📈 Acompanhamento de Progressão de Carga:** Monitore o aumento de pesos e repetições ao longo do tempo para exercícios específicos.
* **📏 Registro de Medidas Corporais:** Salve o histórico de peso, percentual de gordura e outras medidas para visualizar a evolução física.
* **🍎 Metas de Calorias:** Defina e acompanhe metas de consumo calórico diário.
* **🔒 Autenticação Segura:** Sistema de autenticação e autorização baseado em JWT (JSON Web Tokens).

#### 🛠️ Stack Tecnológica

As principais tecnologias utilizadas neste projeto são:

| Tecnologia          | Ícone                                                                                                                    |
| ------------------- | :-----------------------------------------------------------------------------------------------------------------------: |
| **Java 17** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="30" height="30"/>             |
| **Spring Boot 3** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="30" height="30"/>           |
| **Spring Security** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="30" height="30"/>           |
| **JPA / Hibernate** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-original-wordmark.svg" width="30" height="30"/> |
| **PostgreSQL** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" width="30" height="30"/>   |
| **Docker** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="30" height="30"/>           |
| **Maven** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="30" height="30"/>             |

---

### 🚀 Como Começar

Siga estes passos para configurar e rodar o projeto em seu ambiente local.

#### ✅ Pré-requisitos

* **Java JDK 17** ou superior.
* **Docker** e **Docker Compose**.
* **Apache Maven**.

#### ⚙️ Instalação

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/mauricioandrade/ProgressorAPI.git](https://github.com/mauricioandrade/ProgressorAPI.git)
    ```
2.  **Navegue até a pasta do projeto:**
    ```bash
    cd ProgressorAPI
    ```
3.  **Inicie o banco de dados com Docker Compose:**
    Este comando irá criar e iniciar um contêiner PostgreSQL com as configurações definidas no arquivo `docker-compose.yml`.
    ```bash
    docker-compose up -d
    ```
4.  **Execute a aplicação Spring Boot:**
    Aguarde alguns segundos para o banco de dados iniciar completamente e então execute a aplicação.
    ```bash
    mvn spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

---

### 📚 Documentação da API

A documentação completa de todos os endpoints disponíveis é gerada automaticamente com o **Swagger (OpenAPI 3)**.

Para acessá-la, com a aplicação rodando, visite a URL:

➡️ **[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)**

---

### 🤝 Como Contribuir

Contribuições são o que tornam a comunidade de código aberto um lugar incrível para aprender, inspirar e criar. Qualquer contribuição que você fizer será **muito bem-vinda**.

1.  Faça um **Fork** do projeto.
2.  Crie uma **Branch** para sua feature (`git checkout -b feature/AmazingFeature`).
3.  Faça o **Commit** de suas alterações (`git commit -m 'Add some AmazingFeature'`).
4.  Faça o **Push** para a Branch (`git push origin feature/AmazingFeature`).
5.  Abra um **Pull Request**.

---

### 📄 Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.

---

### 📬 Contato

Mauricio Andrade - [@LinkedIn](https://www.linkedin.com/in/mauricioandradexdz/)

Link do Projeto: [https://github.com/mauricioandrade/ProgressorAPI](https://github.com/mauricioandrade/ProgressorAPI)

</div>

<hr>

<div id="-english-us-version">

## 🇺🇸 English (US) Version

### Table of Contents

- [About The Project](#-about-the-project-1)
  - [Key Features](#-key-features-1)
  - [Tech Stack](#-tech-stack-1)
- [Getting Started](#-getting-started-1)
  - [Prerequisites](#-prerequisites-1)
  - [Installation](#-installation-1)
- [API Documentation](#-api-documentation-1)
- [Contributing](#-contributing-1)
- [License](#-license-1)
- [Contact](#-contact-1)

---

### 📖 About The Project

**Progressor API** is an open-source backend designed to be the foundation for any health and fitness application. It provides endpoints for logging detailed workouts, tracking progressive overload, monitoring body measurements, and managing calorie goals, allowing developers to focus on creating a great front-end user experience.

#### ✨ Key Features

* **🏋️ Workout Management:** Create, view, and log complete workout sessions.
* **📈 Progressive Overload Tracking:** Monitor the increase in weights and reps over time for specific exercises.
* **📏 Body Measurement Logging:** Save a history of weight, body fat percentage, and other metrics to visualize physical evolution.
* **🍎 Calorie Goals:** Set and track daily calorie intake goals.
* **🔒 Secure Authentication:** Authentication and authorization system based on JWT (JSON Web Tokens).

#### 🛠️ Tech Stack

The main technologies used in this project are:

| Technology          | Icon                                                                                                                    |
| ------------------- | :-----------------------------------------------------------------------------------------------------------------------: |
| **Java 17** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="30" height="30"/>             |
| **Spring Boot 3** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="30" height="30"/>           |
| **Spring Security** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="30" height="30"/>           |
| **JPA / Hibernate** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-original-wordmark.svg" width="30" height="30"/> |
| **PostgreSQL** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" width="30" height="30"/>   |
| **Docker** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="30" height="30"/>           |
| **Maven** | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="30" height="30"/>             |

---

### 🚀 Getting Started

Follow these steps to set up and run the project in your local environment.

#### ✅ Prerequisites

* **Java JDK 17** or later.
* **Docker** and **Docker Compose**.
* **Apache Maven**.

#### ⚙️ Installation

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/mauricioandrade/ProgressorAPI.git](https://github.com/mauricioandrade/ProgressorAPI.git)
    ```
2.  **Navigate to the project folder:**
    ```bash
    cd ProgressorAPI
    ```
3.  **Start the database with Docker Compose:**
    This command will create and start a PostgreSQL container with the settings defined in the `docker-compose.yml` file.
    ```bash
    docker-compose up -d
    ```
4.  **Run the Spring Boot application:**
    Wait a few seconds for the database to initialize completely, and then run the application.
    ```bash
    mvn spring-boot:run
    ```

The API will be available at `http://localhost:8080`.

---

### 📚 API Documentation

The complete documentation for all available endpoints is automatically generated with **Swagger (OpenAPI 3)**.

To access it while the application is running, visit the URL:

➡️ **[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)**

---

### 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1.  **Fork** the Project.
2.  Create your **Feature Branch** (`git checkout -b feature/AmazingFeature`).
3.  **Commit** your Changes (`git commit -m 'Add some AmazingFeature'`).
4.  **Push** to the Branch (`git push origin feature/AmazingFeature`).
5.  Open a **Pull Request**.

---

### 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

---

### 📬 Contact

Mauricio Andrade - [@LinkedIn](https://www.linkedin.com/in/mauricioandradexdz/)

Project Link: [https://github.com/mauricioandrade/ProgressorAPI](https://github.com/mauricioandrade/ProgressorAPI)

</div>
