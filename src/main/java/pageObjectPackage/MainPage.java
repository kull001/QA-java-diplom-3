package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    // локатор кнопки "Войти в аккаунт"
    private By enter = By.xpath(".//button[text()='Войти в аккаунт']");
    private By setOrder = By.xpath(".//button[text()='Оформить заказ']");
    private By personalAccount = By.xpath(".//p[text()='Личный Кабинет']");





    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
//жмем войти в аккаунт
    public void clickOrd(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(enter));
        driver.findElement(enter).click();
    }
    public boolean setOrderIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(setOrder));
        WebElement element = driver.findElement(setOrder);
        return element.isDisplayed();
    }
    public void clickLK(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(personalAccount));
        driver.findElement(personalAccount).click();
    }

}
