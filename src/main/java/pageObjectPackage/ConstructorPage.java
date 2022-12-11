package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConstructorPage {

    private WebDriver driver;

    //локатор кнопки зарегистрироваться

    private By constructor = By.xpath(".//p[text()='Конструктор']");
    private By burger = By.xpath(".//h1[text()='Соберите бургер']");
    private By bread = By.xpath(".//div[@style='display: flex;']/div[1]");
    private By sauces = By.xpath(".//div[@style='display: flex;']/div[2]");
    private By fillings = By.xpath(".//div[@style='display: flex;']/div[3]");
    private By breadSelect = By.xpath(".//div[@Class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Булки']");
    private By fillingSelect = By.xpath(".//div[@Class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Начинки']");
    private By saucesSelect = By.xpath(".//div[@Class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Соусы']");

    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickConstructor(){

        driver.findElement(constructor).click();
    }
    public boolean burgerIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(burger));
        WebElement element = driver.findElement(burger);
        return element.isDisplayed();
    }
    public void clickBread(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(bread));
        driver.findElement(bread).click();
    }
    public boolean breadIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(breadSelect));
        WebElement element = driver.findElement(breadSelect);
        return element.isEnabled();
    }
    public void clickSauces(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(sauces));
        driver.findElement(sauces).click();
    }
    public boolean saucesIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(saucesSelect));
        WebElement element = driver.findElement(saucesSelect);
        return element.isEnabled();
    }
    public void clickFilling(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(fillings));
        driver.findElement(fillings).click();
    }
    public boolean fillingIsVisible(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(fillingSelect));
        WebElement element = driver.findElement(fillingSelect);
        return element.isEnabled();
    }

}
