import java.util.Scanner;
//Question 1) 1.	Print any 10 numbers between given/user input range. For eg. Print numbers between 23-33
public class TenNumbersbetweenInputRange {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the start range number - ");
    int  num1 = scan.nextInt();
    System.out.print("Enter the end range number - ");
    int num2 = scan.nextInt();

    if(num1 + 10 == num2)
    {
        for (int i = num1; i <= num2; i++)
            System.out.println("Range of number : " +i);
    }
    else
    {
        System.out.println("The input number is out of range");
    }
    }
}
