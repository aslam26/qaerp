package implementation;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.CRM_Lead;

import static com.codeborne.selenide.Selenide.$;

public class CRM_Adding_New_Lead implements CRM_Lead {

    SelenideElement crmSideMenu=$(By.xpath("//span[normalize-space()='CRM']"));

    SelenideElement leadLink=$(By.xpath("//span[@class='link-content ellipsis']"));

    SelenideElement addLeadButton=$(By.xpath("//span[@data-label='Add%20Lead']"));

    SelenideElement firstNameInputField=$(By.xpath(""));

    SelenideElement organisationNameInputField=$(By.xpath(""));

    SelenideElement emailInputField=$(By.xpath(""));
    SelenideElement mobileNumberInputField=$(By.xpath(""));



    @Override
    public void clickCRM() {
        crmSideMenu.click();

    }

    @Override
    public void clickLead() {
        leadLink.click();

    }

    @Override
    public void addLead() {

        addLeadButton.click();

    }

    @Override
    public void createNewLead(String firstName, String organizationName, String mobileNo, String email) {

    }
}
