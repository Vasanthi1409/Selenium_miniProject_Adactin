package miniProject_Adactin.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search_Product {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Hair Straightner");
		WebElement searchsymbol = driver.findElement(By.id("nav-search-submit-button"));
		searchsymbol.click();  

	}

}
