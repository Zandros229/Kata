public class FizzBuss {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String of(int i) {
        if(isDivisibleByThree(i)&&(i%5==0))
            return "fizzbuzz";
        else if(isDivisibleByThree(i))
            return FIZZ;
        else
            return BUZZ;
    }

    private boolean isDivisibleByThree(int i) {
        return i%3==0;
    }
}
