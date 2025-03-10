public class Student {
    private int studentID;
    private String name;
    private String department;
    private float marks;

    // Constructor
    public Student(int studentID, String name, String department, float marks) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID + ", Name: " + name + ", Department: " + department + ", Marks: " + marks;
    }
}
