package framework.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nika.khaladkar on 15/09/2016.
 */
public class AmazonAddressPage extends AmazonBasePage {

    @FindBy(how = How.ID, using = "enterAddressFullName")
    private WebElement fullNameElement;

    @FindBy(how = How.ID, using = "enterAddressAddressLine1")
    private WebElement enterAddressAddressLine1Element;

    @FindBy(how = How.ID, using = "enterAddressAddressLine2")
    private WebElement enterAddressAddressLine2Element;

    @FindBy(how = How.ID, using = "enterAddressCity")
    private WebElement enterAddressCity;

    @FindBy(how = How.ID, using = "enterAddressStateOrRegion")
    private WebElement enterAddressStateOrRegionElement;

    @FindBy(how = How.ID, using = "enterAddressPostalCode")
    private WebElement enterAddressPostalCodeElement;

    @FindBy(how = How.ID, using = "enterAddressPhoneNumber")
    private WebElement enterAddressPhoneNumberElement;

    @FindBy(how = How.CSS, using = "input[type='submit']")
    private WebElement continueButtonElement;


    public AmazonAddressPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterAddressDetails(){
        fullNameElement.sendKeys("Test User");
        enterAddressAddressLine1Element.sendKeys("103 Rivington Apartments");
        enterAddressAddressLine2Element.sendKeys("Railway Terrace");
        enterAddressCity.sendKeys("Slough");
        enterAddressStateOrRegionElement.sendKeys("Berkshire");
        enterAddressPostalCodeElement.sendKeys("Sl2 5GN");
        enterAddressPhoneNumberElement.sendKeys("07720830033");

    }

    public void clickOnContinue(){
        continueButtonElement.click();
    }



}
