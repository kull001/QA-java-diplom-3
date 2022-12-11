import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPackage.*;

public class ConstructorTest {
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
    public void ConstructorCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ConstructorPage constructorPage = new ConstructorPage(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        mainPage.clickLK();
        constructorPage.clickConstructor();
        Assert.assertTrue(constructorPage.burgerIsVisible());

    }
    @Test
    public void LogoCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ConstructorPage constructorPage = new ConstructorPage(driver);
        PersonalAccount personalAccount = new PersonalAccount(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        mainPage.clickLK();
        personalAccount.clickLogo();
        Assert.assertTrue(constructorPage.burgerIsVisible());

    }
    @Test
    public void BreadCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ConstructorPage constructorPage = new ConstructorPage(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        constructorPage.clickSauces();
        constructorPage.clickBread();
        Assert.assertTrue(constructorPage.breadIsVisible());

    }
    @Test
    public void SaucesCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ConstructorPage constructorPage = new ConstructorPage(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        constructorPage.clickSauces();
        Assert.assertTrue(constructorPage.saucesIsVisible());

    }
    @Test
    public void FillingsCheck(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ConstructorPage constructorPage = new ConstructorPage(driver);
        mainPage.clickOrd();
        loginPage.setFieldEmail(email);
        loginPage.setFieldPassword(password);
        loginPage.clickEnter();
        constructorPage.clickFilling();
        Assert.assertTrue(constructorPage.fillingIsVisible());

    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
   }
}
