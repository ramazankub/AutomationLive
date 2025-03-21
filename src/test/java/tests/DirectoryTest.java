package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class DirectoryTest extends BaseTest{

    @Test
    public void findCharacter() {
     app.loginPage.userNameField.setValue(userCredentials.login);
     app.loginPage.passWordField.setValue(userCredentials.password);
     app.loginPage.loginButton.click();
     app.directoryPage.directoryTab.click();
     app.directoryPage.employeeName.setValue("Walter Hitchcock Amato");
     app.directoryPage.jobTitleList.click();
     app.directoryPage.getFromJobTitleList.getWrappedElement().findElement(byText("HR Manager")).click();
     app.directoryPage.getCharacterLocation.click();
     app.directoryPage.getFromCharacterLocation.getWrappedElement().findElement(byText("Texas R&D")).click();
     app.directoryPage.searchButton.click();
    }
}
