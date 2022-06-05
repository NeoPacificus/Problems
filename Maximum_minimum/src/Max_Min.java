import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The largest number is " + Maximum(a,b,c));
        System.out.println("The smallest number is " + Minimum(a,b,c));

    }

    static int Minimum(int a, int b, int c) {
        int min = 0;
        if (a < b){
            if(a < c)
                min = a;
            else
                min = c;
        }
        else if (b < a){
            if (b < c)
                min = b;
            else
                min = c;
        }
        return min;
    }

    static int Maximum(int a,int b,int c){
        int max = 0;
        if (a > b){
            if(a > c)
                max = a;
            else
                max = c;
        }
        else if (b > a){
            if (b > c)
                max = b;
            else
                max = c;
        }
        return max;
    }

}
