# Student Record Management System using AVL Tree

## Overview
This project implements a **Student Record Management System** using an **AVL Tree (Self-Balancing Binary Search Tree)** in Java.  

The system allows efficient storage, retrieval, and display of student records while maintaining optimal performance through automatic balancing.

## Objectives
- To implement a real-world application using **Tree Data Structures**
- To understand and apply **AVL Tree balancing techniques**
- To ensure efficient **search and insertion operations**
- To analyze performance using different input sizes

## Data Structure Used
### AVL Tree
An AVL Tree is a self-balancing Binary Search Tree where the difference between heights of left and right subtrees (balance factor) is at most 1.

### Key Features:
- Automatic balancing using rotations
- Maintains sorted order of data
- Guarantees **O(log n)** time complexity

## Features of the System

- Insert student record  
- Search student by ID  
- Display all student records (sorted order)  
- Automatic tree balancing (AVL rotations)  

## Project Structure

src/  
└── com.assignment.trees/  
├── Student.java → Model class  
├── AVLNode.java → Node structure  
├── AVLTree.java → AVL logic (insert, search, rotations)  
├── MainApp.java → User interface (menu-driven)  
└── AVLTreeTest.java → Test cases  

## Technologies Used

- Java (JDK 25)
- Eclipse IDE
- Git & GitHub

## How to Run the Project

### Step 1: Open in Eclipse
- Import project into Eclipse
- Ensure JDK is configured

### Step 2: Run Program
- Right-click `MainApp.java`
- Click **Run As → Java Application**

## Time Complexity

| Operation | Complexity |
|----------|----------|
| Insert   | O(log n) |
| Search   | O(log n) |
| Traversal| O(n)     |

## Experimental Analysis

The system was tested with different input sizes:

| Input Size | Insert Time | Search Time |
|-----------|------------|------------|
| 10        | Fast       | Fast       |
| 100       | Moderate   | Fast       |
| 1000      | Efficient  | Very Fast  |

### Observation:
- AVL Tree maintains balanced height
- Performance remains efficient even for large datasets

## AVL Rotations Implemented

- Left Rotation  
- Right Rotation  
- Left-Right Rotation  
- Right-Left Rotation  

These rotations ensure the tree remains balanced after each insertion.
## Conclusion

This project demonstrates how AVL Trees can be effectively used in real-world applications requiring efficient data storage and retrieval.  

The self-balancing property ensures optimal performance and makes AVL Trees superior to normal Binary Search Trees in worst-case scenarios.

---
