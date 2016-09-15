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
public class AmazonSignInPage extends AmazonBasePage {

    /////TODO
    @FindBy(how = How.ID, using = "createAccountSubmit")
    private WebElement createAccountElement;


    public AmazonSignInPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void goToCreateAccountPage(){
        createAccountElement.click();
        Utility.waitForSomeTime();
    }


}
