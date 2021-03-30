package test.com.company.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/nav/div[1]/div[2]/div[4]")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/nav/div[1]/div[2]/div[4]/div/div[1]/div/input")
    private WebElement searchLine;

    @FindBy(xpath = "/html/body/nav/div[1]/div[2]/div[4]/div/div[3]/div/div/div[1]/div/div/a/div")
    private WebElement result;

    public SearchPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void search(String s){

        searchButton.click();

        searchLine.sendKeys(s);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/nav/div[1]/div[2]/div[4]/div/div[3]/div/div/div[1]/div/div/a/div")));

        result.click();

    }
}
