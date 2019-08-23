public class lambda {
  public static void main(String[] args) {
    Printer p = () -> System.out.println("Hello");
    p.print();

  }
}
