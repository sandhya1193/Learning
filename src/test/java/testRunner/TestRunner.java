package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//sandh//IdeaProjects//untitled3//Features//OrangeHRM.feature",
        glue = "stepDefination")
public class TestRunner {
}
