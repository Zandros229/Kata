import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBussTests {
    @Test
    public void shouldreturnFizzifGetThree(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=3;
        Assertions.assertEquals("fizz",fizzBuss.of(number));
    }
    @Test
    public void shouldRetrunBuzzIfGetFive(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=5;
        Assertions.assertEquals("buzz",fizzBuss.of(number));
    }
    @Test
    public void shouldReturnFizzIfGetSix(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=6;
        Assertions.assertEquals("fizz",fizzBuss.of(number));
    }
    @Test
    public void shouldReturnFizzBuzzIfGetFifteen(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=15;
        Assertions.assertEquals("fizzbuzz",fizzBuss.of(number));
    }
    @Test
    public void shouldReturnNullIfGetSeven(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=7;
        Assertions.assertEquals(null,fizzBuss.of(number));
    }

}
