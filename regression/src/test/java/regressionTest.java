import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by padmamu on 3/7/16.
 */
public class regressionTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:4567/hello");
        driver.navigate();
    }

    @Test
    public void findPage() throws Exception {
        assertThat(driver.findElement(By.tagName("a")).getText(), is("OK"));
    }

    @Test
    public void testIfOKGoesToOkPage() throws Exception {
        WebElement href = driver.findElement(By.tagName("a"));
        href.click();
        assertThat(driver.findElement(By.tagName("h1")).getText(), is("OK"));
    }

}
