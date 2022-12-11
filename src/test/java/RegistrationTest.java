import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectPackage.LoginPage;
import pageObjectPackage.MainPage;
import pageObjectPackage.RegistrationPage;

public class RegistrationTest {
    private WebDriver driver;

    private  String name = "Alex";
    private  String email = "testUser55@yandex.ru";
    private  String password = "123456";
    private  String invalidPassword = "123";
    @Before
    public void beginning() {

        // драйвер для браузера Chrome
        driver = new ChromeDriver();

        //драйвер для запуска браузера Яндекс
//        System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\yandex\\chromedriver_win32 (1)\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\Users\\User\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
//        driver = new ChromeDriver(options);


        // переход на страницу тестового приложения
        driver.get("https://stellarburgers.nomoreparties.site/");

    }

    @Test
    public void registrationCheck(){
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickOrd();
        loginPage.clickRegistration();
        registrationPage.setFieldName(name);
        registrationPage.setFieldEmail(email);
        registrationPage.setFieldPassword(password);
        registrationPage.clickRegistration();
        Assert.assertTrue(loginPage.enterIsVisible());
    }
    @Test
    public void registrationWithInvalidPasswordCheck(){
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickOrd();
        loginPage.clickRegistration();
        registrationPage.setFieldName(name);
        registrationPage.setFieldEmail(email);
        registrationPage.setFieldPassword(invalidPassword);
        registrationPage.clickRegistration();
        Assert.assertTrue(registrationPage.invalidPasswordIsVisible());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
