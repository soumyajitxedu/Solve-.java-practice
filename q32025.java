
import java.util.*;

class q32025 {

    int accountNumber, storageSpace;
    double bill;
    Scanner scanner = new Scanner(System.in);

    void accept() {
        System.out.println("Enter The Account number");
        accountNumber = scanner.nextInt();
        System.out.println("Enter the storage space");
        storageSpace = scanner.nextInt();
    }

    void Calculate() {
        if (storageSpace <= 15) {
            bill = storageSpace * 15; 
        }else if (storageSpace > 15 && storageSpace <= 30) {
            bill = 15 * 15 + (storageSpace - 15) * 13; 
        }else {
            bill = 15 * 15 + 15 * 13 + (storageSpace - 30) * 11;
        }
    }

    void display() {
        System.out.println("account number = " + accountNumber);
        System.out.println("Storage space = " + storageSpace);
        System.out.println("Bill = " + bill);
    }

    public static void main(String[] args) {
        q32025 c = new q32025();
        c.accept();
        c.Calculate();
        c.display();
        c.scanner.close();
    }
}
