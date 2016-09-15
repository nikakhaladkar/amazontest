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
public class AmazonElectronicsPage extends AmazonBasePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='a-autoid-0-announce']")
    private WebElement iPhoneSectionElement;

    public AmazonElectronicsPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void navigateToIPhone6Page(){
        iPhoneSectionElement.click();
        Utility.waitForSomeTime();
    }

}
