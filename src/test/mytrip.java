package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mytrip {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	 Thread.sleep(2000);
	   driver.findElement(By.id("ch_login_icon")).click();
	   Thread.sleep(2000);
	 driver.findElement(By.id("ch_login_email")).clear();
	    driver.findElement(By.id("ch_login_email")).sendKeys("rajani.asamshetti@gmail.com");
	    Thread.sleep(2000);
	      driver.findElement(By.id("ch_login_password")).sendKeys("rajani415");
	      driver.findElement(By.id("ch_login_btn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("failed_wallet_got_it")).click();
	      Thread.sleep(2000);
	       
	    driver.findElement(By.id("ch_logged-in")).click();
	    Thread.sleep(2000);
	      driver.findElement(By.id("ch_logged-inlogout")).click();
	    
}


}
