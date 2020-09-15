package android;
import java.util.Scanner;

public class Employee {
    
    static Scanner scan = new Scanner(System.in);    
    
    private String Fname = "";
    private String Lname = "";
    private int NumberOfHoursWork = 0;
    private int RatePerHour = 0;
    private int Overtime = 0;
    
    private int salary = 0;
    private int tax = 0;
    private int sss = 0;
    private int pagibig = 0;
    
    private int TotalDeduction = 0;
    private int TotalSalary = 0;
    
    //Output all
    public void ShowOutput() {
        System.out.println("Your name is " + this.getFullname());
        System.out.println("Number of hours work: " + this.getNumberOfHoursWork());
        System.out.println("Rate per hour: " + this.getRatePerHour());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Overtime pay: " + this.getOvertime());
        System.out.println("Tax: " + this.getTax());
        System.out.println("SSS: " + this.getSSS());
        System.out.println("Pag-ibig: " + this.getPagIbig());
        System.out.println("Total Deduction: " + this.getTotalDeduction());
        System.out.println("Total salary: " + this.getTotalSalary());
    }
    
    public void Setter() {
        setFname();
        setLname();
        setNumberOfHoursWork();
        setRatePerHour();
        setOvertime();
        System.out.println("Thank you");
    }
    
    //methods for name
    public String getFullname() {
        return this.Fname +" "+this.Lname;
    }
    public String setFname() {
        System.out.println("Enter your first name: ");
        return this.Fname = scan.nextLine();
    }
    
    public String setLname() {
        System.out.println("Enter your last name: ");
        return this.Lname = scan.nextLine();
    }
    
    //methods for Number of Hours Work
    public int getNumberOfHoursWork() {
        return this.NumberOfHoursWork;
    }
    
    public int setNumberOfHoursWork() {
        System.out.println("Enter your number of hours work: ");
        return this.NumberOfHoursWork = scan.nextInt();
    }
    
    //methods for Rate Per Hour
    public int getRatePerHour() {
        return this.RatePerHour;
    }
    
    public int setRatePerHour() {
        System.out.println("Enter your rate per hour: ");
        return this.RatePerHour = scan.nextInt();
    }
    
    //methods for overtime
    public int getOvertime() {
        int temp = (int)(RatePerHour * .20);
        this.Overtime = ((RatePerHour + temp)*Overtime);
        return this.Overtime;
    }
    
    public int setOvertime() {
        System.out.println("Enter your number of overtime: ");
        return this.Overtime = scan.nextInt();
    }
    //methods for tax, sss, pagibig, total deduction, total salary
    
    public int getSalary() {
       return this.salary = (RatePerHour * NumberOfHoursWork);
    }
    
    public int getTax() {
        return this.tax = (int)(this.salary * .10);
    }
    
    public int getSSS() {
        return this.sss= (int)(this.salary * .05);
    }
    
    public int getPagIbig() {
        return this.pagibig = (int)(this.salary * .03);
    }
    
    public int getTotalDeduction() {
        return this.TotalDeduction = this.tax + this.pagibig + this.sss;
    }
    
    public int getTotalSalary() {
        this.TotalSalary = this.salary + this.Overtime;
        return this.TotalSalary = this.TotalSalary - this.TotalDeduction;
    }
}
