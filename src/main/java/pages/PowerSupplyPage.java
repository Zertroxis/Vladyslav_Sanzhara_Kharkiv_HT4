package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerSupplyPage extends BasePage{




    @FindBy(xpath = "//ul[@id='list-0']//a[@class='filter-value-link']/label[contains(text(),'Asus')]")
    private WebElement powerSupplyAsusManufacturerLabel;

    @FindBy(xpath = "//a[@class='vit-name'][contains(text(),'Блок питания 1200W Asus ROG Thor (ROG-THOR-1200P)')]")
    private WebElement powerSupplyAsusRogThor1200WLink;


    public PowerSupplyPage(WebDriver driver) {
        super(driver);
    }




    public void clickOnSupplyAsusManufacturerLabel(){
        powerSupplyAsusManufacturerLabel.click();
    }

    public void clickOnLinkToPowerSupplyRogThor1200W(){
        powerSupplyAsusRogThor1200WLink.click();
    }
}
