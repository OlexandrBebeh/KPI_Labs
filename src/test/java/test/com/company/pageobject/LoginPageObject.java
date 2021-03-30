package test.com.company.pageobject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class LoginPageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[6]")
    private WebElement singInButton;

    @FindBy(id = "login_username")
    private WebElement username;

    @FindBy(id = "login_password")
    private WebElement password;

    @FindBy(id = "login_login")
    private WebElement submitLogin;

    @FindBy(xpath = "/html/body/nav/div[1]/div[1]/div[7]/a")
    private WebElement homePage;



    public LoginPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void login(User user) throws Exception{

        singInButton.click();

        TimeUnit.SECONDS.sleep(15);

        driver.switchTo().frame(2);

        username.sendKeys(user.getEmail());

        password.sendKeys(user.getPassword());

        submitLogin.submit();

        TimeUnit.SECONDS.sleep(2);

        homePage.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gog.com/feed");

    }
}
