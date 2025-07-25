package day5.unittesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class LoanTest2 {
	Loan l;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(" before all");	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("at end of alltestcases");		}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(" set up each");
		 l=new Loan();                                      }
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("teardown each");
		l=null;	                                           }
	@Test
	void testGetEmi() {
		assertEquals(5000,l.getEmi(60000));					}
	@Test
	void testGetBalance() {
		assertEquals(10000.00,l.getBalance());	}
}