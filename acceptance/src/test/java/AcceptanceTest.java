import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by padmamu on 3/7/16.
 */
public class AcceptanceTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:4567/hello");
        driver.navigate();
    }

    @Test
    public void testHeading() throws Exception {
        assertThat(driver.findElement(By.tagName("h1")).getText(), is("Greeter"));
    }

    @Test
    public void testParagraph() throws Exception {
        assertThat(driver.findElement(By.tagName("p")).getText(), is("Hello World!"));
    }
}
