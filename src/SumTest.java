import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {



    @Test
    public void testLambdaAdd() {

        Sum.LambdaSum lambdaSum = (a, b) -> a + b;

        assertEquals(3, lambdaSum.add(1, 2));
        assertEquals(7, lambdaSum.add(3, 4));

    }

}