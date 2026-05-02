import java.util.Scanner;
public class storage_cloud{
    int acno;
    int space;
    double bill;
    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("ACCOUNT NUMBER : ");
        acno = in.nextInt();
        System.out.println("space bar : ");
        space = in.nextInt();
    }
    public void calculate(){
        if(space <= 15)
            bill = space * 15;
        else if (space <= 30)
            bill = 225 + (space - 15 ) * 13;
        else 
            bill = 420 + (space - 30) * 11;
    }
    public void display(){
        System.out.println("Account number : " + acno);
        System.out.println("Space : " + space);
        System.out.println("Bill : " + bill);
    }
    public static void main(String[] args){
        storage_cloud obj = new storage_cloud();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}