package org.nagur.reuseble;

import org.nagur.datatable.Xls_Reader;
import org.nagur.locaters.Eelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReusableFunction extends Eelement {

	public static Xls_Reader datatable_suite1=null;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	// get current date time with Date()
	Date date = new Date();
	// Now format the date
	String date1 = dateFormat.format(date);

	public ReusableFunction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void loginfunction() {
		username.sendKeys("admin");
		userpassword.sendKeys("test");
		loginbutton.click();
	}

	public void openurl(String url) {
		driver.get("http://183.82.118.175:8080/geico-v02/");
		// TODO Auto-generated method stub

	}

	public void stopDriver() {
		driver.close();
		// TODO Auto-generated method stub

	}

	public void clicking(WebElement element) throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\vikas\\geico\\outputsrc" + dateFormat.format(date) + ".jpeg"));
		}
	}

	public void sendMatter(WebElement element, String string) throws Exception {
		try {

			element.sendKeys(string);
		} catch (Exception e) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\vikas\\geico\\outputsrc" + dateFormat.format(date) + ".jpeg"));
		}
	}

	public void dropDownmeth(WebElement element, String value, int number) throws Exception {
		int number1 = 0;
		try {
			if (number > number1) {

				Select dropdwn = new Select(element);
				dropdwn.selectByIndex(number);
			} else {
				Select dropdwn = new Select(element);
				dropdwn.selectByVisibleText(value);
			}

		} catch (Exception e) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\vikas\\geico\\outputsrc" + dateFormat.format(date) + ".jpeg"));
		}

	}
	public void assertSelection(WebElement element) throws Exception
	{
		try
		{
			Assert.assertTrue(element.isSelected());
		}
		 catch (Exception e) {
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\vikas\\geico\\outputsrc" + dateFormat.format(date) + ".jpeg"));
			}
	}
	public void dropownlistofelements(WebElement element) throws Exception
	{
		try{
		  List
			
		}catch(Exception e)
		{
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File("D:\\vikas\\geico\\outputsrc"+ dateFormat.format(date)+".jpeg"));
		}
	}

	public static void initialize() throws Exception
	{
		datatable_suite1=new Xls_Reader(System.getProperty("user.dir")+"//src//config//TestData.xlsx");
		
	}
}
