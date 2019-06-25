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
}
