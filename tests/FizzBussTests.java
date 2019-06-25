import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBussTests {
    @Test
    public void shouldreturnFizzifGetThree(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=3;
        Assertions.assertEquals("fizz",fizzBuss.of(3));
    }
    @Test
    public void shouldRetrunBuzzIfGetFive(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=3;
        Assertions.assertEquals("buzz",fizzBuss.of(3));
    }
}
