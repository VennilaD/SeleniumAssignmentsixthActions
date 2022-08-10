package com.gmoonline;

import org.testng.annotations.Test;

import com.pages.Frames;
import com.pages.MouseOperations;
import com.utility.Constants;
import com.utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidatingMouseOperations extends Library{
	  
	@Test(priority=0)
	public  void validatepageloadinginmouseoperations() {
	driver.get(ObjProperties.getProperty("Mouseoperationvalidation"));
	driver.manage().timeouts().pageLoadTimeout(Constants.pageLoadTimeOut, TimeUnit.SECONDS);
	String Titleofmouseoperation=driver.getTitle();
	System.out.println("Titleofmouseoperation :"+Titleofmouseoperation);
	Assert.assertEquals(Titleofmouseoperation,ObjProperties.getProperty("titleofdemoqamouseoperation") , "title is valid");
		
	}
	@Test(priority=1)
	public void validatebuttonsindemoqa() {
		Actions ObjActions=new Actions(driver);
		WebElement clickedme=driver.findElement(MouseOperations.clickme);
		ObjActions.click(clickedme).build().perform();
		String dynamictitle=driver.findElement(MouseOperations.clickmemessage).getText();
		System.out.println("dynamictitle :" +dynamictitle);
		Assert.assertEquals(dynamictitle, ObjProperties.getProperty("titleofdynamic"));
		
		WebElement rightclick=driver.findElement(MouseOperations.rightclickme);
		ObjActions.contextClick(rightclick).build().perform();
		String rightclickmessage=driver.findElement(MouseOperations.messageinrightclick).getText();
		System.out.println("rightclickmessage :" +rightclickmessage);
		Assert.assertEquals(rightclickmessage, ObjProperties.getProperty("titleofrightclick"),"title of rightclick is valid");
		
		
		WebElement doubleclicking=driver.findElement(MouseOperations.doubleclicked);
		ObjActions.doubleClick(doubleclicking).build().perform();
		String doubleclickedmessage=driver.findElement(MouseOperations.messageindoubleclick).getText();
		System.out.println("doubleclickedmessage :"+doubleclickedmessage);
		Assert.assertEquals(doubleclickedmessage, ObjProperties.getProperty("titleofdoubleclick"),"title of double click is valid");
		
		
		
		
	}
	
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  Launchbrowser();
  }

 

@AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  ReadPropertiesFile();
	  
	  
  }

  
@AfterSuite
  public void afterSuite() {
  }

}
