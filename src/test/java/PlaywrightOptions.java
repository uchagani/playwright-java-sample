import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;

public class PlaywrightOptions implements OptionsFactory {
    @Override
    public Options getOptions() {
        return new Options().setBaseUrl("https://www.browserstack.com/").setLaunchOptions(getLaunchOptions());
    }

    private BrowserType.LaunchOptions getLaunchOptions() {
        return new BrowserType.LaunchOptions().setHeadless(false);
    }
}
