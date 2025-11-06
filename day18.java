//write program in java to find the product of two numbers
import java.util.Scanner;
public class day18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur first number");
        float a = sc.nextFloat();
        System.out.println("enter ur second number");
        float b = sc.nextFloat();
        float products = a*b;
        System.out.println(products);

    }
}