import java.util.Scanner;
//Question 4) Display sum of n Natural numbers.
public class SumOfnNaturalNumber {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number - ");
    int num = scan.nextInt();
    int i, sum = 0;
    //executes until the condition returns true.
    for(i = 0; i <= num; ++i)
    {
        //adding the value of i into sum variable
        sum = sum + i;
    }
        System.out.println("Sum of the Natural Number is - " + sum);
    }
}

