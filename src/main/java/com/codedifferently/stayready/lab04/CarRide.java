package com.codedifferently.stayready.lab04;
import java.util.Scanner;  // Import the Scanner class


public class CarRide {

    public String areWeThereYet(String answer){
        System.out.print("Are we there yet?"); //asks question
        Scanner input = new Scanner(System.in);  // create a Scanner object
        answer = input.nextLine();  //take in answer
       String response="";
        while(!answer.equals("Yes")){
            System.out.print("Are we there yet?");//ask the question again
            response="Are we there yet?";
            answer = input.nextLine();  //take in answer again
            //this loop will continue until answer = Yes
            if(answer.equals("Yes")){
                System.out.print("Good");
                response="Good";
            }
        }

        return response;

    }



}
