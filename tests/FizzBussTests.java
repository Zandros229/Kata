import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBussTests {
    @Test
    public void returnFizzifGetThree(){
        FizzBuss fizzBuss=new FizzBuss();
        int number=1;
        Assertions.assertEquals("fizz",fizzBuss.of(1));
    }
}
