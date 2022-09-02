package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash Table");
        String message = "To be or Not to be";
        HashTable hashTable = new HashTable();
        hashTable.frequency(message);
        hashTable.display();
    }
}
