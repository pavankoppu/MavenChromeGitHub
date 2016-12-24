package com.testng.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Chrome {
  @Test
  public void GoogleChrome() {
	  
	  //System.setProperty("webdriver.chrome.driver","E:\\subject\\selenium\\chromedriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.yahoo.com");
  }
}
