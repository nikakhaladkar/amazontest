package framework.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nika.khaladkar on 15/09/2016.
 */
public class AmazonCreateAccountPage extends AmazonBasePage {

    @FindBy(how = How.ID, using = "ap_customer_name")
    private WebElement yourNameElement;

    @FindBy(how = How.ID, using = "ap_email")
    private WebElement emailIDElement;

    @FindBy(how = How.ID, using = "ap_password")
    private WebElement passwordElement;

    @FindBy(how = How.ID, using = "ap_password_check")
    private WebElement passwordCheckElement;

    @FindBy(how = How.ID, using = "continue")
    private WebElement continueElement;



    public AmazonCreateAccountPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterDetailsForUser()
    {
        yourNameElement.sendKeys("TestUser");
        passwordElement.sendKeys("test1234");
        passwordCheckElement.sendKeys("test1234");
    }

    public void enterUniqueEmailIDForUser()
    {
        int randomNumber;
        randomNumber = 100 + (int)(Math.random() * ((1000000 - 100) + 1));
        emailIDElement.sendKeys("");
        emailIDElement.sendKeys("automationtest"+randomNumber+"@yopmail.com");
    }

    public void createAccountandGoToAddressPage()
    {
        continueElement.click();
    }



}
