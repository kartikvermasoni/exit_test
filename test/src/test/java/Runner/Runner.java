package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

    @CucumberOptions(		//passed the package path for the feature files  
            features={"./src/test/java/Feature"},
            glue ="Step_Definition",//used glue to attach with Step definition 
            dryRun = false,
            monochrome = true,
            tags = {"@test1,@test2,@test3,@test4,@test5,@test6,@test7"} //used tags to call the tests 
        )
    
    public class Runner extends AbstractTestNGCucumberTests {

        }