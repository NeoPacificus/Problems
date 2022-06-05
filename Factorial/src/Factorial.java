import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factorial of number " + n + " is " + Factorial_number(n));
    }
    static int Factorial_number(int a){
        int result = 1;
        if (a == 1 || a == 0)
            return 1;


        while (a > 0){
            result = result * a;
            a--;
        }
        return result;
    }

}
