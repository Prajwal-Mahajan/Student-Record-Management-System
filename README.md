# Student-Record-Management-System

## Overview

This is a simple console-based **Student Management System** in Java. It allows you to:

* Add students
* View all students
* Update student details
* Delete students

All student data is stored in memory using an `ArrayList` of `Student` objects.

## Features

* Fully encapsulated `Student` class
* CRUD operations (Create, Read, Update, Delete)
* Menu-driven console interface
* Input validation handled for basic types
* Works without external libraries

## Prerequisites

* Java Development Kit (JDK) installed (version 8 or higher)
* Command-line terminal or IDE (e.g., Eclipse, IntelliJ, VS Code)

## File Structure

```
Student-Record-Management-System/
│
├── StudentManagementSystem.java   # Main program with Student class
└── README.md                      # This documentation file
```

## How to Compile and Run

1. Open terminal / command prompt in the project directory.

2. **Compile the Java program:**

```
javac StudentManagementSystem.java
```

This will generate `StudentManagementSystem.class` in the same folder.

3. **Run the program:**

```
java StudentManagementSystem
```

4. You should see a menu:

```
===== Student Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter choice:
```

5. Follow on-screen prompts to perform operations.

## Notes

* File name must exactly match the public class name: `StudentManagementSystem.java`.
* After compilation, always run the program using the class name without `.java` or `.class`.
* Student data is **not persistent**; it will be lost when the program exits.

## Example Usage

```
Enter choice: 1
Enter ID: 101
Enter Name: Alice
Enter Marks: 95
✅ Student added successfully!

Enter choice: 2
--- Student Records ---
Student{ID=101, Name='Alice', Marks=95.0}
```

## License

This project is open-source and free to use for learning purposes.
