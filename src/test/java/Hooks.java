import commonLibraries.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeTest(){
        commonFunctions.openbrowser();
    }

    @After
    public void afterTest(){
        commonFunctions.closeBrowser();
    }


}
