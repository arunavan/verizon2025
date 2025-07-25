package day5.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testGetEmi() {
		
		Loan l=new Loan();
		assertEquals(5000,l.getEmi(60000));
		
		
		//fail("Not yet implemented");
	}
}
