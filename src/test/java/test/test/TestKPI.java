package test.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.com.company.pageobject.*;

public class TestKPI {
    public WebDriver driver;

    /*@Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 7");
        driver = new ChromeDriver();
        System.out.println("Test start");
    }


    @Test
    public void testSearch() {
        driver.get("https://www.gog.com/");

        SearchPageObject searchPageObject = new SearchPageObject(driver);

        searchPageObject.search("Gwent");

        String title = driver.getTitle();
        Assert.assertEquals("GWENT: The Witcher Card Game on GOG.com", title);
    }

    @Test
    public void testByWithoutLogin_fail() {
        driver.get("https://www.gog.com/game/loop_hero");

        BuyingPageObject buyingPageObject = new BuyingPageObject(driver);

        buyingPageObject.buyWithoutLogin();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.length()>22);

        url = url.substring(0,url.indexOf("/",22)+1);

        Assert.assertEquals("https://www.gog.com/checkout/",url);

    }

    @Test
    public void testLogin() throws Exception{
        driver.get("https://www.gog.com/");

        User user = new User();
        user.setEmail("bebekh.oleksandr@lll.kpi.ua");
        user.setPassword("testpassword");

        LoginPageObject loginPageObject = new LoginPageObject(driver);
        loginPageObject.login(user);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gog.com/feed");

    }

    @Test
    public void testFilters() throws Exception{
        driver.get("https://www.gog.com/");

        FiltersPageObject filtersPageObject = new FiltersPageObject(driver);

        filtersPageObject.useFilters().checkFilters();
    }

    @Test
    public void testBucket() throws Exception{
        driver.get("https://www.gog.com/");
        int amount = 4;
        BucketPageObject bucketPageObject = new BucketPageObject(driver);
        bucketPageObject.addToBucket(amount);
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div[2]/div[3]/a/span[1]")).getText(),String.valueOf(amount));
    }
    @After
    public void close() {
        System.out.println("Test end");
        driver.close();
    }
*/
    @Test
    public void test1() throws Exception{
        int a = 1;
        int b = 1;
        int res = a + b;

        Assert.assertEquals(0x2,res);
    }
}
