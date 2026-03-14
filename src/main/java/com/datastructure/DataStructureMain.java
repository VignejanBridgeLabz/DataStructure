package com.datastructure;

import java.util.Scanner;

/**
 * UC5 - Ability to delete the last
 *
 * Requirements:
     *   - element in the LinkedList
     *   - of sequence 56->30->70
     *   - Write popLast method
     *   - Note there is new tail
     *   - Final Sequence: 56->30
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class DataStructureMain {

    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure");
        
        System.out.println("\n=== UC5: Ability to delete the last ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        // TODO: Implement delete logic
        System.out.println("Delete operation for: " + name);
        scanner.close();
    }
}
