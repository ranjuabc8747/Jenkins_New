package Jenkins;

import org.testng.annotations.Test;

public class Validation {
@Test(groups="regression")
public void build1()
{
	System.out.println("abc");
}
@Test(groups="smoke")
public void build2()
{
	System.out.println("123");
}
}
