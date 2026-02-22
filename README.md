# 🚆 Railway Reservation System with Modular Booking & Payment Validation

![Thumbnail](assets/thumbnail.png)

---

## 📌 Elevator Summary
A Java-based railway reservation system that models train scheduling, passenger management, ticket booking, and multiple payment modes with robust data validation.

---

## 📖 Project Overview

The Railway Reservation System is a Java-based console application designed to simulate real-world railway booking operations. It manages train details, passenger information, ticket bookings, and multiple payment modes using a modular, object-oriented architecture.

Developed as an academic project, this system demonstrates structured class design, modular programming, and validation-driven logic to ensure data integrity across booking workflows.

---

## 🎯 Project Objective

To design and implement a modular railway reservation system that efficiently manages train schedules, passenger records, booking workflows, and validated payment processing using object-oriented programming principles.

---

## ⚙️ Key Features

- 🚄 Manage train schedules with source, destination, timing, class type, fare, and platform details  
- 👤 Maintain structured passenger records with personal and contact information  
- 🎟️ Enable ticket booking with journey date, berth preference, and fare calculation  
- 💳 Support multiple payment modes: Cash, UPI, and Net Banking  
- 🛤️ Model different train types (Double Decker, Duronto) with specialized features  
- ✅ Enforce strong input validations for mandatory fields and numeric constraints  

---

## 🏗️ System Architecture

### Project Structure

```text
Railway-Reservation-System/
│
├── Train.java
├── Passenger.java
├── Booking.java
├── Payment.java
├── CashPayment.java
├── UPIPayment.java
├── NetBankingPayment.java
└── Main.java
```

### Core Entities

**Train**
- Train Number  
- Source & Destination  
- Departure & Arrival Time  
- Fare Amount  
- Class Type  
- Platform Number  

**Passenger**
- Passenger ID  
- Name  
- Age  
- Gender  
- Mobile Number  

**Booking**
- Train Number  
- Date of Journey  
- Berth Preference  
- Payment Mode  
- Fare  
- Source & Destination  

---

## 💳 Payment Architecture

The system implements a flexible payment interface using polymorphism:

- **Cash** – Direct payment processing  
- **UPI** – UPI ID validation  
- **Net Banking** – Card holder name, card number, validity date, and CVV validation  

---

## 🛡️ Validation Framework

To ensure data accuracy and integrity, the system includes:

- Mandatory field validation  
- Length validation for IDs, mobile numbers, card numbers, and CVV  
- Structured payment credential verification  
- Cross-module data consistency enforcement  

---

## 🛠️ Technologies Used

**Programming Language**
- Java  

**Concepts Applied**
- Object-Oriented Programming (OOP)  
- Classes and Objects  
- Interfaces and Inheritance  
- Constructors (Default & Parameterized)  
- Getter and Setter Methods  

**Platform**
- Java Console Application  

---

## 🧩 UML Diagram

![UML Diagram](assets/uml-diagram.png)

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/railway-reservation-system.git
   ```

2. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)  

3. Compile and run:
   ```
   Main.java
   ```

4. Follow console prompts to complete booking and payment workflows.

---

## 📈 Learning Outcomes

- Practical implementation of modular OOP architecture  
- Interface-driven payment module design  
- Validation-based system development  
- Simulation of real-world booking and transaction logic  
- Improved clean code structuring and system design  

---

## 🚀 Future Enhancements

- Database integration (MySQL / PostgreSQL)  
- GUI or web-based interface  
- Real-time seat availability tracking  
- User authentication and role-based access control  
- Transaction logging and reporting dashboard  

---
