package implementation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class Amazon_Add_Cart implements pages.Amazon_Add_Cart {

    SelenideElement searchAmazon=$(By.xpath("//input[@id='twotabsearchtextbox']"));
    SelenideElement submitButton=$(By.xpath("//input[@id='nav-search-submit-button']"));

    SelenideElement secondElement=$(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));

    SelenideElement addToCartButton=$(By.xpath("//input[@id='add-to-cart-button']"));

    SelenideElement proceedToCheckoutButton=$(By.xpath("//input[@class='a-button-input' and @aria-labelledby='attach-sidesheet-checkout-button-announce']"));
    @Override
    public void enterProduct(String item) {

        searchAmazon.val(item);
        submitButton.pressEnter();

    }

    @Override
    public void clickProductandAddtoCart() {
        secondElement.click();
        System.out.println("---- Clicked Second Element ------------");
        //Switch to new tab:
        switchTo().window(1);
        addToCartButton.shouldBe(Condition.visible);
        System.out.println("---- Add to Cart button visible ------------");


    }

    @Override
    public void clickProceedToBuy() {
        addToCartButton.click();

    }

    @Override
    public void clickUseOrder() {
        proceedToCheckoutButton.click();

    }

    @Override
    public String orderTotal() {
        return null;
    }
}
