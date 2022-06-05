
import java.util.Scanner;

class Armstrong_1{
    static void findArmstrong(int low, int high)
    {
        for (int i = low + 1; i < high; ++i)
        {
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }
            if (pow_sum == i)
                System.out.print(i + " ");
        }
    }


    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        findArmstrong(num1, num2);
        System.out.println();
    }
}


