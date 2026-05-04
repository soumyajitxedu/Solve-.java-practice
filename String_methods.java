public class String_methods
{

    public static void main(String[] args) {
        String name = "          Soumyajit Das";
        //index method 
        int indexic = name.indexOf(" ");
        //last index
        int lastindexic = name.lastIndexOf("a");
        System.out.println(indexic);

        System.out.println(lastindexic);



        //name = name.toUpperCase();

        name = name.toLowerCase();

        name = name.trim();
        name = name.replace("u", "x");
        name = name.replace("o","e");
        if(name.contains(" ")){
            System.out.println("yes its contains space");

        }
        else
            System.out.println("no");
    
    
    
    

        System.out.println(name);

    }

}