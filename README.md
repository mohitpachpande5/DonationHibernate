
---

### ✅ Final `README.md` — Donor Management System (PostgreSQL Edition)

```markdown
# 🎁 Donor Management System (Full Stack Java Web Application)

A full-stack donor management web application built using **Java Servlets**, **HTML/CSS/JS**, **Hibernate ORM**, and **PostgreSQL**. It supports user registration, login, and full CRUD operations for managing donor data, all within a secure, responsive UI.

---

## 🚀 Features

- 👤 User registration & login
- 🔒 Secure password hashing (BCrypt)
- 📋 Donor Create, Read, Update, Delete (CRUD)
- 💡 Responsive and colorful UI with animated gradients
- 💾 Hibernate ORM connected to PostgreSQL
- 🧠 Session-based user tracking

---

## 🛠️ Tech Stack

| Layer      | Tech Used                         |
|------------|-----------------------------------|
| Frontend   | HTML5, CSS3, JavaScript           |
| Backend    | Java Servlets, Hibernate ORM      |
| Database   | PostgreSQL                        |
| Build Tool | Apache Tomcat                     |
| Security   | BCrypt (Password Hashing)         |

---

## 📁 Folder Structure

```
DonorApp/
│
├── controller/           # Java Servlets (Login, Signup, Donor)
├── dao/                  # DAO classes (Hibernate-based)
├── model/                # Entity classes (User, Donor)
├── util/                 # HibernateUtil and PasswordUtil
├── webapp/               # Frontend files
│   ├── login.html
│   ├── signup.html
│   ├── registerDon.html
│   ├── updateDon.html
│   ├── displayDon.html
│   └── styles.css
└── hibernate.cfg.xml     # Hibernate Configuration
```

---

## 🔧 Setup Instructions

### 1. 📦 Prerequisites

Ensure the following are installed and set up:

- Java 11+
- Apache Tomcat 9 or later
- PostgreSQL (running locally)
- PostgreSQL JDBC Driver (via Maven or manual JAR)
- IDE like IntelliJ or Eclipse

---

### 2. ⚙️ Hibernate Configuration (`hibernate.cfg.xml`)

Update with your PostgreSQL credentials:

```xml
<property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/donorsystem</property>
<property name="hibernate.connection.username">your_pg_user</property>
<property name="hibernate.connection.password">your_pg_password</property>
<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
<property name="hibernate.hbm2ddl.auto">update</property>
<property name="hibernate.show_sql">true</property>
```

---

### 3. ▶️ Running the App

1. Start PostgreSQL server and ensure the `donorsystem` database exists.
2. Deploy the app on Apache Tomcat.
3. Open in browser: `http://localhost:8080/donation/`

---

## 🔐 Security

- Passwords are hashed using **BCrypt**
- Login sessions are handled with `HttpSession`
- Donor pages are protected behind login

---

## 📸 UI Preview

### ✅ Login / Signup
![Login/Signup](https://github.com/user-attachments/assets/cf1943aa-ab4a-46eb-a8d0-a5a01d5fd4f2)

![Signup Form](https://github.com/user-attachments/assets/8eb82ed9-881d-4b45-9637-024853391903)

### ✅ Register Donor
![Register Donor](https://github.com/user-attachments/assets/66d9ae50-9de1-45a0-9a66-3169dafc79b7)

### ✅ Donor List with Edit/Delete
![Donor List](https://github.com/user-attachments/assets/1a54338f-fe99-45b9-a83e-ff18661d2e2c)

### ✅ Update Donor Details
![Update Donor](https://github.com/user-attachments/assets/e4320eff-4405-45c7-bd52-c4f394a6fdf6)

---

## 🙌 Author

**Mohit Vikas Pachpande**  
💻 Java | Hibernate | PostgreSQL | Full Stack Developer  
🔗 [LinkedIn](https://linkedin.com) *(add your profile URL here)*

---

## 📃 License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify it for learning or personal projects.
```

---

