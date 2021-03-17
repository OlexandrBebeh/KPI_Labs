package com.company.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BucketPageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[1]")
    private WebElement magazineButton;


    public BucketPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void addToBucket(int amount) throws InterruptedException {

        magazineButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions builder = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/a")));

        for(int i = 1;i<=amount;i++) {
            builder.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[" +i+"]/div/div/a"))).perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[" +i+"]/div/div/a/div[3]/div[2]/button")));
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[" +i+"]/div/div/a/div[3]/div[2]/button")).click();
            TimeUnit.SECONDS.sleep(1);

        }

    }
}
