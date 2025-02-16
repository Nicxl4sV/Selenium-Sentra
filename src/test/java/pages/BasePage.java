package pages;

// Importaciones necesarias
import java.time.Duration;
import java.util.List;
import utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus
     * subclases
     */
    protected static WebDriver driver;

    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando
     * el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public BasePage(WebDriver driver) {
        BasePage.driver = DriverFactory.getDriver();
    }

    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        BasePage.driver.get(url);
    }

    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath,
    // esperando a que esté presentente en el DOM
    private WebElement Find(String locator, String... clickable) {
        if (clickable.length > 0) {
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        }
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator, "clickable").click();
    }

    public List<WebElement> FindElements(String locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public List<String> getElementsText(String locator) {
        List<WebElement> elements = FindElements(locator);
        return elements.stream().map(WebElement::getText).toList();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public boolean elementIsDisplayed(String locator) {
        return Find(locator).isDisplayed();
    }

    public void write(String locator, String keysToSend) {
        Find(locator).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Find(locator).sendKeys(Keys.BACK_SPACE);
        Find(locator).sendKeys(keysToSend);
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, Integer index) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }
    public String attributeAriaSortFromElement(String locator) {
        return driver.findElement(By.xpath(locator)).getDomAttribute("aria-sort");
    }


    public boolean isElementClickable(String buttonEditUser) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonEditUser)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}