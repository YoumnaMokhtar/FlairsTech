package orangewebsite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/test/java/orangewebsite/login.feature",
            glue = {"orangewebsite"},
            plugin = {"pretty", "html:target/cucumber-reports/report.html"}
    )

    public class orangeWebsiteTestRunner extends AbstractTestNGCucumberTests {
    }


