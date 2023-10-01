package Jenkins;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.foodordering.genericutility.BaseClass;

public class SampleTest extends BaseClass {

	@Test
	public void sampletest()
	{
		System.out.println("---sample run---");
	}
	@Test
	public void run()
	{
		System.out.println("   run2");
	}
}
