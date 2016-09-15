/**
 * Created by nika.khaladkar on 14/09/2016.
 */

import framework.amazon.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestPurchase {

    static WebDriver driver;

    @BeforeMethod
    public static void before(){

        System.setProperty("webdriver.chrome.driver","/Users/nika.khaladkar/software/ChromeDriver/chromedriver");
        driver =  new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.co.uk/");
    }

    @AfterMethod
    public static void after(){
        System.out.print("--Test Finished--");
        driver.close();
        driver.quit();
        driver = null;
    }

    @org.testng.annotations.Test
    public void testAmazonjourney(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateToSiteDirectoryPage();
        AmazonSiteDirectoryPage amazonSiteDirectoryPage = new AmazonSiteDirectoryPage(driver);
        amazonSiteDirectoryPage.navigateToAllElectronicsPage();
        AmazonElectronicsPage amazonElectronicsPage = new AmazonElectronicsPage(driver);
        amazonElectronicsPage.navigateToIPhone6Page();
        AmazonSmartPhonesPage amazonSmartPhonesPage = new AmazonSmartPhonesPage(driver);
        amazonSmartPhonesPage.navigateToPhoneDetailsPage();
        //Test might fail here if phone's available quantity is reduced
        AmazonProductPage amazonProductPage = new AmazonProductPage(driver);
        amazonProductPage.changeTheQuantity("3");
        amazonProductPage.clickOnAddToBasket();
        AmazonBasketPage amazonBasketPage = new AmazonBasketPage(driver);
        amazonBasketPage.clickOnProceedToCheckout();
        AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driver);
        amazonSignInPage.goToCreateAccountPage();
        AmazonCreateAccountPage amazonCreateAccountPage = new AmazonCreateAccountPage(driver);
        amazonCreateAccountPage.enterDetailsForUser();
        amazonCreateAccountPage.enterUniqueEmailIDForUser();
        //Enter create your Amazon Account
        amazonCreateAccountPage.createAccountandGoToAddressPage();
        AmazonAddressPage amazonAddressPage = new AmazonAddressPage(driver);
        //Enter Delivery Address details
        amazonAddressPage.enterAddressDetails();
        amazonAddressPage.clickOnContinue();
        AmazonDispatchPage amazonDispatchPage = new AmazonDispatchPage(driver);
        Assert.assertTrue(amazonDispatchPage.verifyDispatchPageIsDisplayed(),"Dispatch page is displayed");
    }
}
