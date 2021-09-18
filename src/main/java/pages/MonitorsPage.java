package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MonitorsPage extends BasePage {


    @FindBy(xpath = "//ul[@id='list-0'][@class='filter-list']//..//li[@class = 'shower'][@target='list-0']")
    private WebElement monitorsManufacturersListExtenderButton;

    @FindBy(xpath = "//a[@class='filter-value-link'][@href='/monitors/Acer/']")
    private WebElement monitorsManufactureAcerLabel;

    @FindBy(xpath = "//a[@class='filter-value-link'][@href='/monitors/_Bn-1A/']")
    private WebElement monitorsDiagonalSize27Label;

    @FindBy(xpath = "//a[@class='filter-value-link'][@href='/monitors/_CZL-50Qr/']")
    private WebElement monitorsGamingLabel;

    @FindBy(xpath = "//a[@class='vit-name'][contains(text(),'UM.HV0EE.001')]")
    private WebElement monitorAcerVG270Link;




    public MonitorsPage(WebDriver driver) {
        super(driver);
    }


    public void clickToExtendListOfManufacturers() {
        monitorsManufacturersListExtenderButton.click();
    }

    public void clickToLabelAcerManufacturer() {
        monitorsManufactureAcerLabel.click();
    }

    public void clickToLabelDiagonalSize() {
        monitorsDiagonalSize27Label.click();
    }

    public void clickToLabelGamingMonitors() {
        monitorsGamingLabel.click();
    }

    public void clickOnAcerVG270Link() {
        monitorAcerVG270Link.click();
    }

}
