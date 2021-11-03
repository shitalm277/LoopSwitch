import java.util.Scanner;
//Question 5) Finding factorial of a number entered by user

/* factorial, in mathematics, the product of all positive integers less than or equal to a given positive integer
and denoted by that integer and an exclamation point.Thus, factorial seven is written 7!,meaning 1 × 2 × 3 × 4 × 5 × 6 × 7.
Factorial zero is defined as equal to 1.
 */

/*The factorial of a integer n, denoted by n!, is the product of all positive integers less than or equal to n.
Factorial does not exist for negative numbers and factorial of 0 is 1.
Its most basic occurrence is the fact that there are n! ways to arrange n distinct objects into a sequence.
N! = 1*2*3*4*.... *(N-2)*(N-1)*N
*/

public class FactorialOfaNumber {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number - ");
    int num, factorial = 1, i;
    num = scan.nextInt();
    for(i = 1; i<= num; i++)
    {
        factorial = factorial * i;
    }

    if (num<0)
    {
        System.out.println("Cannot find the Factorial of Negative number.");

    }
    else
    {
        //this sign ! is the sign of factorial
        System.out.println("! or factorial of " + num + " = " + factorial);
    }

    /*
    switch (num<0)// invalid scenario
    {
        case 1: System.out.print("this is invalid number");
        break;

        default:

            //this sign ! is the sign of factorial
            System.out.println("! or factorial of " + num + "=" + factorial);

    }*/
    }
}
