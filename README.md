Awesome! Here's the **updated `README.md`** tailored specifically for your project **using PostgreSQL** instead of MySQL:

---

### ✅ `README.md` — Donor Management System (PostgreSQL Edition)

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
├── webapp/
│   ├── login.html
│   ├── signup.html
│   ├── registerDon.html
│   ├── updateDon.html
│   ├── displayDon.html
│   └── styles.css
└── hibernate.cfg.xml     # Hibernate Configuration
```
Absolutely! Here's your **adjusted and properly formatted section** of the `README.md` with:

- ✅ Clean indentation
- ✅ Syntax-highlighted folder structure
- ✅ Proper line breaks for readability
- ✅ Preserved PostgreSQL configuration code block

---

### ✅ Updated README.md Section

```markdown
---

## 📁 Folder Structure

```
DonorApp/
│
├── controller/           # Java Servlets (Login, Signup, Donor)
├── dao/                  # DAO classes (Hibernate-based)
├── model/                # Entity classes (User, Donor)
├── util/                 # HibernateUtil and PasswordUtil
├── webapp/
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

- Java 11+
- Apache Tomcat 9 or later
- PostgreSQL installed and running
- PostgreSQL JDBC Driver (via Maven or manually)
- IDE like IntelliJ or Eclipse

---

### 2. ⚙️ Hibernate Configuration (`hibernate.cfg.xml`)

```xml
<property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/donorsystem</property>
<property name="hibernate.connection.username">your_pg_user</property>
<property name="hibernate.connection.password">your_pg_password</property>
<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
<property name="hibernate.hbm2ddl.auto">update</property>
<property name="hibernate.show_sql">true</property>
```
```


### 3. ▶️ Running the App

1. Start PostgreSQL server.
2. Deploy the project to Apache Tomcat.
3. Visit: `http://localhost:8080/donation/`

---

## 🔐 Security

- Passwords are securely hashed using **BCrypt**
- User sessions stored with **HttpSession**
- Donor routes restricted to authenticated users only

---

## 📸 UI Pages

- ✅ Login / Signup pages
-![image](https://github.com/user-attachments/assets/cf1943aa-ab4a-46eb-a8d0-a5a01d5fd4f2)

- ![image](https://github.com/user-attachments/assets/8eb82ed9-881d-4b45-9637-024853391903)

- ✅ Register donor
- ![image](https://github.com/user-attachments/assets/66d9ae50-9de1-45a0-9a66-3169dafc79b7)

- ✅ Donor list (with edit/delete)
- ![image](https://github.com/user-attachments/assets/1a54338f-fe99-45b9-a83e-ff18661d2e2c)

- ✅ Update donor details (pre-filled)
- ![image](https://github.com/user-attachments/assets/e4320eff-4405-45c7-bd52-c4f394a6fdf6)


---

## 🙌 Author

**Mohit Vikas Pachpande**  
📬 [LinkedIn](https://linkedin.com) | 💻 Java | Hibernate | PostgreSQL | Full Stack

---

## 📃 License

This project is open source and free to use under the [MIT License](LICENSE).
```

---
