
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        printStudentsWithShortnames();
        filterWithStream();
        processWithoutStream();
        processWithStream();
    }

    static void filterWithStream() {
        List<Student> students = Student.getStudents().stream().filter(s -> s.getName().length() <= 6).collect(Collectors.toList());
        System.out.println(students.toString());
    }


    public static void printStudentsWithShortnames() {

        List<Student> students = Student.getStudents();
        for (Student student : students) {
            if (student.getName().length() <= 6) {
                System.out.println(student.getName());
            }
        }
    }

    static void processWithoutStream() {
        Student.getStudents().stream().map(s -> new Student("Dr" + s.getName(), s.getId())).collect(Collectors.toList()).forEach(s -> System.out.println(s.getName()));
    }

    static void processWithStream() {
        List<Student> students = Student.getStudents().stream().map(s -> new Student("Dr" + s.getName(), s.getId())).collect(Collectors.toList());
        System.out.println(students);
    }
}
