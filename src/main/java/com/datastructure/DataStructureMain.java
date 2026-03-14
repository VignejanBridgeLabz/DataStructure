package com.datastructure;

import java.util.Scanner;

/**
 * UC1 - Ability to create Linked
 *
 * Requirements:
     *   - List by adding 30 and 56
     *   - to 70
     *   - Node with data 70 is First Created
     *   - Next 30 is added to 70
     *   - Finally 56 is added to 30
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class DataStructureMain {

    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure");
        
        System.out.println("\n=== UC1: Ability to create Linked ===");
        // LinkedList operations
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.add(56); list.add(30); list.add(70);
        System.out.println("LinkedList: " + list);
        // TODO: Implement specific LinkedList operation for UC1
        // List by adding 30 and 56; to 70
    }
}
