package com.bridgelabz;
import java.util.Arrays;
import java.util.Hashtable;
public class HashTable {
    public Hashtable<String,Integer> hashtable = new Hashtable<>();
    public void frequency(String sentances){
        String[] meassagesArray = sentances.toLowerCase().split(" ");
        System.out.println(Arrays.stream(meassagesArray).toList());
        for (String word : meassagesArray) {
            Integer valve  = hashtable.get(word);
            if (valve == null){
                valve = 1;
            }else {
                valve = valve + 1;
            }
            hashtable.put(word,valve);
        }
    }
    public void display(){
        System.out.println(hashtable.toString());
    }
}
