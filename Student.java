
public class Student {
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Course: " + course);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Student student1 = new Student("Saurabh Kawade", 25, "Java Development");
        student1.displayStudentInfo();
    }
}
