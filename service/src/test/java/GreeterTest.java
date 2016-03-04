import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by padmamu on 3/4/16.
 */
public class GreeterTest {
    @org.junit.Test
    public void testGreeting() throws Exception {
        assertThat(new Greeter().greeting(), is("Hello world"));
    }
}