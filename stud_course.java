import java.util.HashMap;
import java.util.Map;

public class stud_course {
    private int semester;
    private Map<String, Integer> courseMarks;

    public stud_course(int semester) {
        this.semester = semester;
        this.courseMarks = new HashMap<>();
    }

    public void addCourse(String courseName, int marks) {
        courseMarks.put(courseName, marks);
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester: " + semester);
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Example usage
        stud_course semester1 = new stud_course(1);
        semester1.addCourse("DBMS", 85);
        semester1.addCourse("Computer Network", 78);
        semester1.addCourse("Java", 92);
        semester1.displayCoursesAndMarks();

        stud_course semester2 = new stud_course(2);
        semester2.addCourse("c#", 80);
        semester2.addCourse("Software Testing", 88);
        semester2.addCourse("Machine Learning", 75);
        semester2.displayCoursesAndMarks();
    }
}
