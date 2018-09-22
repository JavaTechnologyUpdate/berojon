import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class hellojava extends Baseclass {

	@Test
	public void test()
	 {
		System.out.println("hello java ");
	}
	
	

	@Test
	public void tes2()
	 {
		System.out.println("hello java ");
	}
	
	@Test
	public void tes4()
	 {
		System.out.println("hello java ");
	}
	
	@Before
	public void tes3()
	 {
		System.out.println("hello java before ");
	}
	
	
	@After
	public void aftertest()
	 {
		System.out.println("hello java after test ");
	}
	
	
	@AfterClass
	public static void aftertestclass()
	 {
		System.out.println("hello java before class1 ");
	}
}

