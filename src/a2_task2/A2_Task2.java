/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2_task2;

import java.util.*;
/**
 * Get the number from the user and evaluate the expression as given in question, 
 * main method is taking in the number from user, 
 * sequence() will generate the sequence according to the question given.
 * @author VinayaSaiD
 */
public class A2_Task2 {
    // To take in the number from the user
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Taking the input from the user
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        //calling the method to generate the sequence
        sequence(num);
    }
    public static void sequence(int num){
    
    int sum = 5; //as sequence(1) = 5
    int presentSum;
    int previousSum=2; //as sequence(0) = 2
    if (num <0) {
        sum=-10; // result -10 for all negative numbers
    }
    else if (num==0){
        sum=2;  // return 2 for num = 0 
    }
    else if (num==1){
        sum=5;  // return 5 for num = 1
    }
    // for all other numbers compute the value
    else{
        for(int i=2; i<=num; i++) {
           presentSum=sum; // (n-1) sum
           sum = presentSum +3*previousSum + 2*i;
           previousSum=presentSum; // (n-2) sum
        }    
    }
    System.out.println("Value of expression is "+(sum));
}
}