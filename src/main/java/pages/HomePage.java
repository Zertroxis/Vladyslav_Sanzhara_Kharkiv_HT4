package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    Actions actionProvider = new Actions(driver);

    @FindBy(xpath = "//input[@id ='q'][@type='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class = 'tab-s' and contains(text(), 'Компьютерная техника, комплектующие')]")
    private WebElement computerEquipmentAndComponentsSidebarButton;

    @FindBy(xpath = "//span[@class = 'tab-s' and contains(text(), 'Конфигуратор ПК')]")
    private WebElement computerConfiguratorPage;

    @FindBy(xpath = "//a[@class='tb-a'][@href='https://service.elmir.ua']")
    private WebElement servicesLinkButton;

    @FindBy(xpath = "//button[@class='button'][@type='submit'][@name='gofilter'][text()='Применить']")
    private WebElement filterAcceptButton;

    @FindBy(xpath = "//div[@class='ti-s']//span[@class='no-print tovar-wishlist']")
    private WebElement addGoodToWishlist;

    @FindBy(xpath = "//a[@id='logo'][@href='/']")
    private WebElement clickOnLogoToMoveOnHomePage;

    @FindBy(xpath = "//a[@id='wishlist']")
    private WebElement clickOnWishlist;

    @FindBy(xpath = "//div[@id='subscribe-deny']")
    private WebElement clickToOffPopUpSubscribe;

    @FindBy(xpath = "//a[@id='basket-small']")
    private WebElement clickToMoveToCartPage;

    @FindBy(xpath = "//span[@id='lang-cur']")
    private WebElement currentLanguageOnPage;

    @FindBy(xpath = "//button[@id='lang-alt']")
    private WebElement clickOnButtonToChangeLanguage;


    @FindBy(id = "tab-15")
    private WebElement servicesSideBarButton;

    @FindBy(id = "find")
    private WebElement searchInputButton;


    @FindBy(tagName = "header")
    private WebElement header;


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickOnComputerEquipmentAndComponentsSidebarButton() {
        computerEquipmentAndComponentsSidebarButton.click();
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchInputButton.click();
        searchInput.clear();
    }

    public void clickOnAcceptFilterButton() {
        filterAcceptButton.click();
    }

    public void clickOnAddToWishlist() {
        addGoodToWishlist.click();
    }

    public void goToPageHeader() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", header);
    }

    public void clickOnLogoToMoveOnHomePage() {
        clickOnLogoToMoveOnHomePage.click();
    }

    public void clickOnWishList() {
        clickOnWishlist.click();
    }

    public void clickOnSubscribePopUpDeny(){
        clickToOffPopUpSubscribe.click();
    }

    public void clickToMoveToCart(){
        clickToMoveToCartPage.click();
    }

    public void clickToChangeLanguage(){
        clickOnButtonToChangeLanguage.click();
    }

    public WebElement currentLanguage(){
        return currentLanguageOnPage;
    }

    public void clickToConfiguratorPage(){
            computerConfiguratorPage.click();
    }

    public void scrollToElement(WebElement webElement){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,webElement);
    }
}
