package com.datastructure;

import java.util.Scanner;

/**
 * UC3 - then 70 to make 56 on top of the Stack
 *
 * Requirements:
     *   - Ability to dequeue
     *   - from the beginning
     *   - Use LinkedList to do the
     *   - Queue Operations
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class DataStructureMain {

    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure");
        
        System.out.println("\n=== UC3: then 70 to make 56 on top of the Stack ===");
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
