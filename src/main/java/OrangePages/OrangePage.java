package OrangePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePage extends LandingPage {


    @FindBy(name = "username")
    WebElement userName;
    @FindBy(name = "password")
    WebElement Password;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loginButton;
    @FindBy(xpath = "//h6[contains(@class, 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module')]")
    WebElement dashboardText;
    @FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
    WebElement adminButton;
    @FindBy(xpath = "//h6[contains(@class, 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level')]")
    WebElement userManamentHeader;
    @FindBy(css = "span.oxd-text.oxd-text--span[data-v-f5806396]")
    WebElement numberOfRecords;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    WebElement addButton;
    @FindBy(xpath = "//form//i")
    WebElement userRoleDropDownList;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    WebElement employeeName;
    @FindBy(className = "oxd-autocomplete-option")
    WebElement employeeType;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")
    WebElement status;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement disabledStatus;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    WebElement userNameData;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    WebElement confirmPassword;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
     WebElement usernameSearchbar;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    WebElement searchButton;
    @FindBy(xpath = "//button[contains(@class, 'oxd-icon-button') and contains(@class, 'oxd-table-cell-action-space')]")
    WebElement deleteIcon;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--label-danger")
    WebElement deleteButtonPopUp;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    WebElement resetButton;

    public OrangePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
       return Password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
    public WebElement getDashboardText(){
        return dashboardText;
    }
    public WebElement getAdminButton(){
        return adminButton;
    }
    public WebElement getUserManamentHeader(){
        return userManamentHeader;
    }
    public WebElement getNumberOfRecords(){return numberOfRecords;}
    public WebElement getAddButton(){return addButton;}
    public WebElement getUserRoleDropDownList(){return userRoleDropDownList;}
    public WebElement getEmployeeName(){return employeeName;}
    public WebElement getStatus(){return status;}
    public WebElement getUserNameData(){return userNameData;}
    public WebElement getPasswordInput(){return passwordInput;}
    public WebElement getConfirmPassword(){return confirmPassword;}
    public WebElement getDisabledStatus(){return disabledStatus;}
    public WebElement getSubmitButton(){return submitButton;}
    public WebElement getEmployeeType(){return employeeType;}
    public WebElement getUsernameSearchbar(){return usernameSearchbar;}
    public WebElement getSearchButton(){ return searchButton;}
    public WebElement getDeleteIcon(){return deleteIcon;}
    public WebElement getDeleteButtonPopUp(){return deleteButtonPopUp;}
    public WebElement getResetButton(){return resetButton;}
    public void enterUserName(String username){
        getUserName().sendKeys(username);
    }
    public void enterPasswrod(String password){
        getPassword().sendKeys(password);
    }
    public void clickOnLoginButton(){
        getLoginButton().click();
    }
    public void clickOnAdminButton(){
        getAdminButton().click();
    }

    public void clickOnAddButton(){
        getAddButton().click();
    }
    public void EmployeeNameText(String employeeName){
        getEmployeeName().sendKeys(employeeName);
    }
    public void UserNameText(String userNameData){
        getUserNameData().sendKeys(userNameData);
    }
    public void passwordText(String passwordInput){
        getPasswordInput().sendKeys(passwordInput);
    }
    public void confirmPassworText(String confirmPasswordText){
        getConfirmPassword().sendKeys(confirmPasswordText);
    }
    public void submitButton(){getSubmitButton().click();}
    public void UsernameSearchbar(String usernameSearch){
        getUsernameSearchbar().sendKeys(usernameSearch);
    }
    public void clickOnSearchButon(){
        getSearchButton().click();
    }
    public void clickOndeleteIcon(){
        getDeleteIcon().click();
    }
    public void deleteButtonPopUp(){
        getDeleteButtonPopUp().click();
    }
   public void clickOnResetButton(){
        getResetButton().click();

   }



}


