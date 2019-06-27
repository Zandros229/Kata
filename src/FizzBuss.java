public class FizzBuss {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";
    public static final int FIFTEEN = 15;
    public static final int THREE = 3;
    public static final int FIVE = 5;

    public String of(int i) {
        switch (isDivisible(i)) {
            case FIFTEEN: {
                return FIZZBUZZ;
            }
            case THREE: {
                return FIZZ;
            }
            case FIVE:{
                return BUZZ;
            }
            default: {
                return null;
            }
        }
    }
    private int isDivisible(int i){
        if(isDivisibleByFifteen(i))
            return 15;
        else if(isDivisibleByThree(i))
            return 3;
        else if(isDivisibleByFive(i))
            return 5;
        else
            return 0;
    }

    private boolean isDivisibleByFifteen(int i) {
        return isDivisibleByThree(i)&& isDivisibleByFive(i);
    }

    private boolean isDivisibleByFive(int i) {
        return i%5==0;
    }

    private boolean isDivisibleByThree(int i) {
        return i%3==0;
    }
}
