package com.TestOptimize.GenericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericLib {
	public void selectType(WebDriver driver,String type) {
		try {
			WebElement web = driver.findElement(By.xpath("//select[@formcontrolname='WebElementType']"));
			Select s = new Select(web);
			s.selectByVisibleText(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
