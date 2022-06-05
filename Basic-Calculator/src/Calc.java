import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1 = op.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = op.nextDouble();
        System.out.println("Enter any operation from + , - , * , / : ");
        String operator = op.next();
        if(operator.equals("+") ) {
            System.out.print("Addition = " + n1 + n2);
        }
        if(operator.equals("-") ) {
            System.out.print("Subtraction = " + (n1 - n2));
        }
        if(operator.equals("*") ) {
            System.out.print("Multiplication = " + n1 * n2);
        }
        if(operator.equals("/") ) {
            System.out.print("Division = " + n1 / n2);
        }

    }
}
