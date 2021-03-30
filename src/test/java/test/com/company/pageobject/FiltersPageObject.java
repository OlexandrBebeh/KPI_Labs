package test.com.company.pageobject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FiltersPageObject {
    private WebDriver driver;

    @FindBy(css = "body > nav > div.menu__container > div.menu-main.hide-in-lite-mode > div.menu-item.has-submenu.menu-item--animated.hide-in-lite-mode.js-menu-store > a")
    private WebElement magazineButton;

    @FindBy(css = "body > div.universe > div.wrapper.cf > div > div.catalog__wrapper > div.container.container--spaced.container--wider.container--catalog.catalog__body-wrapper > div.catalog__body.catalog__body--slide-desktop.catalog__body--slide-mobile > div.catalog__sidebar > div:nth-child(1) > div.filter__item-options > label:nth-child(1)")
    private WebElement priceFilter;

    @FindBy(css = "body > div.universe > div.wrapper.cf > div > div.catalog__wrapper > div.container.container--spaced.container--wider.container--catalog.catalog__body-wrapper > div.catalog__body.catalog__body--slide-desktop.catalog__body--slide-mobile > div.catalog__sidebar > div:nth-child(2) > div.filter__item-options > div.option__item.option__item--first")
    private WebElement platformFilter;

    @FindBy(css = "body > div.universe > div.wrapper.cf > div > div.catalog__wrapper > div.container.container--spaced.container--wider.container--catalog.catalog__body-wrapper > div.catalog__body.catalog__body--slide-desktop.catalog__body--slide-mobile > div.catalog__games-list > div.list--grid > div > div > div:nth-child(1) > div > div > a")
    private WebElement product;

    @FindBy(css = "body > div.layout.ng-scope > div:nth-child(8) > div.product-actions.hide-when-content-is-expanded.ng-scope > div.product-actions-price > span.product-actions-price__final-amount._price.ng-binding")
    private WebElement productPrice;

    @FindBy(id = "windows_icomoon-ignore")
    private WebElement ico;


    public FiltersPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public FiltersPageObject useFilters() throws Exception{

        magazineButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]")));

        priceFilter.click();

        platformFilter.click();

        TimeUnit.SECONDS.sleep(2);

        product.click();


        return this;
    }

    public void checkFilters() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pageTop\"]/body/div[1]/div[6]/div[2]/div[1]/span[3]")));


        String price = productPrice.getText();
        Assert.assertTrue(Float.parseFloat(price)<5);
        Assert.assertTrue(ico.isEnabled());
    }

}
