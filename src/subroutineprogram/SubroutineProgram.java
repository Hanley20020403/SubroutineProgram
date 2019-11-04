/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subroutineprogram;

import java.util.Scanner;

/**
 *
 * @author hahan0750
 */
public class SubroutineProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        int choice;
        
        while(true)
        {
           //deal with an invalide choice which is not 1/2/3/4
            while(true)
           {
                System.out.println("----------------------------------------------");
                System.out.println("1...Finding averages of numbers");
                System.out.println("2...Finding missing sides for triangles");
                System.out.println("3...Determining radius, diameter, circumference of circles");
                System.out.println("4...Determining the factorial of a number");
                System.out.println("5...Determining if a number is prime");
                System.out.println("6...Exit");
                System.out.println("Please enter your choice:");
                
                choice = keyedInput.nextInt();
                System.out.println();
                System.out.println("----------------------------------------------");
              
                
                //repeat the user menu, until 1/2/3/4/5/6 is selected.
                if(choice == 1 || choice==2 || choice==3 || choice == 4 || choice == 5 || choice == 6)
                {
                    break;
                }
           }
            
            //if 6 is selected, skip out of the while loop and exit the program
            if (choice == 6)
            {
                System.out.println("You have chosen to exit, Goodbye!");
                break;
            } 
            
            if (choice == 1)
            {  
                 findAverage();
            }
            else if (choice == 2)
            {
                findSide();
                
            }
            else if (choice == 3)
            {
                System.out.println("Please enter the radius ");
                double radius = keyedInput.nextDouble();
                findDiameterAndCircumference(radius);
            }
            else if (choice == 4)
            {
                int num;
                int factorial;
                System.out.println("Please enter an integer ");
                num  = keyedInput.nextInt(); 
                factorial = findFactorial(num);
                System.out.println(" the factorial of " + num + "is " + factorial);
            }
            else if (choice ==5)
            {
                int num;
                boolean flag;
                System.out.println("Please enter an integer ");
                num  = keyedInput.nextInt(); 
                flag = determinePrime(num);
                if(flag == true)
                {
                    System.out.println(num + " is a prime");
                }
                else
                {
                    System.out.println(num + " is not a prime");
                }
                
            }   
            
        } 
    }

     /* method Name: determinePrime
        Parameters: int
        Returns: boolean-
    */
    public static boolean determinePrime(int num)
        {   boolean flag = true;
            int result;
            if(num == 1)
            {
                flag = false;
                return flag;
            }
            for(int i = 2; i<num; i++)
            {
               result = num % i;
               //System.out.println("i = " + i);
               //System.out.println("result= " + result);
               if(result == 0)
               {
                   flag = false;
                   break;
               }
            }
            return flag;
        }  
    
     /* method Name: findFactorial
        Parameters: int
        Returns: int
    */
    public static int findFactorial(int num)
        {   int factorial = 1;
            for(int i = 2; i<=num; i++)
            {
                factorial = factorial * i;
            }
            return factorial;
        }        
    
     /* method Name: findDiameterAndCircumference
        Parameters: double
        Returns: no
    */
    public static void findDiameterAndCircumference(double radius)
    {   final double PI = 3.14;
        double diameter;
        double circumference;
        diameter = 2*radius;
        circumference = 2*radius*PI;
        System.out.println("diameter is " + diameter);
        System.out.println("circumference is " + circumference);
    }
    
    /*  method Name: findAverage
        Parameters: no
        Returns: no
    */
    public static void findAverage()
    {    Scanner keyedInput = new Scanner(System.in);
         double average;
         double [] nums = new double[3];    //a double array to store the numbers
         System.out.println("Please enter three numbers, then the program will display the average of numbers");
        
         nums[0] = keyedInput.nextDouble();
         nums[1] = keyedInput.nextDouble();
         nums[2] = keyedInput.nextDouble();
         average = (nums[0] + nums[1] +nums[2])/nums.length;  //calculate the average of numbers
         System.out.println("the average is " + average);
    }
    
     /* method Name: findSide
        Parameters: no
        Returns: no
    */
    public static void findSide()
    {
        Scanner keyedInput = new Scanner(System.in);
        double side1;   //one side of a right angle triangle
        double side2;   //the other side of a right angle triangle
        double side3;   //the missing side
        System.out.println("Please enter the length of two sides of a right angle triangle. The program will display the hypotenuse of the triangle ");
        
        side1 = keyedInput.nextDouble();
        side2 = keyedInput.nextDouble();
        side3 = Math.hypot(side1, side2);   
        System.out.println("The missing side of triangle is " + side3);    
    }
    
}
