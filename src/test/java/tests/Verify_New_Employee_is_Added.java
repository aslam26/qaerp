package tests;

import implementation.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HR_Add_New_Employee;

public class Verify_New_Employee_is_Added extends BaseTest{

    @Test
    public void addNewEmployee() throws InterruptedException {
        HR_Add_New_Employee newEmployee = new implementation.HR_Add_New_Employee();
        newEmployee.clickHR();
        newEmployee.clickEmployee();
        newEmployee.addEmployee();
        boolean flag1=newEmployee.createNewEmployee("oggy", "Male", "02-03-1999", "02-03-2024", "Symphony", "QA");

        Assert.assertTrue(flag1);
        System.out.println("***************** All field filled ****************");

        if(flag1){
            //newEmployee.saveButton();
            CommonActions.clickSaveButton();

        }
    }

}
