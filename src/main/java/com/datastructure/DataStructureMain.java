package com.datastructure;

import java.util.Scanner;

/**
 * UC4 - Ability to delete the first
 *
 * Requirements:
     *   - element in the LinkedList
     *   - of sequence 56->30->70
     *   - Write pop method
     *   - Note there is new head
     *   - Final Sequence: 30->70
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class DataStructureMain {

    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure");
        
        System.out.println("\n=== UC4: Ability to delete the first ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        // TODO: Implement delete logic
        System.out.println("Delete operation for: " + name);
        scanner.close();
    }
}
