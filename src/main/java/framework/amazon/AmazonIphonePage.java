package framework.amazon;

import framework.amazon.AmazonBasePage;
import framework.amazon.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nika.khaladkar on 14/09/2016.
 */
public class AmazonIphonePage extends AmazonBasePage {

    @FindBy(how = How.ID, using = "add-to-cart-button")
    private WebElement iPhone6SilverElement;


    public AmazonIphonePage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToBasketPage(){
        iPhone6SilverElement.click();
        Utility.waitForSomeTime();
    }
}
