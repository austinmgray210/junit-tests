import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grade;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grades) {
        grade.add(grades);

    }

    public double getGradeAverage() {
        double sum = 0;
        for (double grade : grade) {
            sum += grade;
        }
        return sum / grade.size();
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Austin");
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(77);
        s1.addGrade(65);
        System.out.println(s1.getGradeAverage());
        System.out.println(s1.grade);

        Student s2 = new Student(2, "David");
        s2.addGrade(100);
        s2.addGrade(99);
        s2.addGrade(60);
        s2.addGrade(90);
        s2.addGrade(73);
        System.out.println(s2.getGradeAverage());

    }




}
