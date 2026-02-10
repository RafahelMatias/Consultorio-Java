# Psychology Clinic Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Persistence-red?style=for-the-badge)

## 📋 Project Overview

This project is a specialized ERP solution developed for **Psychology Clinics**, designed to handle sensitive patient data, session scheduling, and anamnesis records (medical history).

**Engineering Highlight:**
The system manages complex **One-to-Many** and **Many-to-Many** relationships between *Psychologists*, *Patients*, and *Sessions*. It implements a strict **Data Access Object (DAO)** pattern to decouple the business logic from the persistence layer, ensuring maintainability.

*(Context: This project was originally developed under academic guidance and was subsequently adapted and refactored by the author for advanced study purposes.)*

## 🚀 Key Features

* **Patient Records (Prontuário):** Comprehensive management of patient data, including history and contact info.
* **Session Management:** Scheduling and tracking of therapy sessions (`Sessao`), linked to specific patients and psychologists.
* **Anamnesis Logic:** A specialized module for recording initial clinical interviews (`Anamnese`), crucial for psychological treatment planning.
* **Professional Management:** Administrative control for Psychologists' profiles and credentials.

## 🛠️ Technical Architecture

* **Language:** Java (Swing for Desktop UI).
* **Database:** MySQL (Relational Schema).
* **Design Pattern:** MVC (Model-View-Controller) & DAO.
* **Security:** Use of `PreparedStatement` to prevent SQL Injection attacks.

## 🗄️ Database Schema & SQL Logic

The core strength of this backend is the relational integrity. Below is an example of how the system links a **Session** to a **Patient**:

```sql
-- Example: Retrieving all sessions for a specific patient using JOINs
SELECT 
    S.data AS Data_Sessao, 
    S.resumo_sessao, 
    P.nome AS Paciente, 
    Psi.nome AS Psicologo
FROM Sessao S
INNER JOIN Anamnese A ON S.idAnamnese = A.idAnamnese
INNER JOIN Paciente P ON A.idPaciente = P.idPaciente
INNER JOIN Psicologo Psi ON A.idPsicologo = Psi.idPsicologo
WHERE P.idPaciente = ?;
```

## ⚙️ How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/RafahelMatias/consultorio-java.git](https://github.com/RafahelMatias/consultorio-java.git)
   ```

2. **Database Setup:**

* Import the CriaBancoConsultorio.sql file into your MySQL instance.

* Important: Configure your database credentials in src/main/java/persistencia/ConFactory.java.

3. **Build & Run:**

* Open the project in IntelliJ, NetBeans or Eclipse.

* Run the main class: apresentacao.fmLogin.

4. **Default Credentials:**

    User: user
    Password: 123