# Java Library Management System

A console-based application built to practice object relationships and data management in Java. This project simulates a library system for managing book inventory and tracking availability.

## Features
- **Inventory Management:** Add new books with details including Title, Author, and ISBN.
- **Availability Tracking:** Manage book status between "Available" and "Checked Out."
- **Search Functionality:** Locate specific books within the library collection.

## OOP Concepts Applied
- **Composition:** Implementation of a `Library` class that manages a collection of `Book` objects via `ArrayList`.
- **Encapsulation:** Use of private attributes to protect book data, ensuring status changes occur only through authorized methods.
- **State Management:** Utilizing boolean flags to represent and track the real-world availability of objects.
- **Class Separation:** Architecture divided into a data model (`Book`), a controller (`Library`), and a user interface (`Main`).

## How to Run
1. Ensure the JDK is installed.
2. Clone the repository:
   ```bash
   git clone [https://github.com/Giedriussesk/javaLibrarySystem.git](https://github.com/Giedriussesk/javaLibrarySystem.git)
