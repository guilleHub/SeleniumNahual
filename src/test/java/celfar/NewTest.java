package celfar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	public String baseUrl;
	
  @Test
  public void f() {
	  
	  driver.get(baseUrl);
	  String t = driver.getTitle();
	  assertEquals(t, "HTML");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "e:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  baseUrl = "http://nahual.github.io/qc-celfar/?v=1";
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	 Thread.sleep(2000);
	 driver.close();
  }

}
