# Digital Library Book Management System

## Overview
The **Digital Library Book Management System** is a simple Java-based project designed to manage books in a library. This system allows users to add, remove, update, search, and display book details efficiently. The project is developed using **JDK 23** and implemented as an **Eclipse Project**.

## Features
- **Add a New Book**: Store book details like title, author, ISBN, and category.
- **Remove a Book**: Delete a book record from the system.
- **Update Book Information**: Modify existing book details.
- **Search for a Book**: Find books by title, author, or ISBN.
- **Display All Books**: List all available books with complete details.

## Project Structure
```
DigitalLibraryBookManagement/
├── src/
│   ├── Library.java             # Handles all book operations
│   ├── Book.java                # Defines book properties
│   ├── LibraryManagement.java   # Contains the main method for execution
│
├── README.md                    # Project documentation
├── .gitignore                    # Git ignore file
└── DigitalLibrary.iml            # Eclipse project file
```

## Java Files Description

### 1. `Library.java`
This file contains methods to handle all operations related to book management, including:
- Adding new books to the collection
- Removing books
- Updating book details
- Searching for books
- Displaying all books

### 2. `Book.java`
Defines the **Book** class and its attributes such as:
- `title`
- `author`
- `ISBN`
- `category`
- Getters and setters for book properties

### 3. `LibraryManagement.java`
Contains the **main method**, which starts program execution and provides a menu-driven interface for user interaction.

## Requirements
- **Java Development Kit (JDK 23)**
- **Eclipse IDE** (or any Java-supported IDE)

## How to Run the Project
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/yourusername/DigitalLibraryBookManagement.git
   ```
2. **Open the Project in Eclipse.**
3. **Compile and Run `LibraryManagement.java`.**
4. **Follow the on-screen instructions to manage books.**

## Future Enhancements
- Implement a graphical user interface (GUI) using Java Swing or JavaFX.
- Add a database integration for persistent storage.
- Implement user authentication for secure access.

## License
This project is open-source and available under the **MIT License**.

---
**Author:** Your Name  
**GitHub:** [Your Profile](https://github.com/yourusername)

