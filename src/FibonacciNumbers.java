import java.util.Scanner;
//Question 2) Print the sequence 1 1 2 3 5 8 13 21(Fibonacci number) Limitation is n.
public class FibonacciNumbers {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("How many number you want in the sequence - ");
    int count = scan.nextInt();
    int num1 = 0, num2 = 1;
    System.out.println("Fibonacci Series of " +count+ " number :");

    for(int i = 1; i <= count; i++){
        System.out.print(num1+ " ");
        /*On each iteration, we are assigning second number
        *to the first number and assigning the sum of last two
        * numbers to the second number
         */
        int sumOfPrevTwo = num1 + num2;
        num1= num2;
        num2 = sumOfPrevTwo;
        }
    }
}
