package com.app.junitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Functinality is not working, ignoring the test in this class")
public class DisabledTests {

	@Test
	public void method1() {
		System.out.println("Executing method 1 of code class");
	}

	@Test
	@Disabled
	public void method2() {

		System.out.println("Eexcuting method 2 of code class");
	}

	@Test
	@Disabled
	public void method3() {

		System.out.println("Executing method 3 of code class");

	}

	@Test
	public void method4() {

		System.out.println("Executing method 4 of code class");

	}
}
