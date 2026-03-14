package com.datastructure;

import java.util.Scanner;

/**
 * UC1 - then 56 to make 56 on top of the Stack
 *
 * Requirements:
     *   - Ability to peak and
     *   - pop from the Stack
     *   - till it is empty
     *   - 56->30->70
     *   - Use LinkedList to do the Stack
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class DataStructureMain {

    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure");
        
        System.out.println("\n=== UC1: then 56 to make 56 on top of the Stack ===");
        // Stack using LinkedList (LIFO)
        java.util.LinkedList<Integer> stack = new java.util.LinkedList<>();
        stack.add(70); stack.add(30); stack.add(56); // push order
        System.out.println("Stack created: " + stack);
        // Peek and Pop
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.getFirst() + " | Pop: " + stack.removeFirst());
        }
    }
}
