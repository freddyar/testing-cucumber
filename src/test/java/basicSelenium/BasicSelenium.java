package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * @author freddyar
 */
public class BasicSelenium {

    ChromeDriver driver;

    @BeforeEach
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wail --> generyc
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testSomeThing() {
        // steps
        // click boton login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // escribir email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("maestria@maestria.com");
        //escribir password
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        // click boton login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        // check
        Assertions.assertTrue(
                driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(),
                "ERROR, el usuario no pudo iniciar session"
        );
    }
}
