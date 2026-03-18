package com.assignment.trees;

public class AVLNode {
    Student data;
    AVLNode left, right;
    int height;

    public AVLNode(Student data) {
        this.data = data;
        height = 1;
    }
}