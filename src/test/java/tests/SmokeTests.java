package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SmokeTests extends BaseTest {

    /*
    Сайт который проверяется тестами может вызвать окно подтвержденя с капчей при проверке
    человек/компьютер из-за большого количества запросов и тест может не kпройти
    */

    private final static Integer AJAX_TIME_TO_WAITE = 10;
    private final static Integer PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE = 15;
    private final static Integer ELEMENT_LOAD_TIME_TO_WAITE = 5;

    private final static String POWER_SUPPLY_SEARCH_WORD = "Блок питания";
    private final static String COMPUTERS_SEARCH_WORD = "Компьютеры";

    @Test(priority = 1)
    public void checkAddGoodsToWishListAndAddToCartFromWishListAndDeleteAllGoodsFromCart() {

        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().clickOnSubscribePopUpDeny();
        getHomePage().clickOnComputerEquipmentAndComponentsSidebarButton();
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getComputerEquipmentAndComponentsPage().clickToMonitorsPageLinkButton();
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getMonitorsPage().clickToExtendListOfManufacturers();
        getMonitorsPage().clickToLabelAcerManufacturer();
        getMonitorsPage().clickToLabelGamingMonitors();
        getMonitorsPage().clickToLabelDiagonalSize();
        getHomePage().clickOnAcceptFilterButton();
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getMonitorsPage().clickOnAcerVG270Link();
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getHomePage().clickOnAddToWishlist();
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getHomePage().searchByKeyword(POWER_SUPPLY_SEARCH_WORD);
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getSearchPage().clickToPowerSupplyForComputer();
        getPowerSupplyPage().clickOnSupplyAsusManufacturerLabel();
        getHomePage().clickOnAcceptFilterButton();
        getPowerSupplyPage().clickOnLinkToPowerSupplyRogThor1200W();
        getHomePage().clickOnAddToWishlist();
        getHomePage().goToPageHeader();
        getHomePage().clickOnLogoToMoveOnHomePage();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().clickOnWishList();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getWishListPage().addToCartFromWishlist();
        getHomePage().clickToMoveToCart();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getCartPage().deleteAllGoodsFromCartPage();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        Assert.assertTrue(getCartPage().totalSumOfProductsInCart().getText().contains("0"));
    }

    @Test(priority = 2)
    public void checkCurrentLangOnPage() {
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().clickOnSubscribePopUpDeny();
        getHomePage().clickToChangeLanguage();
        getHomePage().waitForAjaxToComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        Assert.assertTrue(getHomePage().currentLanguage().getText().contains("UA"));
    }

    @Test(priority = 3)
    public void checkConfiguratorComputerUserConfigurations() throws InterruptedException {
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().clickOnSubscribePopUpDeny();
        getHomePage().clickToConfiguratorPage();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().waitVisibilityOfElement(ELEMENT_LOAD_TIME_TO_WAITE, getConfigurationPage().waiteToLoadConfigureUserHelper());
        getConfigurationPage().clickToSkipConfiguratorPopUp();
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        Thread.sleep(1000);//позиция элемента после PopUp-окна изменяет положение элемента
        getConfigurationPage().clickToOpenUserConfigurations();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getConfigurationPage().addToCartFirstElementInUsersKits();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getHomePage().waitVisibilityOfElement(10, getCartPage().waitToLoadCartProductsPage());
        Assert.assertEquals(getCartPage().checkAllGoodsInCart(), 8);
    }

    @Test(priority = 4)
    public void checkFilterOnlyAsusComputersOnPage() {
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().clickOnSubscribePopUpDeny();
        getHomePage().searchByKeyword(COMPUTERS_SEARCH_WORD);
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getSearchPage().clickToDesktops();
        getHomePage().waitForAjaxToComplete(AJAX_TIME_TO_WAITE);
        getHomePage().waitForPageLoadComplete(PAGE_LOAD_TO_COMPLETE_TIME_TO_WAITE);
        getDesktopsPage().clickOnLabelFilterAsusDesktops();
        getHomePage().scrollToElement(getDesktopsPage().toScrollToElementCoreI7());
        getDesktopsPage().clickOnLabelFilterAsusDesktopsWithCoreI7();
        getHomePage().clickOnAcceptFilterButton();
        Assert.assertEquals(getDesktopsPage().countOfAsusDesktopsOnPage(), 36);
    }

}
