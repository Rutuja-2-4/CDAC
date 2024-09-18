//4)	Build a class Student which contains details about the Student and compile and run its instance.
class Student {
    String name;
    int id;
    int age;
    String branch;
    public Student(String name, int id, int age, String branch) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.branch = branch;
    }    
    public void printRecord() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Age: " + age);
        System.out.println("Student Branch: " + branch);
    }
}
public class Program4 {
    public static void main(String[] args) {
        Student s = new Student("Rutuja", 120, 20, "CSE");
        s.printRecord();
    }
}
