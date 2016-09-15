package framework.amazon;

import framework.amazon.AmazonBasePage;
import framework.amazon.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by nika.khaladkar on 15/09/2016.
 */
public class AmazonProductPage extends AmazonBasePage {

    @FindBy(how = How.ID, using = "quantity")
    private WebElement quantityElement;

    @FindBy(how = How.ID, using = "add-to-cart-button")
    private WebElement addToBasketElement;

    public AmazonProductPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void changeTheQuantity(String num){
        new Select(driver.findElement(By.id("quantity"))).selectByValue(num);
        Utility.waitForSomeTime();
    }

    public void clickOnAddToBasket(){
        addToBasketElement.click();
        Utility.waitForSomeTime();
    }
}
