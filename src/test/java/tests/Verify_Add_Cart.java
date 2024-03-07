package tests;

import org.testng.annotations.Test;
import pages.Amazon_Add_Cart;

public class Verify_Add_Cart extends BaseTest{

    @Test
    public void addToCart() throws InterruptedException{
        Amazon_Add_Cart newItem=new implementation.Amazon_Add_Cart();
        newItem.enterProduct("gym t shirts for men");
        newItem.clickProductandAddtoCart();
        newItem.clickProceedToBuy();
        System.out.println("----- Add to cart clicked --------");
        newItem.clickUseOrder();
        System.out.println("------- Proceed to Check Out--------------");

    }


}
