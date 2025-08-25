//write program in java that input the length and breath of rectangle from the keyboard or user , 
//calculate and display the area and perimeter of the rectangle with suitable message


import java.util.Scanner;
class goat07
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter length  of rectangle");
            int a = sc.nextInt();
            System.out.println("enter breadth of rectangle");
            int b = sc.nextInt();
            int c = a * b;
            int d = 2 * (a + b);
            System.out.println("area of rectangle is :" + c);
            System.out.println("perimeter of rectangle is :" + d);
        }
    }

}

