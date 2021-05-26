package cucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Resources/MyFeature.feature"
        ,glue={"StepDefination/StepDef.java"}
)

public class TestRunner {

}
