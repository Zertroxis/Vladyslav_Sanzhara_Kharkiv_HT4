package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends BasePage{

    @FindBy(xpath = "//div[@class = 'no-print ready btn']")
    private List<WebElement> addListOfGoodsFromWishlistToCart;


    public WishListPage(WebDriver driver) {
        super(driver);
    }


    public void addToCartFromWishlist(){
        for (WebElement goodsToCart: addListOfGoodsFromWishlistToCart) {
            goodsToCart.click();
        }
    }

    private List<WebElement> addListOfGoodsFromWishlistToCart(){
            return addListOfGoodsFromWishlistToCart;
    }

}
