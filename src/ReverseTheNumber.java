import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[]args){
    //this statement will capture the user input
    Scanner scan = new Scanner(System.in);
    System.out.print("Input your number and press enter - ");
    int num = 0, reverse= 0; //initialize number
    //Captured input would be stored in number num.
    num = scan.nextInt();
    /*for loop : No initialization part as num is already initialized and no increment/decrement part as logic
    num=num/10 already decrements the value of num*/
    //for ( ; num!=0; num=num/10)
    for ( ; num!=0; )
    {
        //First, we find the remainder of the given number by using the modulus (%) operator.
        int remainder= num % 10;
        //Multiply the reverse variable by 10 and add the remainder into in.
        reverse = reverse *10 + remainder; //eg. reverse = 0 * 10 + 4 = 0 + 4 = 4
        //Divide the number by 10.
        num = num/10;
        //internally in backend now for next loop num. = number = 1234 / 10 =123
        //Repeat the above steps untill the next number becomes 0.
    }
    System.out.println("Reversed of specified number is = " + reverse);
    }
/*
    eg input num.1234
    Iteration 1:
    number = 1234
    remainder = 1234 % 10 = 4
    reverse = 0 * 10 + 4 = 0 + 4 = 4
    number = 1234 / 10 = 123

    Iteration 2:
    number = 123
    remainder = 123 % 10 = 3
    reverse = 4 * 10 + 3 = 40 + 3 = 43
    number = 123 / 10 = 12

    Iteration 3:
    number = 12
    remainder = 12 % 10 = 2
    reverse = 43 * 10 + 2 = 430 + 2 = 432
    number = 12 / 10 = 1

    Iteration 4:

    number = 1
    remainder = 1 % 10 = 1
    reverse = 432 * 10 + 1 = 4320 + 1 = 4321
    number = 1 / 10 = 0
*/

}
