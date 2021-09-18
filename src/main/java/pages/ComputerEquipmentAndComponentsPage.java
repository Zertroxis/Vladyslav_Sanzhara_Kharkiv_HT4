package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerEquipmentAndComponentsPage extends BasePage {


    @FindBy(xpath = "//a[@class='cat-cont'][@href='/monitors/'][@title = 'Мониторы']")
    private WebElement monitorsPageLinkButton;

    @FindBy(xpath = "//a[@class='cat-cont'][@href='/processors/'][@title = 'Процессоры']")
    private WebElement processorsPageLinkButton;

    @FindBy(xpath = "//a[@class='cat-cont'][@href='/video_cards/'][@title = 'Видеокарты']")
    private WebElement videoCardsPageLinkButton;


    public ComputerEquipmentAndComponentsPage(WebDriver driver) {
        super(driver);
    }


    public void clickToMonitorsPageLinkButton() {
        monitorsPageLinkButton.click();
    }

}
