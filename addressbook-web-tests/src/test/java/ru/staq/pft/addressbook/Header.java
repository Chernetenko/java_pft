package ru.staq.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Header {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHeader() throws Exception {
    driver.get("http://192.168.5.72:3000/#/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Тестирование'])[1]/preceding::img[1]")).click();
    driver.findElement(By.linkText("Тестирование")).click();
    driver.findElement(By.linkText("Аудит")).click();
    driver.findElement(By.linkText("О нас")).click();
    driver.findElement(By.linkText("Оставить заявку")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сообщение'])[1]/following::button[1]")).click();
    driver.findElement(By.linkText("Оставить заявку")).click();
    driver.findElement(By.linkText("О нас")).click();
    driver.findElement(By.linkText("Аудит")).click();
    driver.findElement(By.linkText("Тестирование")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Тестирование'])[1]/preceding::img[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Профессиональный аудит и тестирование программного обеспечения, интерфейсов, бизнес-процессов'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='НАЧАТЬ ТЕСТИРОВАНИЕ'])[1]/following::div[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Мультиплатформенноетестирование'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Увеличениепроизводительности'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Повышениеэргономичности'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оптимизацияархитектуры'])[1]/following::div[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
