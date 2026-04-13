# Java Library Management System

A console-based application built to practice object relationships and data management in Java. This project simulates a library environment where books can be added, searched, and checked in or out.

## 🕹️ Features
* **Inventory Management:** Add new books with specific details like Title, Author, and ISBN.
* **Availability Tracking:** Toggle the status of a book between "Available" and "Checked Out."
* **Search Functionality:** Find specific books within the library's collection using the library's internal registry.

## 🧠 OOP Concepts Applied
* **Composition:** Implemented a `Library` class that contains and manages a collection of `Book` objects using `ArrayList`.
* **Encapsulation:** Protected book data by using private attributes, ensuring that a book's status can only be changed through authorized methods.
* **State Management:** Managed the logical state of objects (boolean flags) to represent real-world availability.
* **Class Separation:** Divided the project into a data model (`Book`), a controller (`Library`), and a user interface (`Main`).

## 🚀 How to Run
1. Ensure you have the JDK installed.
2. Clone this repo:
   ```bash
   git clone [https://github.com/Giedriussesk/javaLibrarySystem.git](https://github.com/Giedriussesk/javaLibrarySystem.git)
