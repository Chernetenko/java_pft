package ru.staq.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupDeletionTests extends TestBase {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.driver = new FirefoxDriver();
        app.baseUrl = "https://www.katalon.com/";
        app.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testGroupDeletion() throws Exception {
        app.login2();
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}


