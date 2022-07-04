 package mavenAssignmt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Class2 extends Class1
{
	 String baseUrl="https://www.calculator.net/";
	String driverpath="D:\\selenium\\selenium workspace\\Maven_Assignment\\chromedriver.exe";
	
     WebDriver driver;
	 int result,n1,n2;
	 
	 public void launch() throws InterruptedException
	 {
		  System.out.println("launching chrome browser");
		  Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",driverPath);
			driver=new ChromeDriver();
			driver.get(baseUrl);
	 }
	 
	  public void constr(int a,int b )
		{
	       n1=a;
	       n2=b;
	    }
    public  void operation() throws InterruptedException
  {
	 
	    System.out.println("\n Operations");
	    
	    System.out.println("\n +,-,*,/");  
	    
		System.out.println("\nMultiplication:");
		result=n1*n2;
		Thread.sleep(2000);
		
		System.out.println("\n Division:");
		result=n1/n2;
		Thread.sleep(2000);
		
		System.out.println("\n Adition:");
		result=n1+n2;
		Thread.sleep(2000);
		
		System.out.println("\n Substrcation:");
		result=n1-n2;
		Thread.sleep(2000);
		
		System.out.println("\n Result");

 }

}
