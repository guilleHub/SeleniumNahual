package celfar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	
	public WebDriver driver;
	public String baseUrl;
	
  @Test
  public void c() {
	  
	  driver.get(baseUrl);
	  driver.findElement(By.id("input")).sendKeys("10");
	  driver.findElement(By.className("button")).click();
	  String out = driver.findElement(By.id("output")).getText();
	  assertEquals(out, "50");
	  
  }
  
  @Test
  public void c2() {
	  
	  driver.get(baseUrl);
	  driver.findElement(By.id("input")).sendKeys("0");
	  driver.findElement(By.className("button")).click();
	  String out = driver.findElement(By.id("output")).getText();
	  assertEquals(out, "32");
	  
  }
  
  @Test
  public void c3() {
	  
	  driver.get(baseUrl);
	  driver.findElement(By.id("input")).sendKeys("-10");
	  driver.findElement(By.className("button")).click();
	  String out = driver.findElement(By.id("output")).getText();
	  assertEquals(out, "14");
	  
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
