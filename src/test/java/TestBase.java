import com.codeborne.selenide.Configuration;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize= "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
//        Configuration.holdBrowserOpen = true;
  //      Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
            }
            @AfterEach
    void addAttachments(){
                Attach.screenshotAs("Screenshot after test case");
            }
}
