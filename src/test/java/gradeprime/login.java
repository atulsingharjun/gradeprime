package gradeprime;
import org.testng.annotations.Test;

import framework.base.configuration;

public class login extends configuration  {
	
	  //configuration config = new configuration();  if we can not extend then we use this
	 
	@Test
	public void validlogin() {
		 
		 driver.get(link);
	     System.out.println("Title is: " + driver.getTitle());
		
	}

}
