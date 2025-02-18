package TestsProperties;

import org.junit.jupiter.api.Test;

public class TestProperty {

    @Test
    void testsProperties() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "122");
        String windowSize = System.getProperty("windowSize", "1920x1080");
        String selenoidHost = System.getProperty("windowSize");
    }
}
