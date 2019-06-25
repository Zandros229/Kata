public class FizzBuss {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";

    public String of(int i) {
        if(isDivisibleByThree(i)&& isDivisibleByFive(i))
            return FIZZBUZZ;
        else if(isDivisibleByThree(i))
            return FIZZ;
        else if(isDivisibleByFive(i))
            return BUZZ;
        else
            return null;
    }

    private boolean isDivisibleByFive(int i) {
        return i%5==0;
    }

    private boolean isDivisibleByThree(int i) {
        return i%3==0;
    }
}
