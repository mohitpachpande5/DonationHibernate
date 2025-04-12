🎁 Donor Management System (Full Stack Java Web Application)
A full-stack donor management web application built using Java Servlets, HTML/CSS/JS, Hibernate ORM, and PostgreSQL. It supports user registration, login, and full CRUD operations for managing donor data, all within a secure, responsive UI.

🚀 Features
👤 User registration & login

🔒 Secure password hashing (BCrypt)

📋 Donor Create, Read, Update, Delete (CRUD)

💡 Responsive and colorful UI with animated gradients

💾 Hibernate ORM connected to PostgreSQL

🧠 Session-based user tracking

🛠️ Tech Stack
Layer	Tech Used
Frontend	HTML5, CSS3, JavaScript
Backend	Java Servlets, Hibernate ORM
Database	PostgreSQL
Build Tool	Apache Tomcat
Security	BCrypt (Password Hashing)
📁 Folder Structure
bash
Copy
Edit
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
🔧 Setup Instructions
1. 📦 Prerequisites
Java 11 or higher

Apache Tomcat 9 or later

PostgreSQL installed and running

PostgreSQL JDBC Driver (via Maven or manually)

IDE like IntelliJ IDEA or Eclipse

2. ⚙️ Hibernate Configuration (hibernate.cfg.xml)
Ensure your hibernate.cfg.xml is configured as follows:

xml
Copy
Edit
<property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/donorsystem</property>
<property name="hibernate.connection.username">your_pg_user</property>
<property name="hibernate.connection.password">your_pg_password</property>
<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
<property name="hibernate.hbm2ddl.auto">update</property>
<property name="hibernate.show_sql">true</property>
Replace your_pg_user and your_pg_password with your actual PostgreSQL credentials.

3. ▶️ Running the App
Start the PostgreSQL server.

Deploy the project to Apache Tomcat.

Access the application at: http://localhost:8080/donation/

🔐 Security
Passwords are securely hashed using BCrypt.

User sessions are managed using HttpSession.

Donor-related routes are restricted to authenticated users only.

📸 UI Pages
✅ Login / Signup pages

✅ Register Donor

✅ Donor List (with Edit/Delete)

✅ Update Donor Details (Pre-filled)

🙌 Author
Mohit Vikas Pachpande
📬 LinkedIn | 💻 Java | Hibernate | PostgreSQL | Full Stack

📃 License
This project is open source and available under the MIT License.

