import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private String[] subject;

    private String initials;
    private double salary;

    private List<String> subjects;



    public Teacher(int id, String name, String email){
        super(id, name, email);
        subjects = new ArrayList<>();

    }

    public String[] getSubjects(){
        return subject;
    }

    public String getInitials(){
        return initials;
    }
    public double getSalary(){
        return salary;
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        String mainSubject = (subjects.isEmpty()) ? "N/A" : subjects.get(0);

        String[] nameParts = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }

        return String.format("%-10s%-30s%-30s%-10s%-20s", id, name, email, initials, mainSubject);
    }
}
