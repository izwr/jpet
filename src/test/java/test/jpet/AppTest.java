package test.jpet;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	WebDriver driver;
	String baseUrl;
    public AppTest( String testName )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhil\\Downloads\\chromedriver.exe");
    	driver = new ChromeDriver();
    	baseUrl = "https://petstore.octoperf.com/";
    }
    @BeforeTest
    public void prepare() {
    	driver.get(baseUrl);
    }
    @Test
	public void testApp()
    {
       String title = driver.getTitle();
       String expTitle = "JPetStore Demo";
       Assert.assertEquals(title, expTitle);
    } 
    @AfterTest
    public void completed() {
    	driver.close();
    }
}
