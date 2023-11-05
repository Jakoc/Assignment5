import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<GradeInfo> gradeReport;
    private String education;

    public Student(int id, String name, String email, String education){
        super(id, name, email);
        this.education = education;
        this.gradeReport = new ArrayList<>();

    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade(){
        if (gradeReport.isEmpty()){
            return 0.0;
        }

        int total = 0;
        for (GradeInfo grade : gradeReport){
            total += grade.getGrade();
        }
        return (double) total / gradeReport.size();
    }

    public int getGrade(String subject){
        for (GradeInfo grade : gradeReport) {
            if (grade.getSubject().equalsIgnoreCase(subject)){
                return grade.getGrade();
            }
        }
        return -1;
    }

    public void addGrade(GradeInfo grade){
        gradeReport.add(grade);
    }
    @Override
    public String toString() {
        return String.format("%-10s%-30s%-30s%-15s%-10.1f",
                id, name, email, education, getAverageGrade());
    }
}
