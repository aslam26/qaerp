package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import implementation.LoginPageImpl;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class Verify_Login extends BaseTest {

    LoginPageImpl login= new LoginPageImpl();

    SelenideElement homePageTitle=$(By.xpath("//h3[@title='Home']"));


    @Test
    public void successfulLogin(){
        open("/#login");
        login.enterUsername("Administrator");
        login.enterPassword("admin");
        login.clickLoginButton();

        // Assertion to verify successful login
        homePageTitle.shouldHave(Condition.visible);
        System.out.println("Home is visible");
    }

    @Test
    public  void invalidLogin(){
        open("/#login");
        login.enterUsername("aslam");
        login.enterPassword("admins");
        login.clickLoginButton();
        login.loginButton.shouldHave(Condition.text("Invalid Login. Try again."));
        System.out.println("Invalid Login");
    }


}
