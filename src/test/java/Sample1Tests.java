import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@UsePlaywright(PlaywrightOptions.class)
public class Sample1Tests {

    @BeforeEach
    void beforeEach(Page page) {
        page.navigate("/");
    }

    @Test
    void testPageTitle(Page page) {
        assertThat(page).hasTitle("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
    }
}
