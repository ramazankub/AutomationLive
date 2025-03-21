package tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @Test
    public void logIn() {
        app.loginPage.userNameField.setValue(userCredentials.login);
        app.loginPage.passWordField.setValue(userCredentials.password);
        app.loginPage.loginButton.click();
    }

    @Test
    public void allInputs() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        for (SelenideElement findInput : app.loginPage.findInputs) {
            System.out.println(findInput.getAttribute("name"));
        }
    }
}
