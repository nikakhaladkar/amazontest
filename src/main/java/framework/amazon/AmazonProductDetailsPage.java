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
public class AmazonProductDetailsPage extends AmazonBasePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='result_0']/div/div[2]/div/a/img")
    private WebElement iPhone6SilverElement;

    public AmazonProductDetailsPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void navigateToIPhone6Page(){
        iPhone6SilverElement.click();
        Utility.waitForSomeTime();
    }

}
