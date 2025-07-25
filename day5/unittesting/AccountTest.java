package day5.unittesting;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
class AccountTest {
	@Test
	void testWithdrawl() {
		Account a=new Account();
		assertEquals(1000,a.withdrawl());
		//fail("Not yet implemented");
	}
	@Test
	@Disabled  //@Ignore
	void testDeposit() {
		Account a=new Account();
		assertEquals(1000,a.deposit());
		//fail("Not yet implemented");
	}
	@Test
	@RepeatedTest(5)
	void testGetBalance() {
		Account a=new Account();
		assertEquals(1000,a.getBalance());
		//fail("Not yet implemented");
	}
	@Test
	void testGetMessage() {
		Account a=new Account();
		assertEquals("HELLO",a.getMessage("hello"));
		assertNotNull(a.getBalance());
		//fail("Not yet implemented");
	}
}
