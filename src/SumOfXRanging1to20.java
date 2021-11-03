import java.util.Scanner;
// Question 8 ) WAP that prints the sum of x ranging from 1 to 20
public class SumOfXRanging1to20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting range number = ");
        int num1 = scan.nextInt();
        System.out.print("Enter the ending  number = ");
        int num2 = scan.nextInt();
        int sumx = 0;

        if ((num1 >= 1) && (num1 <= num2) && (num2 < 20))
        {
            for (int i = num1; i <= num2; ++i)
            {
             //adding the value of i into sum variable.
             sumx = sumx +i;
            }
            System.out.println("Sum of x number is = " + sumx);
        }
        else
        {
            System.out.println("The input number is out of range.");
        }
    }
}