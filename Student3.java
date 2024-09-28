// 3. Student class with encapsulation

public class Student3 {
    private String name;
    private int id;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student3 student = new Student3();
        student.setName("John");
        student.setId(123);
        student.setGrade("A");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Grade: " + student.getGrade());
    }
}
