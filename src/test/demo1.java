package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
 public static void main(String args[]) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
     //driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.get("https:gmail.com/");
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("rajani.asamshetti@gmail.com");
	    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("ilovemom");
	   
	    driver.findElement(By.id("passwordNext")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	    driver.findElement(By.id("gb_71")).click();

 }
}
