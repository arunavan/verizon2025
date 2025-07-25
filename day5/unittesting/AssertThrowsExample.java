package day5.unittesting;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertThrowsExample {
@Test
void exceptionTesting() {
	Loan l=new Loan();
Throwable exception = assertThrows(ArithmeticException.class, () -> {
l.divide();
});
assertEquals("/ by zero", exception.getMessage());
}
}