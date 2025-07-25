package day5.unittesting;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AccountTest.class, AssertThrowsExample.class, LoanTest.class, LoanTest2.class })
public class AllTests {

}
