import java.util.Collections;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    List<Student> students= Student.getStudent();
    System.out.println(students);

    Collections.sort(students,new PrimitiveCompare());
    System.out.println(students);



  }

}
