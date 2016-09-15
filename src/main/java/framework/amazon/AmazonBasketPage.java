package framework.amazon;

import framework.amazon.AmazonBasePage;
import framework.amazon.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nika.khaladkar on 15/09/2016.
 */
public class AmazonBasketPage extends AmazonBasePage {

    @FindBy(how = How.ID, using = "hlb-ptc-btn-native")
    private WebElement proceedToCheckoutElement;


    public AmazonBasketPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnProceedToCheckout(){
        proceedToCheckoutElement.click();
        Utility.waitForSomeTime();
    }
}
