
import java.util.Scanner;

public class substring_applications
{

    
    public static void main(String[] args){
        System.out.println("enter your email id : ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String username = email.substring(0,email.indexOf(@));
        System.out.println(username);
        
    }

}