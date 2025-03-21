package testPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DirectoryPage extends BasePage {
    public SelenideElement directoryTab = $(By.xpath("//*[@href=" +
            "'/web/index.php/directory/viewDirectory']"));

    public SelenideElement employeeName = $(By.xpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement jobTitleList = $(By.xpath("(//div[@class='oxd-select-text " +
            "oxd-select-text--active'])[1]"));

    public SelenideElement getFromJobTitleList =  $(By.xpath("//div[@class='oxd-select-dropdown --positon-" +
            "bottom']"));

    public SelenideElement getCharacterLocation = $(By.xpath("(//div[@class='oxd-select-text " +
            "oxd-select-text--active'])[2]"));

    public SelenideElement getFromCharacterLocation =  $(By.xpath("//div[@class='oxd-select-dropdown " +
            "--positon-bottom']"));

    public SelenideElement searchButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium " +
            "oxd-button--secondary orangehrm-left-space']"));
}
