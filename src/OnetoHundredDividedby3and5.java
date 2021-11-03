import java.util.Scanner;
//Question 9). WAP to print the numbers between 1 to 100  which can be divided by 3 and 5 separately.
public class OnetoHundredDividedby3and5 {
    public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Divided by 3 - ");
    int i = scan.nextInt();
    for(i=1; i<=100; i++)
    {
        if(i % 3 == 0)
        {
            System.out.println(i + ",");
        }
    }
    System.out.println();
    System.out.println("Divided by 5 - ");
    for (i=1; i <=100; i++)
    {
        if(i % 5 == 0)
        {
            System.out.println(i + ",");

        }
    }
    }
}
