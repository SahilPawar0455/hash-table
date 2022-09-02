package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash Table");
        String message = "To be or Not to be";
        HashTable hashTable = new HashTable();
        hashTable.frequency(message);
        hashTable.display();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable hashTable1 = new HashTable();
        hashTable1.frequency(paragraph);
        hashTable1.display();
    }
}
