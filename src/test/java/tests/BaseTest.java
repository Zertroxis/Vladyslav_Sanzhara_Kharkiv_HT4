package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

import pages.*;
import utils.CapabilityFactory;

public class BaseTest {


    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    private static final String ELMIR_HOMEPAGE_URL = "https://elmir.ua/";


    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("firefox") String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(ELMIR_HOMEPAGE_URL);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }


    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public ComputerEquipmentAndComponentsPage getComputerEquipmentAndComponentsPage() {
        return new ComputerEquipmentAndComponentsPage(getDriver());
    }

    public MonitorsPage getMonitorsPage() {
        return new MonitorsPage(getDriver());
    }

    public SearchPage getSearchPage() {
        return new SearchPage(getDriver());
    }

    public DesktopsPage getDesktopsPage() {
        return new DesktopsPage(getDriver());
    }

    public WishListPage getWishListPage() {
        return new WishListPage(getDriver());
    }

    public ConfigurationPage getConfigurationPage() {
        return new ConfigurationPage(getDriver());
    }

    public PowerSupplyPage getPowerSupplyPage() {
        return new PowerSupplyPage(getDriver());
    }
}
