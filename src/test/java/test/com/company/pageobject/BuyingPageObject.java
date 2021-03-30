package test.com.company.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyingPageObject {
    private WebDriver driver;

    @FindBy(className = "cart-button__state-default")
    private WebElement bucketButton;

    @FindBy(css = "body > div.layout.ng-scope > div:nth-child(8) > div.product-actions.hide-when-content-is-expanded.ng-scope > div.ng-scope > button.button.button--big.cart-button.cart-button--in-cart.ng-scope")
    private WebElement buyButton;


    public BuyingPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void buyWithoutLogin(){
        bucketButton.click();
        buyButton.click();
    }
}
