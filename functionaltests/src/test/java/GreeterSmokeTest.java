import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by padmamu on 3/4/16.
 */
public class GreeterSmokeTest {
    @Test
    public void testIfServerIsUpAndRunning() throws Exception {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:4567/hello");
        driver.navigate();
        assertThat(driver.getTitle(), is("Greeter"));
    }
}
