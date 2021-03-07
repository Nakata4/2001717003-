package project;

import java.io.*;
import java.util.Scanner;

public class RatingsTest
{
    public static void main(String[] args) throws IOException
    {  

        try
        {
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print( "Please enter your rating: " );
         int numOfTests = keyboard.nextInt();

          double sumOfAllGrades = 0;//the sumOfAllGrades
         
          for( int i=0; i < numOfTests; i++ )
         
          {
         
              System.out.print( "Enter the your grade " +(i+1)+ ": " );
              double grade = keyboard.nextDouble();
              
              sumOfAllGrades += grade;
          }
         

          double average = sumOfAllGrades/numOfTests;
          System.out.println("The average is: " + average);

         
        }
        
        catch( Exception e )
        {
          e.printStackTrace();
        }
       
    }


}