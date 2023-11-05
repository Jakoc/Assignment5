import java.util.List;

public class test {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();

        Student student = new Student(105, "Jacob Andersen", "elevmail@mailer.com", "CS");
        student.addGrade(new GradeInfo("Math", 90));
        student.addGrade(new GradeInfo("Science", 85));
        student.addGrade(new GradeInfo("History", 80));

        Teacher teacher = new Teacher(202, "Lars Fulde Løkke ", "lærermail@mailer.com");
        teacher.addSubject("Programming");

        personManager.addPerson(student);
        personManager.addPerson(teacher);


        List<Person> allPersons = personManager.getAllPersons();
        List<Student> allStudents = personManager.getAllStudents();
        List<Teacher> allTeachers = personManager.getAllTeachers();

        //printer opgave 4-5
        System.out.println("All Persons:");
        for (Person p : allPersons) {
            System.out.println(p.getName());
        }

        System.out.println("\nAll Students:");
        for (Student s : allStudents) {
            System.out.println(s.getName());
        }

        System.out.println("\nAll Teachers:");
        for (Teacher t : allTeachers) {
            System.out.println(t.getName());
            System.out.println(" ");
        }

        //print opgave 2
        System.out.printf("%-10s%-30s%-30s%-10s%-20s%n",
                "ID", "NAME", "EMAIL", "INITIALS", "MAIN SUBJECT");

        System.out.println(teacher);
        System.out.println(" ");

        //printer opgave 3
        System.out.printf("%-10s%-30s%-30s%-15s%-10s%n",
                "ID", "NAME", "EMAIL", "EDUCATION", "AVG.GRADE");
        System.out.println(student);
        System.out.println(" ");

    }
}


