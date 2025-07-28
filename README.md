# Bank-Management-System
A desktop-based Bank Management System developed using Java Swing and MySQL that simulates core banking features like user signup, deposits, withdrawals, balance enquiry, mini statement, and more.
<br><br>
#🚀 Features
User Registration (Signup with multi-step form)

Secure Login with PIN

Account Type Selection

Facilities Selection (ATM, Internet Banking, etc.)

Deposit Money

Withdraw Money with Balance Check ✅

Fast Cash (Predefined Withdrawals)

Mini Statement (Recent Transactions with Balance)

Balance Enquiry

Fully GUI-based using Java Swing

Connected to MySQL backend using JDBC
<br><br>
#🛠️ Tech Stack
Technology	Description
Java	Backend logic and GUI (Swing)
MySQL	Relational database
JDBC	Java Database Connectivity
Swing	GUI framework
IntelliJ / Eclipse	Java IDE for development
<br><br>
#📂 Database Schema
sql
Copy
Edit
CREATE DATABASE bankmanagementsystem;

USE bankmanagementsystem;

CREATE TABLE signup (
    form_no VARCHAR(20), name VARCHAR(20), father_name VARCHAR(20),
    dob VARCHAR(20), gender VARCHAR(20), email VARCHAR(30), 
    marital VARCHAR(20), address VARCHAR(40), city VARCHAR(25),
    state VARCHAR(20), pin VARCHAR(25)
);

CREATE TABLE signuptwo (
    form_no VARCHAR(20), religion VARCHAR(20), category VARCHAR(20),
    income VARCHAR(20), education VARCHAR(20), occupation VARCHAR(20),
    pan VARCHAR(20), aadhar VARCHAR(20), seniorcitizen VARCHAR(20),
    exisistingaccount VARCHAR(20)
);

CREATE TABLE signupthree (
    form_no VARCHAR(20), accountType VARCHAR(40), cardNumber VARCHAR(30),
    pin VARCHAR(10), facilities VARCHAR(100)
);

CREATE TABLE login (
    form_no VARCHAR(20), cardNumber VARCHAR(30), pin VARCHAR(10)
);

CREATE TABLE bank (
    pin VARCHAR(20), date VARCHAR(50), type VARCHAR(20), amount VARCHAR(20)
);

<br><br>

#💻 How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/yourusername/bank-management-system.git
Open in IntelliJ / Eclipse.

Set up MySQL:

Import the above schema.

Update Conn.java with your MySQL credentials.

Run the Java files (start with Login.java).
