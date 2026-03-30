/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switch_statements;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Switch_Statements {

    public static void main(String[] args) {
        /*
        Create a Application that demonstrates the diffrence between 
        Nested If-Else Statements and Switch Statements 
        
        Prompt the user to Enter a Number and Based on the Number 
        Entered, display the day. For example: 2 -- Tuesday
        */
        
        // Import Scanner Object
        Scanner kb = new Scanner(System.in);
        
        // Prompt the user to Enter a Value between 1 & 7
        System.out.println("Please Enter a Value between 1 & 7 to display a day>>> ");
        int userInput = kb.nextInt();
        
        // Implement nested if-else
        if(userInput == 1){
           System.out.println("Monday");
       }else if(userInput == 2){
            System.out.println("Tuesday");
       }else if(userInput == 3){
            System.out.println("Wednesday");
       }else if (userInput == 4){
            System.out.println("Thurday");
       }else if (userInput == 5){
            System.out.println("Friday, Party Time !!!");
       }else if (userInput == 6){
            System.out.println("Saturday,I wish it was Saturday");
       }else if (userInput == 7){
            System.out.println("Sunday, I wish it was Saturday.");
       }else{
            System.out.println("Invalid Entry");
       }
        
       // Switch Statement --> Used as an alternate to nested if-else
       switch(userInput){
           case 1:
               System.out.println("Monday");
               break; // Stops switch after a matching case has been found
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday, Almost to the End of the week");    
               break;
           case 4:
               System.out.println("Thursday");    
               break;
           case 5:
               System.out.println("Friday, It's Party Time!!!");    
               break;    
           case 6:
               System.out.println("Saturday");    
               break; 
           case 7:
               System.out.println("Sunday, I wish it was Saturday!!!");    
               break;
           default:
               System.out.println("Invalid Entry!");
               break;
               
       }
}
}
