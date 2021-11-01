package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void doLogin() {

		System.out.println("Executing login test");

	}

	@Test
	public void doUserReg() {

		AssertJUnit.fail("Executing registration test");

	}

	@Test
	public void isSkip() {

		throw new SkipException("Skipping test");

	}

}
