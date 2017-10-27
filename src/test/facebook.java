package test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class facebook {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		 driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("rajaniasamchetti");
		   
		    Thread.sleep(2000);
		      driver.findElement(By.id("pass")).click();
		      driver.findElement(By.id("pass")).sendKeys("9299201186");
		      driver.findElement(By.id("loginbutton")).click(); 
		      driver.findElement(By.id("userNavigationLabel")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.partialLinkText("Log Out")).click();

	}
	}


