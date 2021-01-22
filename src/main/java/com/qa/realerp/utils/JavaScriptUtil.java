package com.qa.realerp.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	WebDriver driver;
	
	public JavaScriptUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);	
	}
	
	public void refreshBrowserByJS() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("history.go(0)");
	}
	
	public String getTitleByJS() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public void generateAlertByJS(String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('" + message + "')");
		//alert("abc")
	}
	
	public void drawBorderByJS(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='4px solid red'", element);
	}
	
	public void flashElementByJS(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element);
			changeColor(bgcolor, element);
		}
	}
	
	public void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
