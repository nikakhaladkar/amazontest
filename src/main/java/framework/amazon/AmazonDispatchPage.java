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
public class AmazonDispatchPage extends AmazonBasePage {

    @FindBy(how = How.CSS, using = "input[value='Continue']")
    private WebElement continueButtonElement;

    public AmazonDispatchPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void clickOnContinue(){
        continueButtonElement.click();
        Utility.waitForSomeTime();
    }

}
