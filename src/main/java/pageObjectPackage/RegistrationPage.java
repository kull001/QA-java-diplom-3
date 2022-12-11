package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private WebDriver driver;
    //локатор поля имя
    private By fieldName = By.xpath(".//label[text()='Имя']/following::input[1]");
    //локатор поля email
    private By fieldEmail = By.xpath(".//label[text()='Имя']/following::input[2]");
    //локатор поля пароль
    private By fieldPassword = By.xpath(".//label[text()='Имя']/following::input[3]");
    //локатор поля зарегистрироваться
    private By fieldRegistration = By.xpath(".//button[text()='Зарегистрироваться']");

    private By fieldInvalidPassword = By.xpath(".//p[text()='Некорректный пароль']");
    private By fieldEnter = By.xpath(".//a[text()='Войти']");
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    //Заполняем "Имя"
    public void setFieldName(String name){

        driver.findElement(fieldName).sendKeys(name);
    }
    //Заполняем "email"
    public void setFieldEmail(String email){

        driver.findElement(fieldEmail).sendKeys(email);
    }
    //Заполняем "пароль"
    public void setFieldPassword(String password){

        driver.findElement(fieldPassword).sendKeys(password);
    }
    public void clickRegistration(){

        driver.findElement(fieldRegistration).click();
    }
    public boolean invalidPasswordIsVisible(){

        WebElement element = driver.findElement(fieldInvalidPassword);
        return element.isDisplayed();
    }
    public void clickEnter(){

        driver.findElement(fieldEnter).click();
    }
}
