/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package business;
import java.util.Scanner;

/**
 *
 * @author cindynguyen
 */
public class Business {
    public static String company = "Cindy's Cafe";
    public static String name = "Cindy";
    public static String [] menu = {"ice cream", "boba", "bread","cupcake","cake slice","macaroon","coffee","tea","donut","muffin"};
    public static int numGoods  = menu.length;
    
    
    public static void main(String[] args) throws InterruptedException {
        String decoLine = "\n***********************************\n";
        
        System.out.println(decoLine + "\n Welcome to " + company + "! \n");
        System.out.println ("  Hi! My name is " + name + " and this is my cafe! What's your name?");
            Scanner scnr = new Scanner (System.in);
            String userName = scnr.nextLine();
        
        System.out.println("\nHello, " + userName + "!");
        System.out.println(decoLine);
            Thread.sleep(1000);
            
        System.out.println("Hey " + userName + "! Today's menu is:");
        int numbered = 1;
        for (String n : menu){
            System.out.println(numbered + ") " + n);
            numbered++;
            Thread.sleep(200);
        }
        
        System.out.println("What would you like to order today " + userName + "? Please enter the amount you would like to order.");
            int items = scnr.nextInt(); 
            String[] order = new String[items];
        
        int itemChoice;
        for (int i = 0; i < items; i++){
            System.out.println("Please enter in the item number you would like: ");
            itemChoice = scnr.nextInt();
            while (itemChoice> 10 || itemChoice < 1){
                System.out.println("Please enter in a valid menu item.");
                itemChoice = scnr.nextInt();
            }
            order[i] = menu[itemChoice-1];
            
        }
        Thread.sleep(1000);
        System.out.print("Confirming your order: ");
        
        for(String n : order){
            if (n.equals(order[items-1])){ 
                System.out.print(n);
            }
            else {
                System.out.print(n + ", ");
            }
        }
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("Thank you " + userName +"! Your order will be out in 15 minutes.");
        
        
    }   
 }
    
