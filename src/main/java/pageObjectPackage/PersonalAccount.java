package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PersonalAccount {
    private WebDriver driver;

    //локатор кнопки зарегистрироваться
    private By prof = By.xpath(".//a[text()='Профиль']");
    private By logo = By.xpath(".//div/a[@href='/']");
    private By exit = By.xpath(".//button[text()='Выход']");

    public PersonalAccount(WebDriver driver) {
        this.driver = driver;
    }


    public boolean setProfIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(prof));
        WebElement element = driver.findElement(prof);
        return element.isDisplayed();
}
    public void clickLogo(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(logo));
        driver.findElement(logo).click();
    }
    public void clickExit(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(exit));
        driver.findElement(exit).click();
    }
}
