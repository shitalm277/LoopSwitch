import java.util.Scanner;
//Question 3) Program to check whether input number is Prime or not.
public class PrimeNumberOrNot {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter any number to check if it is a Prime number or not - ");
    int num = scan.nextInt();
    boolean flag = false;
    for (int i = 2; i<=num/2; i++)
    {
    //Condition for non-prime number
        if(num % i == 0)
        {
        flag = true;
        break;
        }
    }
    /* When flag variable is declared as false (above), so now when we say (!flag)
    in if condition below which means (!flag) = true,
    then it prints as a 'number' is a prime number. */
    if (!flag)
    {
     System.out.print(num + " is a prime number");
    }
    else
    {
     System.out.println(num + " is not a prime number");
    }
    }
}
