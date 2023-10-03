/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_queue;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class DE_queue {
    
static int MAX = 10;

private int[] data = new int [MAX];

private int front = -1;
private int rear = -1;


public void insertionBeginning(int item) throws Exception {
    
    if (rear == MAX-1) {
        throw new Exception("Queue is full");
        
        
    } if (front == -1) {
        front = rear = 0;
        data[front] = item;
        
    } else {
        if (front == 0) {
        throw new Exception("Cannot "+ "insert at the beginning" + "Queue is full.");
        
    }
       data[--front] = item; 
    }
    
}
    private void insertEnding(int item)throws Exception {
        if (rear==MAX-1) {
            throw new Exception("Queue is full");
            
        }
        data[++rear]= item;
        
 
        
    }
    
    public int delitionBEginning ()throws Exception {
        if (front== -1) {
            throw new Exception("Queue is empty");
            
        }
        int temp = data[front];
        if(front == rear) {
            front = rear = -1;
            
        } else {
            front++;
        }
        return temp;
    }
    public int delitionEnding () throws Exception {
      if (front== -1) {
            throw new Exception("Queue is empty");
            
        } 
      
      int temp = data[rear];
        if (front == rear) {
            front = rear = -1;
            
        } else {
            rear--;
        }
        return temp;
    }
    
    public void display () throws Exception {
        if (front==-1) {
            throw new Exception("Queue is empty");
            
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(data[i] +"->");
        }
        System.out.println("NULL");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DE_queue queue = new DE_queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Delete from the beginning");
            System.out.println("3. Insert at the end");
            System.out.println("4. Delete from the end");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            try {
            switch (choice) {
            case 1:
             System.out.print(" insert number beginning: ");
             int item1 = scanner.nextInt();
             queue.insertionBeginning(item1);
                 break;

            case 2:
            int deletedItem1 = queue.delitionBEginning();
            System.out.println("Deleted item from the beginning: " + deletedItem1);
                 break;

            case 3:
             System.out.print("Enter an item to insert at the end: ");
             int item2 = scanner.nextInt();
             queue.insertEnding(item2);
                 break;

             case 4:
             int deletedItem2 = queue.delitionEnding();
             System.out.println("Deleted item from the end: " + deletedItem2);
                 break;

             case 5:
             System.out.println("Queue contents:");
             queue.display();
                 break;

             case 6:
             System.out.println("Exiting the program.");
             scanner.close();
             System.exit(0);

                 default:
                  System.out.println("Invalid choice. Please enter a valid option.");
                 break;
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
         }
   }
  }
}
    
        
      
    

