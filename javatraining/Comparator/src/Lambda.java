import java.util.List;
import java.util.stream.Collectors;

public class Lambda {


  public static void main(String[] args) {

    List<Student> students = Student.getStudent();
    System.out.println(students);

    students = Student.getStudent().stream().sorted((s1, s2) -> new Integer(s1.getId()).
      compareTo(s2.getId())).collect(Collectors.toList());
    System.out.println(students);


    students = Student.getStudent().stream().sorted((s1, s2) -> new Integer(-s1.getId()).
      compareTo(-s2.getId())).collect(Collectors.toList());
    System.out.println(students);


    }



}
