
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //html = TYPE OF THE REPORTS
        //target = REPORT FOLDER
        //default-cucumber-reports = REPORT NAME
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "C:\\Users\\aatil\\Desktop\\Automation_Interview\\RXMG_Conduit\\src\\test\\resources\\feature_files",
        glue = "stepdefinitions",
        tags = "@abc",
        dryRun = false

)
public class conduitRunner {
}
