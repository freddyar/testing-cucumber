package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

/**
 * @author freddyar
 */
public class Control {

    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void findControl() {
        this.control = Session.getInstance().getBrowser().findElement(locator);
    }

    public void click() {
        this.findControl();
        control.click();
    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
