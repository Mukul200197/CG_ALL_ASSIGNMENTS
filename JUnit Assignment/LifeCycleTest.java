import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("SetUp Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Set Ups");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	void test() {
		System.out.println("Life Cycle of JUnit");
	}

}
