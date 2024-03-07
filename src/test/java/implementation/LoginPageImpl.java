package implementation;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageImpl implements LoginPage {

    private final SelenideElement usernameField=$(By.xpath("//input[@id='login_email']"));
    private final SelenideElement passwordField=$(By.xpath("//input[@id='login_password']"));

    public final SelenideElement loginButton=$(By.xpath("//button[@class='btn btn-sm btn-primary btn-block btn-login']"));



    @Override
    public void enterUsername(String username) {
        usernameField.setValue(username);

    }

    @Override
    public void enterPassword(String password) {

        passwordField.setValue(password);

    }

    @Override
    public void clickLoginButton() {

        loginButton.click();

    }
}
