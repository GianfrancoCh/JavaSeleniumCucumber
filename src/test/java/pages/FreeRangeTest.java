package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FreeRangeTest {
    
    private WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosAFreeRangeTesters(){
        //Navega a a pagina web
        driver.get("https://www.freerangetesters.com");
    }

    @AfterMethod
    public void tearDown(){
        //Cierra navegador
        if(driver != null){
            driver.quit();
        }
    }

}
