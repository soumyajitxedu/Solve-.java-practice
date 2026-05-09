
import java.util.Scanner;

public class loop_applications_program
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weigths;
        double new_weigths;
        int choice;
        System.out.println("__ weigth converter __");
        System.out.println("1: gram convert into kgs ");
        System.out.println("2: convert kgs into grams");
        choice = scanner.nextInt();



        if(choice == 1){
            System.out.println("enter your weigths");
            weigths = scanner.nextDouble();
            new_weigths = weigths * 1000;
            System.out.println("the final weigth is converted is : " + new_weigths + "grams");


        }
        if(choice == 2){
            System.out.println("enter your weigth");
            weigths = scanner.nextDouble();
            new_weigths = weigths / 1000;
            System.out.println("the final weigth is converted is : " + new_weigths + "kgs");


        }


    }
}