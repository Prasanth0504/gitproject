package com.Day4Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumPractice\\src\\com\\Day4Practice\\Day4.java");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	WebElement amazontxt = driver.findElement(By.xpath("//a[contains(text(), 'Conditions of')]"));
  	String amazonterms = amazontxt.getText();
 
		System.out.println(amazonterms);
		
		
		driver.get("https://adactinhotelapp.com/");
		WebElement Adactin = driver.findElement(By.xpath("//p[contains(text(),'Launches')]"));
		String Adactinpage = Adactin.getText();
		System.out.println(Adactinpage);
	
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement Overview = driver.findElement(By.id("overview-tab"));
		Overview.click();
		WebElement Bestselenium =driver.findElement(By.id("heading662"));
		Thread.sleep(3000);
		Bestselenium.click();
		WebElement Paragraph =driver.findElement(By.xpath("//p[contains(text(),'This Selenium QA training course')]"));
		String Para  = Paragraph.getText();
		System.out.println(Para);
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	WebElement AlertwithTextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	AlertwithTextbox.click();
	
	WebElement btn = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	btn.click();
	driver.switchTo().alert().sendKeys("Prasanth");
	driver.switchTo().alert().accept();
	WebElement text = driver.findElement(By.xpath("//p[text()='Hello Prasanth How are you today']"));
	String textvalue = text.getText();
	System.out.println(textvalue);
	
	
	}
	
	
	
	

}
