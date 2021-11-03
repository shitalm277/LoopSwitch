import java.util.Scanner;
//Question 10) Java Program to Print Multiplication Table for any Number
public class MultiplicationTable {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number - ");
        int num = scan.nextInt();
        //initialization of i from 1 as table need to start from 1
        for (int i = 1; i <= 12; i++)
        {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
