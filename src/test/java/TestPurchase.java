/**
 * Created by nika.khaladkar on 15/09/2016.
 */

import framework.amazon.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        amazonCreateAccountPage.createAccountandGoToAddressPage();
        AmazonAddressPage amazonAddressPage = new AmazonAddressPage(driver);
        amazonAddressPage.enterAddressDetails();
        AmazonDispatchPage amazonDispatchPage = new AmazonDispatchPage(driver);
        //amazonDispatchPage.clickOnContinue();
    }
}
