package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BaseTest{
    @Test(priority = 1)
    public void findAdminInSearchEngine() {
        app.loginPage.userNameField.setValue(userCredentials.login);
        app.loginPage.passWordField.setValue(userCredentials.password);
        app.loginPage.loginButton.click();
        app.loginPage.searchEngine.click();
        app.loginPage.searchEngine.setValue("admin");
    }

    @Test(priority = 2)
    public void createUserInAdminPage() {
        String password = "12345q68";

        app.adminPage.adminTab.click();
        app.adminPage.userManagementTab.click();
        app.adminPage.addButton.click();
        app.adminPage.selectRoleList.click();
        app.adminPage.setUserRole.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.employeeName.setValue("Dino Silva Sauro");
        app.adminPage.employeeName.exists();
        app.adminPage.userStatus.click();
        app.adminPage.setUserStatus.getWrappedElement().findElement(byText("Enabled")).click();
        app.adminPage.userName.setValue("Dinosoa");
        app.adminPage.createPassword.setValue(password);
        app.adminPage.confirmPassword.setValue(password);
        app.adminPage.createButton.click();
    }
}
