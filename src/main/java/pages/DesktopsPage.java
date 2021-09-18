package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopsPage extends BasePage{

    @FindBy(xpath = "//a[@class='filter-value-link']//..//a[@class = 'filter-value-link'][contains(@href,'/desktops/Asus/')]")
    private WebElement desktopsManufactureAsusLabelFilter;

    @FindBy(xpath = "//li[@class='vit-item']//..//a[contains(text(),'Asus')]")
    private List<WebElement> listOfAsusDesktopsOnPage;

    @FindBy(xpath = "//a[@class='filter-value-link']//..//a[@class = 'filter-value-link'][contains(@href,'/desktops/_6dD-1Dmu/')]")
    private WebElement desktopsWithProcessorCoreI7;

    public DesktopsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLabelFilterAsusDesktops(){
        desktopsManufactureAsusLabelFilter.click();
    }

    public void clickOnLabelFilterAsusDesktopsWithCoreI7(){
        desktopsWithProcessorCoreI7.click();
    }

    public int countOfAsusDesktopsOnPage(){
        return listOfAsusDesktopsOnPage.size();
    }

    public WebElement toScrollToElementCoreI7(){
        return  desktopsWithProcessorCoreI7;
    }
}
