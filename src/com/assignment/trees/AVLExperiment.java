package com.assignment.trees;

public class AVLExperiment {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        int size = 1000;

        long startInsert = System.nanoTime();

        for(int i=1;i<=size;i++){
            tree.insert(new Student(i,"Student"+i,80));
        }

        long endInsert = System.nanoTime();

        System.out.println("Insert Time: " + (endInsert-startInsert));

        long startSearch = System.nanoTime();
        tree.search(5000);
        long endSearch = System.nanoTime();

        System.out.println("Search Time: " + (endSearch-startSearch));

        long startDelete = System.nanoTime();
        tree.delete(5000);
        long endDelete = System.nanoTime();

        System.out.println("Delete Time: " + (endDelete-startDelete));
    }
}
