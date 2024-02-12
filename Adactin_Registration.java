package miniProject_Adactin.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Registration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("HarishVasanthi");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("vasanthiharish");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		WebElement locationvalue = driver.findElement(By.xpath("//option[@value='London']"));
		locationvalue.click();
		
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Hotels.click();
		WebElement Hotelsvalue = driver.findElement(By.xpath("//option[@value='Hotel Sunshine']"));
		Hotelsvalue.click();
		
		WebElement Room_Type = driver.findElement(By.id("room_type"));
		Room_Type.click();
		WebElement Room_Type_Value = driver.findElement(By.xpath("//option[@value='Double']"));
		Room_Type_Value.click();
		
		WebElement Room_No = driver.findElement(By.id("room_nos"));
		Room_No.click();
		WebElement Room_No_Value = driver.findElement(By.xpath("//option[@value='3']"));
		Room_No_Value.click();
		
		WebElement Check_In = driver.findElement(By.id("datepick_in"));
		Check_In.sendKeys("29/11/2023");
		WebElement Check_Out = driver.findElement(By.id("datepick_out"));
		Check_Out.sendKeys("01/12/2023");
		
		WebElement Adult_Room = driver.findElement(By.id("adult_room"));
		Adult_Room.click();
		WebElement Adult_Room_Value = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
		Adult_Room_Value.click();
		
		WebElement Child_Room = driver.findElement(By.id("child_room"));
		Child_Room.click();
		WebElement Child_Room_Value = driver.findElement(By.xpath("(//option[@value='2'])[3]"));
		Child_Room_Value.click();
		
		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();
		
		WebElement Select_Hotel = driver.findElement(By.xpath("//input[@value='0']"));
		Select_Hotel.click();
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement First_Name = driver.findElement(By.id("first_name"));
		First_Name.sendKeys("Harish");
		WebElement Last_Name = driver.findElement(By.id("last_name"));
		Last_Name.sendKeys("Vasanthi");
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("Chennai");
		
		WebElement cc_num = driver.findElement(By.id("cc_num"));
		cc_num.sendKeys("1234567892345678");		
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		cc_type.click();
		WebElement cc_type_val = driver.findElement(By.xpath("//option[@value='VISA']"));
		cc_type_val.click();
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		cc_exp_month.click();
		WebElement cc_exp_month_val = driver.findElement(By.xpath("//option[@value='3']"));
		cc_exp_month_val.click();
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		cc_exp_year.click();
		WebElement cc_exp_year_val = driver.findElement(By.xpath("//option[@value='2024']"));
		cc_exp_year_val.click();
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys("862");
		
		WebElement Book_Now = driver.findElement(By.id("book_now"));
		Book_Now.click();	
		
		Thread.sleep(8000);
		
		WebElement My_Itinerary = driver.findElement(By.id("my_itinerary"));
		My_Itinerary.click();
		
		WebElement Booke_Itinerary = driver.findElement(By.xpath("//input[@value='1139835']"));
		Booke_Itinerary.click();
		
		WebElement Cancel_All = driver.findElement(By.name("cancelall"));
		Cancel_All.click();	

	}
}
