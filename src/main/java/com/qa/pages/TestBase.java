package com.qa.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public WebDriver driver;

    public void driverInitialize(){

     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();

     //open google page

        driver.get("https://www.google.com/");
    }

}
