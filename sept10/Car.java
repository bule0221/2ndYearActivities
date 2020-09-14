package assestment;
import java.util.Scanner;

public class Car {

    static Scanner scan = new Scanner(System.in);
    
//Attributes
    private String Color = "";
    private String Size = "";
    private int NumberOfDoors = 0;
    private double Weight = 0.00;
    private int NumberOfPassanger = 0;
    
    //Getter Methods
    
    public void TellMeAll() {
        System.out.println("Car color = " + getColor());
        System.out.println("Car size = " + getSize());
        System.out.println("Car number of doors = " + getNumberOfDoors());
        System.out.println("Car weight = " + getWeight());
        System.out.println("Car number passanger fit in the car = " + getNumberOfPassanger());
    }
    
    public String getColor() {
        return this.Color;
    }
    
    public String getSize() {
        return this.Size;
    }
    
    public int getNumberOfDoors() {
        return this.NumberOfDoors;
    }
    
    public double getWeight() {
        return this.Weight;
    }
    
    public int getNumberOfPassanger() {
        return this.NumberOfPassanger;
    }
    
    //Setter Methods
    public String setColor() {
        System.out.println("Enter your new car color: ");
        String newColor = scan.nextLine();
        this.Color = newColor;
        return this.Color;
    }
    
    public String setSize() {
        System.out.println("Enter your new car size. ");
        System.out.println("SUV, PUV, Truck: ");
        String newSize = scan.nextLine();
        this.Size = newSize;
        return this.Size;
    }
    
    public int setNumberOfDoors() {
        System.out.println("Enter your new car number of doors: ");
        int newNumberOfDoors = scan.nextInt();
        this.NumberOfDoors = newNumberOfDoors;
        return this.NumberOfDoors;
    }
    
    public double setWeight() {
        System.out.println("Enter your new car weight: ");
        double newWeight = scan.nextDouble();
        this.Weight = newWeight;
        return this.Weight;
    }
    
    public int setNumberOfPassanger() {
        System.out.println("Enter your new car capacity of passanger: ");
        int newCapacity = scan.nextInt();
        this.NumberOfPassanger = newCapacity;
        return this.NumberOfPassanger;
    }
    
    
}
