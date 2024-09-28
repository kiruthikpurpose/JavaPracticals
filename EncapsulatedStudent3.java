// 3. Create a class called `Student` that demonstrates the use of encapsulation. 
// The class should have three private fields: `name`, `id`, and `grade`. 
// Use public getter and setter methods to access and update these private fields. 
// In the main method, create an instance of the `Student` class, set values for the fields, 
// and then print the student's details using the getter methods.

public class EncapsulatedStudent3 {
    private String name;
    private int id;
    private String grade;

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter for grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        EncapsulatedStudent3 student = new EncapsulatedStudent3();
        student.setName("John");
        student.setId(123);
        student.setGrade("A");

        // Output the student's details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Grade: " + student.getGrade());
    }
}