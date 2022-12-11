import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPackage.LoginPage;
import pageObjectPackage.MainPage;
import pageObjectPackage.PasswordRecovery;
import pageObjectPackage.RegistrationPage;

public class LoginTest {
    private WebDriver driver;
    private  String name = "Alex";
    private  String email = "testUser55@yandex.ru";
    private  String password = "123456";


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
    public void loginCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        Assert.assertTrue(mainPage.setOrderIsVisible());

    }

    @Test
    public void loginLKCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickLK();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        Assert.assertTrue(mainPage.setOrderIsVisible());

    }
    @Test
    public void loginRegistrationFormCheck(){
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickOrd();
        loginPage.clickRegistration();
        registrationPage.clickEnter();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        Assert.assertTrue(mainPage.setOrderIsVisible());

    }
    @Test
    public void loginForgotPassCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PasswordRecovery passwordRecovery = new PasswordRecovery(driver);
        mainPage.clickOrd();
        loginPage.clickForgotPass();
        passwordRecovery.clickEnter();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        Assert.assertTrue(mainPage.setOrderIsVisible());


    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
