package com.assignment.trees;

public class AVLTreeTest {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.insert(new Student(1, "Alice", 85));
        tree.insert(new Student(2, "Bob", 78));
        tree.insert(new Student(3, "Charlie", 90));

        System.out.println("Search Test:");
        System.out.println(tree.search(2));

        System.out.println("\nDisplay:");
        tree.display();
    }
}