/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Home pc
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        char answer;
        char answerTwo;
        answer = 'Y';
        answer = 'N';
        answerTwo = 'Y';
        answerTwo = 'N';
        
        String input;
        String name;
        
        System.out.println(" What is your name. ??? ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        //int stringSize = name.Length()
       
        
        
        
        System.out.println(" Would you to answer some questions ?? Y or N ");
        
        input = keyboard.nextLine();
        answer = input.charAt(0);
        
        if(answer=='Y'||answer=='y')
        {
            System.out.println(" Thats great thank you. !!");
                System.out.println(" Do you like your classe's so far. Y or N ???");
                
                input = keyboard.nextLine();
                answerTwo = input.charAt(0);
        }     
                if(answerTwo=='Y'||answerTwo=='y')
                {
                    System.out.println(" Thats great.Thank you for your time. ");
                        System.out.println("Your answers where " + answer + answerTwo + " Your name is " + name);
                            System.exit(0);
                }                 
        
        else
            {            
            System.out.println(" Thank you for your time. ");
                System.out.println("Your answers where ");
                System.out.println(answer);
                System.out.println(answerTwo);
                System.out.println("Your name is " + name);
                
                
            }
       

            
       
    }
}
          
