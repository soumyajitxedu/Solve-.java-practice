// Concept 1: User-Defined Methods with Parameters//

// Instruction: Create a blueprint class that contains a method to calculate the total cost of items. Use parameters so that the method can accept different quantities and prices every time it is called. In your main method, create an object and call this function.

class calculator {
    void total (int items, double price) {
        double totalcost = items * price;
        System.out.println("the total cost is : " + totalcost);
    }
    public static void main(String[] args){
        calculator calc = new calculator();
        calc.total(5,63.38);

    }
}