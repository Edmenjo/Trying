import org.junit.Assert;
import org.junit.Test;

public class FizzB_ {



        @Test
        public void given_1_should_return_1(){
            Assert.assertEquals("1", new FizzB(1).fizzBuzzer());
        }

        @Test
        public void given_3_should_return_fizz(){
            Assert.assertEquals("fizz", new FizzB(3).fizzBuzzer());
        }

}
