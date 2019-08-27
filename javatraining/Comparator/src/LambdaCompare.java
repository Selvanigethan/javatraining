import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaCompare {

  public static void main(String[] args) {

      List<Student> students = Student.getStudent();
      System.out.println(students);

      Comparator<Student> StudentsAsc = Comparator.comparing(Student::getId);
      Collections.sort(students, StudentsAsc);
      System.out.println(students);

      Comparator<Student> StudentsDsc = Comparator.comparing(Student::getId).reversed();
      Collections.sort(students, StudentsDsc);
      System.out.println(students);

    }

  }
