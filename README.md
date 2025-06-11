#
# StudentHibernate

A simple **Student Management System** built using **Hibernate (ORM)** and **MySQL**, implemented in Java. This application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on student records.

## 💻 Tech Stack

- **Java 8+**
- **Hibernate 5.6**
- **MySQL**
- **Maven**
- **Eclipse IDE**

## 📂 Project Structure
StudentHibernate/
├── src/
│ ├── com.student_info # Entity class
│ │ └── Student.java
│ ├── com.student_operation # All CRUD operations
│ │ └── StudentOperation.java
│ └── com.student_main # Main class with menu-driven UI
│ └── StudentMain.java
├── src/main/resources/
│ └── hibernate.cfg.xml # Hibernate configuration
├── pom.xml

sql
Copy
Edit

## ⚙️ Features

- Add new student
- View all students
- Update existing student
- Delete student
- Hibernate ORM integration
- MySQL database interaction

## 🗃️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE student_db;
Then update hibernate.cfg.xml with your credentials:

xml
Copy
Edit
<property name="connection.url">jdbc:mysql://localhost:3306/student_db</property>
<property name="connection.username">your_mysql_username</property>
<property name="connection.password">your_mysql_password</property>
📦 How to Run
Clone this repository
**
Import it as a Maven Project in Eclipse

Ensure MySQL is running and database is created

Run StudentMain.java to start the application**
