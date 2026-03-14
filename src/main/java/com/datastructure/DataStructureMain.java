package com.datastructure;

import java.util.Scanner;

/**
 * UC8 - - Then Insert 40 to 30
 *
 * Requirements:
     *   - Final Sequence: 56->30->40->70
     *   - Ability to delete 40 from the Linked
     *   - List sequence of 56->30->40->70
     *   - and show the size of LinkedList is 3
     *   - Write Junit Test Case as demonstrated in class
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class DataStructureMain {

    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure");
        
        System.out.println("\n=== UC8: - Then Insert 40 to 30 ===");
        // LinkedList operations
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.add(56); list.add(30); list.add(70);
        System.out.println("LinkedList: " + list);
        // TODO: Implement specific LinkedList operation for UC8
        // Final Sequence: 56->30->40->70; Ability to delete 40 from the Linked
    }
}
