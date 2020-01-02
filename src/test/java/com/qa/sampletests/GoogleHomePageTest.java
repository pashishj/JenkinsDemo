package com.qa.sampletests;

import com.qa.pages.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHomePageTest extends TestBase {


    @BeforeMethod
    public void setup(){
        driverInitialize();
    }

    @Test
    public void verifyPageTitle(){
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @Test
    public void failedPageTitle(){
        Assert.assertEquals(driver.getTitle(),"Test");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
