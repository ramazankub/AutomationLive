package tests;

import org.example.App.App;
import org.example.App.UserCredentials;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    App app = new App();
    UserCredentials userCredentials = new UserCredentials();

    @BeforeTest
    public void setUp() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @AfterClass
    public void tearDown() {

    }
}
