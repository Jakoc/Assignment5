import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu {
    private PersonManager personManager;

    public MainMenu(PersonManager personManager) {
        super("Main Menu", "Add Student", "Add Teacher", "Show all");
        this.personManager = personManager;
    }

    @Override
    protected void doAction(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Adding a new student...");
                System.out.print("Enter ID between 1-99: ");
                int studentId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String studentName = scanner.nextLine();
                System.out.print("Enter Email: ");
                String studentEmail = scanner.nextLine();
                System.out.print("Enter Education: ");
                String education = scanner.nextLine();
                personManager.addPerson(new Student(studentId, studentName, studentEmail, education));
                System.out.println("Student added!");
                break;
            case 2:
                System.out.println("Adding a new teacher...");
                System.out.print("Enter ID between 100-199: ");
                int teacherId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String teacherName = scanner.nextLine();
                System.out.print("Enter Email: ");
                String teacherEmail = scanner.nextLine();
                System.out.print("Enter Main Subject: ");
                String mainSubject = scanner.nextLine();
                personManager.addPerson(new Teacher(teacherId, teacherName, teacherEmail));
                System.out.println("Teacher added!");
                break;
            case 3:
                System.out.println("Showing all persons:");
                List<Person> allPersons = personManager.getAllPersons();
                for (Person p : allPersons) {
                    if (p instanceof Student) {
                        Student student = (Student) p;
                        System.out.println("Student - ID: " + student.getId() + ", Name: " + student.getName() + ", Education: " + student.getEducation());
                    } else if (p instanceof Teacher) {
                        Teacher teacher = (Teacher) p;
                        System.out.println("Teacher - ID: " + teacher.getId() + ", Name: " + teacher.getName() + ", Main Subject: " + teacher.getSubjects());
                    } else {
                        System.out.println("Person - ID: " + p.getId() + ", Name: " + p.getName());
                    }
                }
                break;
            case 0:
                System.out.println("Exiting the menu.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        MainMenu mainMenu = new MainMenu(personManager);
        mainMenu.run();

    }
}

