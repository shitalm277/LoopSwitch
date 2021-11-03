import java.util.Scanner;
/*Question 7) Making Calculator using the switch statement(The program takes three inputs from the user:
one operator and 2 numbers. Based on the operator provided by the user, it performs the calculation on the numbers.
 Then the result is displayed on the screen.)*/

public class CalculateBasedonOperatorinSwitch {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first digit - ");
    int num1 = scan.nextInt();
    System.out.println("Enter the second digit - ");
    int num2 = scan.nextInt();
    System.out.println("Enter the operator from +, -, *, / - ");
    char operator = scan.next().charAt(0);

    switch(operator)
    {
        //performs addition between numbers
        case '+':
        System.out.println("Sum of " + num1 + " + " +num2 + " = " + (num1+num2));
        break;
        //performs substraction between numbers
        case '-':
        System.out.println("Substraction of " + num1 + " - " +num2 + " = " + (num1-num2));
        break;
        //performs multiplication between numbers
        case '*':
        System.out.println("Multiplication of " + num1 + " * " +num2 + " = " + (num1*num2));
        break;
        //performs division between numbers
        case '/':
        System.out.println("Division of " + num1 + " / " +num2 + " = " + (num1/num2));
        break;

        default:
            System.out.println("Invalid Operator!");
    }

    }
}
