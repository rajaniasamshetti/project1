package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooo {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		 driver.get( "https://login.yahoo.com/");
		    driver.findElement(By.id("login-username")).clear();
		    driver.findElement(By.id("login-username")).sendKeys("rajiniasamshetti@yahoo.com");
		    
		    driver.findElement(By.id("login-signin")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("login-passwd")).clear();
		    driver.findElement(By.id("login-passwd")).sendKeys("9299201186");
		   
		    driver.findElement(By.id("login-signin")).click();
	}

}
 