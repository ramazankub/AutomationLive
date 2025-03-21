package testPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends BasePage{
    public SelenideElement addButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium " +
            "oxd-button--secondary']"));

    public SelenideElement selectRoleList = $(By.xpath("(//div[@class='oxd-select-text " +
            "oxd-select-text--active'])[1]"));

    public SelenideElement adminTab = $(By.xpath("//*[@href='/web/index.php/admin/viewAdminModule']"));
    public SelenideElement userManagementTab = $(By.xpath("//li[@class='oxd-topbar-body-nav-tab " +
            "--parent --visited']"));
    public SelenideElement setUserRole = $(By.xpath("//div[@class='oxd-select-dropdown --positon-" +
            "bottom']"));

    public SelenideElement employeeName = $(By.xpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement userStatus = $(By.xpath("(//div[@class='oxd-select-text " +
            "oxd-select-text--active'])[2]"));

    public SelenideElement setUserStatus = $(By.xpath("//div[@class='oxd-select-dropdown --positon-" +
            "bottom']"));

    public SelenideElement userName = $(By.xpath("(//input[@autocomplete='off'])[1]"));
    public SelenideElement createPassword = $(By.xpath("(//input[@autocomplete='off'])[2]"));
    public SelenideElement confirmPassword = $(By.xpath("(//input[@autocomplete='off'])[3]"));
    public SelenideElement createButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium " +
            "oxd-button--secondary orangehrm-left-space'and@type='submit']"));
}
