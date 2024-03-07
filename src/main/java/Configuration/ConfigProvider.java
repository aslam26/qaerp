package Configuration;

import  com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

public class ConfigProvider {

    public static void ConfigureSelenide(String environment) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        Configuration.browser = "Chrome";
        Configuration.baseUrl =getBaseUrl(environment);

    }

    private static String getBaseUrl(String environment){
        // Alternatively, you can define multiple base URLs in a Map
        Map<String,String> baseUrlMap=new HashMap<>();
        baseUrlMap.put("local","http://localhost:8080");
        baseUrlMap.put("QA","");
        baseUrlMap.put("PROD","https://www.amazon.in/");


        return baseUrlMap.getOrDefault(environment,"");//Returns empty String if environment not found.
    }

}
