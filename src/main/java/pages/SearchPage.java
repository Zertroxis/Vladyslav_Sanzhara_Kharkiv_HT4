package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//a[@class = 'nav-a'][text()='Блоки питания']")
    private WebElement sidebarPowerSupplyWordLink;

    @FindBy(xpath = "//a[@class = 'nav-a'][text()='Десктопы']")
    private WebElement sidebarDesktopsWordLink;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickToPowerSupplyForComputer(){
        sidebarPowerSupplyWordLink.click();
    }

    public void clickToDesktops(){
        sidebarDesktopsWordLink.click();
    }
}
