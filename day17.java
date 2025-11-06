//random number generator
import java.util.Random;
public class day17
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(100); // generates a random number between 0 and 99
        System.out.println("Random Number: " + randomNum);
    }
}