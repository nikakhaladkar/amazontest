package framework.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nika.khaladkar on 14/09/2016.
 */
public class AmazonSmartPhonesPage extends AmazonBasePage {

    /*@FindBy(how = How.XPATH, using = "./*//*[@id='result_0']/div/div[2]/div/a/img")
    private WebElement iPhoneLinkElement;*/

    /*@FindBy(how = How.XPATH, using = "./*//*[@id='result_1']/div/div[2]/div/a/img")
    private WebElement iPhoneLinkElement;*/

    @FindBy(how = How.XPATH, using = ".//*[@id='result_2']/div/div[2]/div/a/img")
    private WebElement iPhoneLinkElement;

    public AmazonSmartPhonesPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToPhoneDetailsPage(){
        iPhoneLinkElement.click();
        Utility.waitForSomeTime();
    }

}
