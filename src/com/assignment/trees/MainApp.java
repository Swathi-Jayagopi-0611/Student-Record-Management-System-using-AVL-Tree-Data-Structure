package com.assignment.trees;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();

                    tree.insert(new Student(id, name, grade));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    Student s = tree.search(searchId);

                    if (s != null)
                        System.out.println("Found: " + s);
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    tree.display();
                    break;

                case 4:
                	sc.close();
                    System.exit(0);
            }
        }
    }
}