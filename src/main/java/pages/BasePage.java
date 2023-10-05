package pages;

import org.openqa.selenium.By;

import static configure.DriverFactory.getDriver;

public class BasePage {

    public void openWeb(String site) {
        getDriver().get(site);
    }

    public void writeElementID(String id_field, String Text) {
        getDriver().findElement(By.id(id_field)).sendKeys(Text);
    }

    public void clickElementID(String id_field) {
        getDriver().findElement(By.id(id_field)).click();
    }

    public void clickElementClass(String Class) {
        getDriver().findElement(By.className(Class));
    }

    public String getTextXpath(String xpath) {
        return getDriver().findElement(By.xpath(xpath)).getText();

    }

    public String getTextID(String id) {
        return getDriver().findElement(By.id(id)).getText();

    }

}