package testPages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
   public SelenideElement userNameField =  $(By.xpath("//input[@name='username']"));
   public SelenideElement passWordField = $(By.xpath("//input[@name='password']"));
   public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
   public SelenideElement searchEngine = $(By.xpath("//input"));
   public ElementsCollection findInputs = $$(By.xpath("//*/input"));
}
