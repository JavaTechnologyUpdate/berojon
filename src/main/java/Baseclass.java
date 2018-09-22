

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Baseclass {

	
	@BeforeClass
	public static void beforetestlass()
	 {
		System.out.println("hello java before class ");
	}
	@AfterClass
	public static void aftertestclass()
	 {
		System.out.println("hello java before class2 ");
	}

}
