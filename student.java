import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class student {
    private String name;
    private LocalDate dateOfBirth;

    public student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void displayAge() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        System.out.println("You are " + period.getYears() + " years old.");
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        student student = new student("John Doe", "1997-12-25");
        student.displayName();
        student.displayAge();
    }
}