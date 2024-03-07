package implementation;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CommonActions {
    public static void clickSaveButton(){
        SelenideElement saveButton=$(By.xpath("//button[@data-label='Save']"));
        saveButton.click();
        System.out.println("---- Saved ---- ");
    }

    public static void clickHomeButton(){
        SelenideElement homeButton=$(By.xpath("//a[@class='navbar-brand navbar-home']"));
        homeButton.click();

    }
}
