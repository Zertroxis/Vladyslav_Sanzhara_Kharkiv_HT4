package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurationPage extends BasePage {


    @FindBy(xpath = "//b[@class='dg-btn dg-skip' and contains(text(),'Пропустить')]")
    private WebElement buttonToSkipComputerConfiguratorUserHelperPopUp;

    @FindBy(xpath = "//div[@class='txtbox']")
    private WebElement popUpComputerConfiguratorUserHelperWindow;

    @FindBy(xpath = "//span[@class = 'allkits']")
    private WebElement openUserConfigurations;

    @FindBy(xpath = "//div[@class = 'prod-selrow'][@data-id='10000']")
    private WebElement openOrCloseListProductsOfProcessors;

    @FindBy(xpath = "//div[@id='saved_kits']")
    private WebElement savedUsersKits;

    @FindBy(xpath = "//article[1]//button[@class = 'buybtn']")
    private WebElement addToCartFirsElement;

    public ConfigurationPage(WebDriver driver) {
        super(driver);
    }

    public void clickToSkipConfiguratorPopUp() {
        buttonToSkipComputerConfiguratorUserHelperPopUp.click();
    }

    public WebElement waiteToLoadConfigureUserHelper() {
        return popUpComputerConfiguratorUserHelperWindow;
    }

    public void clickToOpenUserConfigurations() {
        openUserConfigurations.click();
    }

    public void addToCartFirstElementInUsersKits() {
        addToCartFirsElement.click();
    }
}
