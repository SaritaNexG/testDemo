import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".",tags="@Searchvalid",dryRun = true)
//@CucumberOptions(features=".",tags="@Searchvalid, @regression",dryRun = true)
public class Run {

}
