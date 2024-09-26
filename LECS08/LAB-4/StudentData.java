import java.util.Scanner;
      class Student {
    String name;
    int age;
    String address;
    Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }
     void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
	this.address="not given";
    }
    void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
      void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println();
    }
}

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        Student[] students = new Student[3];
        try {
            for (int i = 0; i < 3; i++) {
                students[i] = new Student();  // Initialize each student object
                System.out.println("Enter name, age, and address for student " + (i + 1) + ":");
                String name = scanner.nextLine();
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume newline character
                String address = scanner.nextLine();
		
		if(address.equals(null) || address.equals(""))
		{
			 students[i].setInfo(name, age);
		}
		else{
                	students[i].setInfo(name, age, address);
		}
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("Student" + (i + 1) + " Details:");
                students[i].display();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception: Too many students!");
        }
        scanner.close();
    }
}
