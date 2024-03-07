package implementation;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HR_Add_New_Employee implements pages.HR_Add_New_Employee {

    SelenideElement hrSideMenu=$(By.xpath("//span[@class='sidebar-item-label' and text()='HR']"));
    SelenideElement employeeLink=$(By.xpath("//span[@class='ellipsis' and text()='Employee']"));

    SelenideElement addEmployeeButton=$(By.xpath("//button[@class='btn btn-primary btn-sm primary-action' and @data-label='Add Employee']"));

    SelenideElement firstNameInputField=$(By.xpath("//input[@data-fieldname='first_name']"));

    SelenideElement genderDropDown=$(By.xpath("//input[@data-fieldname='gender']"));

    SelenideElement companyDropDown=$(By.xpath("//input[@data-fieldname='gender']"));

    SelenideElement designationInputField=$(By.xpath("//input[@data-fieldname='designation']"));

    SelenideElement dateOfJoiningDateSelector=$(By.xpath("//input[@data-fieldname='date_of_joining']"));

    SelenideElement dateOfBithDateSelector=$(By.xpath("//input[@data-fieldname='date_of_birth']"));


    @Override
    public void clickHR() {
        hrSideMenu.click();
    }

    @Override
    public void clickEmployee() {
        employeeLink.click();

    }

    @Override
    public void addEmployee() {

        addEmployeeButton.click();
    }

    @Override
    public boolean createNewEmployee(String firstName,
                                     String gender,
                                     String dateOfBirth,
                                     String dateOfJoining,
                                     String companyName,
                                     String designation)
    {

        firstNameInputField.setValue(firstName);
        genderDropDown.click();
        genderDropDown.setValue(gender);
        dateOfBithDateSelector.setValue(dateOfBirth);
        dateOfJoiningDateSelector.setValue(dateOfJoining);
        companyDropDown.click();
        companyDropDown.setValue(companyName);
        designationInputField.setValue(designation);

        boolean employeeCreated= true;

        return employeeCreated;

    }


}
