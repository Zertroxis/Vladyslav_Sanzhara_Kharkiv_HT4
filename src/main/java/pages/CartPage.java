package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//table[@class = 'tovars']//td[@class='deletes']//a")
    private List<WebElement> deleteAllGoodsFromCartPage;

    @FindBy(xpath = "//tr[@class='trtov']")
    private List<WebElement> allGoodsInCart;

    @FindBy(xpath = "//tr[@class='trtov']")
    private WebElement waitToLoadCart;

    @FindBy(xpath = "//span[@id='summ' and contains(text(),'0')]")
    private WebElement totalSumOfProducts;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void deleteAllGoodsFromCartPage() {
        for (WebElement goodsToDelete : deleteAllGoodsFromCartPage
        ) {
            goodsToDelete.click();
        }
    }

    public WebElement waitToLoadCartProductsPage(){
        return waitToLoadCart;
    }

    public int checkAllGoodsInCart() {
        return allGoodsInCart.size();
    }

    public WebElement totalSumOfProductsInCart(){
        return totalSumOfProducts;
    }
}
