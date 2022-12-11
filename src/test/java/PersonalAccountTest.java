import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPackage.LoginPage;
import pageObjectPackage.MainPage;
import pageObjectPackage.PersonalAccount;
import pageObjectPackage.RegistrationPage;

public class PersonalAccountTest {
    private WebDriver driver;
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
    public void loginFromPersonalAccountCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PersonalAccount personalAccount = new PersonalAccount(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        mainPage.clickLK();
        Assert.assertTrue(personalAccount.setProfIsVisible());

    }
    @Test
    public void exitFromAccountCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PersonalAccount personalAccount = new PersonalAccount(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        mainPage.clickLK();
        personalAccount.clickExit();
        Assert.assertTrue(loginPage.enterIsVisible());

    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
