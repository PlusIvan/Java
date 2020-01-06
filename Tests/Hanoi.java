import java.util.LinkedList;
import java.lang.Math;

//Hanoi Game
public class Hanoi {

    public static void main(String[] args) {

        LinkedList tower_one = new LinkedList<Integer>();
        LinkedList tower_two = new LinkedList<Integer>();
        LinkedList tower_three = new LinkedList<Integer>();

        int disks = 3;
        if(disks < 3){
            System.out.println("Min disks 3");
            return;
        }
        for(int x = 1; x <= disks; x++){
            tower_one.add(disks-x+1);
        }

        int possible_moves = (int) (Math.pow(2, disks) - 1);
        int moves = 0;

while(possible_moves != moves){
    int piece = (int) tower_one.getLast();
    if(tower_three.size() == 0){
        tower_three.add(piece);
        tower_one.removeLast();
    }


    


}
        
      /*  for(int x = 1; x <= disks; x++){
            tower_one.add(disks-x+1);
        }
        System.out.println(tower_one.getLast()); 
        //System.out.println(tower_one); // 3

        while(true){



        }*/
       
        /*while(true){
            for (Object object : tower_one) {
               // System.out.println(object);
                

            }



break;

        }*/




    }
}