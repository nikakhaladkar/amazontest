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
public class AmazonSiteDirectoryPage extends AmazonBasePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='shopAllLinks']/tbody/tr/td[3]/div[1]/ul/li[9]/a")
    private WebElement allElectronicsLinkElement;

    public AmazonSiteDirectoryPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToAllElectronicsPage(){
        allElectronicsLinkElement.click();
        Utility.waitForSomeTime();
    }

    public void verifySiteDirectoryPageDisplayed(){

    }


}


  /*  public AggregatedOrderPage(){
        if (!this.isOnPage()){
            throw new PageObjectFrameworkException("Expecting to be on Aggregated Order Page.");
        }
        PageFactory.initElements(WebBrowser.driver, this)
    }

    public boolean isOnPage(){
        try {
            WebBrowser.findElement(By.cssSelector("table[id\$='aggregatedOrdersList']")).displayed
        } catch (Exception e){
return WebBrowser.findElement(By.cssSelector("h2.pageDescription")).getText().contains("Aggregated Forecast details")
        }*/