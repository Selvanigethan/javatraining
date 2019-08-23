public class Application {
  public static void main(String[] args) {
    MathX m = new MathX()
      {
       public int power(int x)
        {
         x=x*x;
         return x;
        }
      };
    System.out.println(m.power(5));


    MathX m2 = (int x)->x*x;
    System.out.println(m2.power(6));
  }
}
