package com.example.Zeotap_Asst1.model;

public class Node {
    private String type; // "operator" or "operand"
    private Node left;
    private Node right;
    private String value; // Optional value for operand nodes (e.g., comparison value)

    // Constructor, getters, and setters
    public Node(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Node(String type, Node left, Node right) {
        this.type = type;
        this.left = left;
        this.right = right;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public String getValue() {
        return value;
    }
}

