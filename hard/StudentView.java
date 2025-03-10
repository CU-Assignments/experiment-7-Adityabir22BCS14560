import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController controller = new StudentController();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Marks: ");
        float marks = scanner.nextFloat();

        Student student = new Student(0, name, department, marks);
        controller.addStudent(student);
    }

    private void viewAllStudents() {
        List<Student> students = controller.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void updateStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter New Marks: ");
        float marks = scanner.nextFloat();

        controller.updateStudent(id, marks);
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        controller.deleteStudent(id);
    }
}
