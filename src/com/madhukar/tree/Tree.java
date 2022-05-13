package com.madhukar.tree;

public class Tree {
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        System.out.println("Root --> left --> left : "+root.left.left.data);
    }
}
