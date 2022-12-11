package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    //локатор кнопки зарегистрироваться
    private By registration = By.xpath(".//a[text()='Зарегистрироваться']");
    //локатор надписи Вход
    private By enter = By.xpath(".//div[@Class='Auth_login__3hAey']/h2");

    private By emailField = By.xpath(".//label[text()='Email']/following::input[1]");
    private By passwordField = By.xpath(".//label[text()='Email']/following::input[2]");
    private By enterButton = By.xpath(".//button[text()='Войти']");
    private By forgotPassButton = By.xpath(".//a[text()='Восстановить пароль']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //жмем зарегистрироваться
    public void clickRegistration(){

        driver.findElement(registration).click();
    }
    //жмем зарегистрироваться
    public boolean enterIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(enter));

        WebElement element = driver.findElement(enter);
        return element.isDisplayed();
    }

    public void setFieldEmail(String email){

        driver.findElement(emailField).sendKeys(email);
    }
    public void setFieldPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickEnter(){

        driver.findElement(enterButton).click();
    }
    public void clickForgotPass(){

        driver.findElement(forgotPassButton).click();
    }
}
