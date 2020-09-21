package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resource/login/Lofin.feature"},
        glue = {"stepdefs"},
dryRun = true,
        monochrome=true,
        strict=true,
plugin= {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
)
public class runner {



}
