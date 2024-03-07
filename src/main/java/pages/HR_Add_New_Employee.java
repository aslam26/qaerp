package pages;

public interface HR_Add_New_Employee {

    void clickHR();

    void clickEmployee();

    void addEmployee();

    boolean createNewEmployee(String firstName,
                              String gender,
                              String dateOfBirth,
                              String dateOfJoining,
                              String companyName,
                              String designation);




}
