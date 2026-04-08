# Student Record Management System using AVL Tree

## Overview

This project implements a **Student Record Management System using an AVL Tree data structure** in Java. The system stores student records and allows efficient operations such as **insertion, searching, deletion, and displaying records**.

An **AVL Tree** is a self-balancing Binary Search Tree that maintains a balanced height by performing rotations during insertions and deletions. This ensures that operations such as search, insert, and delete operate efficiently with **O(log n)** time complexity.

This project was developed as part of the **COMP47500 – Advanced Data Structures in Java** module.

---

# Features

The system supports the following operations:

- Insert a student record
- Search for a student by ID
- Delete a student record
- Display all students using **in-order traversal**
- Automatic **AVL balancing using rotations**
- Performance experimentation for different dataset sizes
- Visualization of experimental results using charts

---

# Technologies Used

- Java
- Eclipse IDE
- AVL Tree Data Structure
- JFreeChart (for visualization)
- Git & GitHub (version control)

---

# Project Structure

Student-Record-Management-System-using-AVL-Tree-Data-Structure

src  
└── com.assignment.trees  
  ├── MainApp.java  
  ├── AVLTree.java  
  ├── AVLNode.java  
  ├── Student.java  
  ├── AVLTreeTest.java  
  ├── AVLExperiment.java  
  └── AVLVisualization.java  

diagrams  
├── UML_Class_Diagram.png  
└── UML_Activity_Diagram.png  

README.md

---

# Data Structure Used

The system uses an **AVL Tree**, a self-balancing binary search tree where the height difference between the left and right subtrees of any node is maintained within the range **[-1, +1]**.

If the balance factor becomes invalid after insertion or deletion, the tree performs **rotations** to restore balance.

Rotations implemented:

- Left Rotation
- Right Rotation
- Left-Right Rotation
- Right-Left Rotation

These rotations guarantee that the height of the tree remains **logarithmic**, ensuring efficient performance.

---

# Time Complexity

Operation | Time Complexity
--------- | ---------------
Insertion | O(log n)
Search | O(log n)
Deletion | O(log n)
Traversal | O(n)

Because the tree remains balanced, the worst-case scenario of a skewed tree is avoided.

---

# UML Diagrams

The design of the system is represented using the following UML diagrams.

## Class Diagram

The class diagram illustrates the structure of the system and the relationships between the classes:

MainApp – Handles the menu-driven interface.  
AVLTree – Implements AVL Tree operations.  
AVLNode – Represents nodes in the AVL tree.  
Student – Stores student information.

## Activity Diagram

The activity diagram represents the system workflow:

1. Start the program  
2. Display menu  
3. User selects an operation  
4. Perform insert, search, delete, or display  
5. Return to the menu or exit the system

---

# Experimental Evaluation

To evaluate the performance of the AVL Tree, experiments were conducted using datasets of different sizes.

Dataset sizes tested:

- 100 records
- 1000 records
- 10000 records

For each dataset size, the following metrics were measured:

- Insertion time
- Search time

The results show that the AVL Tree maintains **logarithmic growth in execution time**, confirming its scalability for larger datasets.

---

# Visualization

Experimental results were visualized using **JFreeChart** to generate performance graphs. The charts illustrate how the execution time increases gradually as the dataset size grows, demonstrating the efficiency of AVL Trees.

---

# Example Operations

## Insert Student

Enter ID: 101  
Enter Name: Alice  
Enter Grade: 89  

## Search Student

Enter Student ID: 101  
Student Found: Alice  

## Display Student
Enter Student ID: 101
101, Alice, 89 

## Delete Student

Enter Student ID: 101  
Student deleted successfully

---

# Test Cases

Several test cases were implemented to verify the correctness of the system.

Test scenarios include:

- Insert multiple students
- Search existing records
- Search non-existing records
- Delete leaf nodes
- Delete nodes with one child
- Delete nodes with two children
- Verify AVL balancing after deletion

---

# Future Improvements

Possible improvements include:

- Implementing persistent storage using a database
- Developing a graphical user interface (GUI)
- Extending the system to manage additional student attributes
- Adding advanced analytics for performance evaluation

---

# Module

COMP47500 – Advanced Data Structures in Java
