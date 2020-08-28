import java.util.*;

class ObjectHuman {

    static Scanner read = new Scanner(System.in);
    
    public static class Student {
        //attributes
        int age;
        String name;
        String gender;
        String section;
        int yearLevel;

        //method
        public void sayInfo() {
            System.out.printf("Hi! my name is %s, I am %d years old, I'm a %s student from the section %s and I am currently %d year level.",this.name,this.age,this.gender,this.section,this.yearLevel);
        }

        public int birthday(int age) {
            return this.age+=1;
        }

        public int movingUp(int yearLevel) {
            return this.yearLevel+=1;
        }
 
    }
    public static void main(String[] args) {
        
        Student one = new Student();
        
        System.out.println("What is your name?: ");
        one.name = read.nextLine();

        System.out.println("What's your gender?: ");
        one.gender = read.nextLine();

        System.out.println("What's your section?: ");
        one.section = read.nextLine();

        System.out.println("How old are you?: ");
        one.age = read.nextInt();
 
        System.out.println("From what year are you?: ");
        one.yearLevel = read.nextInt();

        System.out.println("saying your info...");
        one.sayInfo();

        System.out.println("\n\nTODAY IS YOUR BIRTHDAY!");
        System.out.println("Your age is now: "+one.birthday(one.age));

        System.out.println("\nTHAT ALSO MEANS YOU'RE MOVING UP!");
        System.out.println("Your year level is now: "+one.movingUp(one.yearLevel));
    }
}
