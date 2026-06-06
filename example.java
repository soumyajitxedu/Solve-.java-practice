class example {
    String name;
    int age;
    example(String n, int a){
        name = n;
        age=a;
    
    }
    example(example e){
        System.out.println("copy constructor");
        name = e.name;
        age=e.age;

    }
    void display(){
        System.out.println("the value of : " + name + " " + age);

    }
    public static void main(String[] args) {
        example ex1 = new example("geeto", 15);
        example ex2 = new example(ex1);
        ex2.display();

    }
}
