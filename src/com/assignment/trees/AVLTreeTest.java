package com.assignment.trees;

public class AVLTreeTest {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        System.out.println("========== AVL TREE TEST ==========\n");

        // INSERT TEST
        System.out.println("Insert Test:");
        tree.insert(new Student(50, "Alice", 85));
        tree.insert(new Student(30, "Bob", 78));
        tree.insert(new Student(70, "Charlie", 90));
        tree.insert(new Student(20, "David", 88));
        tree.insert(new Student(40, "Eva", 92));
        tree.insert(new Student(60, "Frank", 75));
        tree.insert(new Student(80, "Grace", 89));

        System.out.println("Students inserted successfully.\n");


        // DISPLAY TEST
        System.out.println("Display Students (Inorder Traversal):");
        tree.display();


        // SEARCH TEST
        System.out.println("\nSearch Test:");
        Student result = tree.search(40);

        if(result != null) {
            System.out.println("Student Found: " + result);
        } else {
            System.out.println("Student not found.");
        }


        // SEARCH NON EXISTING
        System.out.println("\nSearch Non Existing Student:");
        Student result2 = tree.search(999);

        if(result2 != null) {
            System.out.println("Student Found: " + result2);
        } else {
            System.out.println("Student not found.");
        }


        // DELETE TEST
        System.out.println("\nDelete Test (Leaf Node):");
        tree.delete(20);
        tree.display();


        // DELETE NODE WITH ONE CHILD
        System.out.println("\nDelete Test (Node with One Child):");
        tree.delete(30);
        tree.display();


        // DELETE NODE WITH TWO CHILDREN
        System.out.println("\nDelete Test (Node with Two Children):");
        tree.delete(50);
        tree.display();


        // FINAL TREE STATE
        System.out.println("\nFinal AVL Tree State:");
        tree.display();

        System.out.println("\n========== TEST COMPLETE ==========");
    }
}