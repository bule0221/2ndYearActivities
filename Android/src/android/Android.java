package android;
import java.util.Scanner;

public class Android {

    static Scanner scan = new Scanner(System.in);
    static Employee one = new Employee();
    
    public static void main(String[] args) {
        int choice = 0;
        
        do{
            System.out.println("******************");
            System.out.println("1. Set value 2. Show Output 3. Quit");
            System.out.print("What do you want to do: ");
            choice = scan.nextInt();
            
            if(choice >= 3){
                choice = -1;
            }
            else {
                switch(choice){
                    case 1:
                        one.Setter();
                        break;
                    case 2 :
                        one.ShowOutput();
                        break;
                }   
            }
        }while(choice >= 0);
    }
}
