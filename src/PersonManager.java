import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> persons;

    public PersonManager(){
        persons = new ArrayList<>();
    }

    public Person getPerson(int id) {
        for (Person p : persons) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void addPerson(Person p) {
        if (!persons.contains(p)) {
            persons.add(p);
        }
    }
    public void removePerson(int id) {
        Person personToRemove = null;
        for (Person p : persons) {
            if (p.getId() == id) {
                personToRemove = p;
            }
        }
        if (personToRemove != null) {
            persons.remove(personToRemove);
        }
    }

    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }
        return students;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof Teacher) {
                teachers.add((Teacher) p);
            }
        }
        return teachers;
    }
    //ved stadig ikke hvad det her til for
    public void operation(String operationType) {

    }
}

