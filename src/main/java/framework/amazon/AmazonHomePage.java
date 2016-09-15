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
public class AmazonHomePage extends AmazonBasePage {

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchElement;

    @FindBy(how = How.ID, using = "nav-link-shopall")
    private WebElement shopAllElement;


    public AmazonHomePage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void searchIphone()
    {
        searchElement.sendKeys("iPhone 6");

    }

    public void navigateToSiteDirectoryPage(){
        shopAllElement.click();
        Utility.waitForSomeTime();
    }

}
