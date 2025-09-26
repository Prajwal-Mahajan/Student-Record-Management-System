import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

// Getters and setters
 public int getId(){
    return id;
 }

 public void setId(int id){
    this.id = id;
 }

 public String getName(){
    return name;
 }

 public void setName(String name){
    this.name = name;
 }

 public double getMarks(){
   return marks;
 }

 public void setMarks(double marks){
    this.marks = marks;
 }

 @Override
 public String toString(){
    return "Student{"+
            "ID=" + id +
            ", Name='" + name + '\'' +
            ", Marks=" + marks +
            '}';

}
 }




//Main management system
public class StudentManagementSystem{
private static ArrayList<Student> students = new ArrayList<>();
private static Scanner sc = new Scanner(System.in);

public static void main(String[] args){
    int choice;
    do {
         System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice){
               case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
    } while(choice!=5);
    }
    //Add student
    private static void addStudent(){
      System.out.print("Enter ID:");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.print("Enter Name: ");
      String name = sc.nextLine();

      System.out.print("Enter Marks: ");
      double marks = sc.nextDouble();

      students.add(new Student(id, name, marks));
      System.out.println("Student added successfully!");
    }
    // view all students
    private static void viewStudents() {
      if(students.isEmpty()){
         System.out.println("No students found!");
      }
      else{
         System.out.println("\n--- Student Records ---");
         for (Student s : students){
            System.out.println(s);
         }
      }
    }
    // Update student details
     private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
      
        for(Student s: students){
         if (s.getId() == id){
            System.out.print("Enter new name: ");
            s.setName(sc.nextLine());
             System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());
             System.out.println(" Student updated successfully!");
                return;
         }
        }
        System.out.println("⚠ Student not found!");
      
      
      }
 // Delete student by ID
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
}
}