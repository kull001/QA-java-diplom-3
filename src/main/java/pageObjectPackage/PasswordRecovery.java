package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordRecovery {
    private WebDriver driver;

    private By fieldEnter = By.xpath(".//a[text()='Войти']");

    public PasswordRecovery(WebDriver driver) {
        this.driver = driver;
    }


    public void clickEnter(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(fieldEnter));
        driver.findElement(fieldEnter).click();
    }
}
