import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  

      ArrayList names = new ArrayList<String>();


        while(names.size() != 5){
            System.out.println("Insert a name? "+names.size()+"/5\n");
            String name = myObj.nextLine();
            names.add(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(names.size()-i));
        }
       



    }



    
}
