package orangewebsite;

import OrangePages.OrangePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class OrangeStepefs extends TestBase {
    public WebDriver driver;
    public OrangePage orange;

    @Before

    public void setUp() {
        driver = TestBase.getWebDriver();
        orange = new OrangePage(driver);
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("open orangeHRM website")
    public void openOrangeHRMWebsite() throws InterruptedException {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

    }

    @Then("click on login button")
    public void clickOnLoginButton() {
        orange.clickOnLoginButton();

    }

    @Then("it will be redirected to dashboard")
    public void itWillBeRedirectedToDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//h6[contains(@class, 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module')]")));
        Assert.assertTrue(orange.getDashboardText().isDisplayed());
    }

    @Then("write password {string}")
    public void writePassword(String password) {
        orange.enterPasswrod(password);
    }

    @When("write username {string}")
    public void writeUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        orange.enterUserName(username);
    }

    @When("click on Admin button")
    public void clickOnAdminButton() {
        orange.clickOnAdminButton();

    }

    @Then("it will navigate to user managment page")
    public void itWillNavigateToUserManagmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//h6[contains(@class, 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level')]")));
        orange.getUserManamentHeader().isDisplayed();

    }

    @Then("I check the number of records")
    public void iCheckTheNumberOfRecords() {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(orange.getNumberOfRecords()));
        String recordsText = (String)((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;", orange.getNumberOfRecords());
        System.out.println("Records Found: " + recordsText.trim());

    }
    @Then("click on Add button")
    public void clickOnAddButton() {
        orange.clickOnAddButton();
    }


    @Then("click on user Role dropdown list and choose ESS")
    public void clickOnUserRoleDropdownListAndChooseESS() {

       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//form//i")));
        orange.getUserRoleDropDownList().click();
       String essSelect = "ESS";
        List<WebElement> optionList = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
        for (WebElement ele:optionList){
            String currentText = ele.getText();
            System.out.println(currentText);
            if(currentText.contains(essSelect)){
                ele.click();
                break;
            }}
    }

    @Then("Type the Employee name {string}")
    public void typeTheEmployeeName(String employeeName){
        orange.EmployeeNameText(employeeName +" ");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.invisibilityOf
                (driver.findElement(By.className("oxd-autocomplete-option"))));
        orange.getEmployeeType().click();

    }

    @Then("click on status dropdown list and choose active")
    public void clickOnStatusDropdownListAndChooseActive() {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")));
        orange.getStatus().click();
        String essSelect = "Disabled";
        List<WebElement> optionList = driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
        for (WebElement ele:optionList){
            String currentText = ele.getText();
            System.out.println(currentText);
            if(currentText.contains(essSelect)){
                ele.click();
                break;
            }}

    }

    @Then("Type username {string}")
    public void typeUsername(String usernameText) {
        orange.UserNameText(usernameText);
    }

    @Then("Type the password {string}")
    public void typeThePassword(String passwordText) {
        orange.passwordText(passwordText);
    }

    @Then("Type confirm password {string}")
    public void typeConfirmPassword(String confirmPasswordText) {
        orange.confirmPassworText(confirmPasswordText);
    }

    @Then("click on submit button")
    public void clickOnSubmitButton() {

        orange.submitButton();
    }

    @Then("Type in search bar the new added username{string}")
    public void typeInSearchBarTheNewAddedUsername(String usernameSearch) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")));
        orange.UsernameSearchbar(usernameSearch);
    }

    @Then("click on search button")
    public void clickOnSearchButton() {
        orange.clickOnSearchButon();

    }

    @Then("click on delete icon")
    public void clickOnDeleteIcon() {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//button[contains(@class, 'oxd-icon-button') and contains(@class, 'oxd-table-cell-action-space')]")));
        orange.clickOndeleteIcon();
    }


    @Then("click on delete button in popup screen")
    public void clickOnDeleteButtonInPopupScreen() throws InterruptedException {
        orange.deleteButtonPopUp();
        Thread.sleep(5000);
    }

    @Then("click on reset button")
    public void clickOnResetButton() throws InterruptedException {
        orange.clickOnResetButton();
        Thread.sleep(5000);
    }

}
