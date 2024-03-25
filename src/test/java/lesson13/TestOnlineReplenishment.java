package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOnlineReplenishment {
    private WebDriver driver;

    @BeforeMethod
    private void createWebdriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.id("cookie-agree")).click();
    }

    @AfterMethod
    private void closeWebdriver() {
        driver.quit();
    }

    @Test
    public void TestCheckNameBlockOnlinePaymentTask1() {
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = driver.findElement(By.xpath("//h2[text()='Онлайн пополнение ']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void TestCheckingPaymentLogosTask2() {
        WebElement visa = driver.findElement(By.xpath("//img[contains(@src, 'pay/visa.svg')]"));
        WebElement verifiedByVisa = driver.findElement(By.xpath("//img[contains(@src, 'visa-verified')]"));
        WebElement mastercard = driver.findElement(By.xpath("//img[contains(@src, 'pay/mastercard.svg')]"));
        WebElement mastercardSecCode = driver.findElement(By.xpath("//img[contains(@src, 'mastercard-secure')]"));
        WebElement belkart = driver.findElement(By.xpath("//img[contains(@src, 'pay/belkart.svg')]"));
        WebElement mir = driver.findElement(By.xpath("//img[contains(@src, 'pay/mir.svg')]"));
        Assert.assertTrue(visa.isDisplayed());
        Assert.assertTrue(verifiedByVisa.isDisplayed());
        Assert.assertTrue(mastercardSecCode.isDisplayed());
        Assert.assertTrue(mastercard.isDisplayed());
        Assert.assertTrue(belkart.isDisplayed());
        Assert.assertTrue(mir.isDisplayed());
    }

    @Test
    public void TestLinkMoreAboutServiceTask3() {
        String actualUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        WebElement elementService = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        new WebDriverWait(driver, Duration.ofMillis(10))
                .until(ExpectedConditions.visibilityOf(elementService))
                .click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, actualUrl);
    }

    @Test(invocationCount = 2)                                     // иногда не проходил, поэтому поставила так
    public void TestFieldsAndWorkingButtonsTask4() {
        String number = "297777777";
        String expectedText = "Оплата: Услуги связи Номер:375" + number;
        String sum = "50";
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath("//span[text()='Услуги связи']")).click();
        driver.findElement(By.xpath("//*[@id='connection-phone']")).sendKeys(number);
        driver.findElement(By.xpath("//*[@id='connection-sum']")).sendKeys(sum);
        driver.findElement(By.xpath("( //button[@class='button button__default '])[1]")).click();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        new WebDriverWait(driver, Duration.ofSeconds(4))
                .until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//app-payment-container"));
        WebElement waitElem = driver.findElement(By.xpath("//app-payment-container//p"));
        String actualText = new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(waitElem))
                .getText();
        Assert.assertEquals(actualText, expectedText);
    }
}

