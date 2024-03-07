package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import Configuration.ConfigProvider;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    @Parameters("environment")
    public static void  setUp(String environment){

        ConfigProvider.ConfigureSelenide(environment);
        open(Configuration.baseUrl);

    }

}
