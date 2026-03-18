package com.assignment.trees;

public class AVLTree {

    private AVLNode root;

    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public AVLNode insert(AVLNode node, Student data) {
        if (node == null)
            return new AVLNode(data);

        if (data.id < node.data.id)
            node.left = insert(node.left, data);
        else if (data.id > node.data.id)
            node.right = insert(node.right, data);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && data.id < node.left.data.id)
            return rightRotate(node);

        if (balance < -1 && data.id > node.right.data.id)
            return leftRotate(node);

        if (balance > 1 && data.id > node.left.data.id) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && data.id < node.right.data.id) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void insert(Student data) {
        root = insert(root, data);
    }

    public Student search(int id) {
        AVLNode current = root;

        while (current != null) {
            if (id == current.data.id)
                return current.data;
            else if (id < current.data.id)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }

    public void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void display() {
        inorder(root);
    }
}