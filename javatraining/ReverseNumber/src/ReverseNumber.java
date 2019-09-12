public class ReverseNumber {

     static int Reverse(int number){

        int reversed = 0;
        while(number>0){
            reversed = reversed*10;
            reversed = reversed+(number%10);
            number = number/10;
        }
        return reversed;
    }

    public static void main(String[] args) {

        int ReversedValue = Reverse(2578645);
        System.out.println(ReversedValue);
    }

}
