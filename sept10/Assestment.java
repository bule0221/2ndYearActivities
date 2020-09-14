package assestment;
import java.util.Scanner;

public class Assestment {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        Car car = new Car();
        
        System.out.println("Initializing new Car ");
        car.TellMeAll();
        
        int Choice = 0;
        
        do{
            System.out.println("***********************");
            System.out.println("What do you want to do? ");
            System.out.println("1. Tell me all about my car  2. Set car color  3. Set car size  4. Set car number of doors  5. Set car weight  6. set car number of passangers  7. Quit.");
            Choice = scan.nextInt();
            if(Choice >= 7) {
                Choice = -1;
            }
            else {
                switch(Choice) {
                    case 1 -> car.TellMeAll();
                    case 2 -> car.setColor();
                    case 3 -> car.setSize();
                    case 4 -> car.setNumberOfDoors();
                    case 5 -> car.setWeight();
                    case 6 -> car.setNumberOfPassanger();
                }
            }
        }while(Choice >= 0);
    }    
}
