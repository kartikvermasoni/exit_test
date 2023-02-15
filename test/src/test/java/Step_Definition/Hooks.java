package Step_Definition;

import base.Screenshot;
import base.baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends baseclass{
	@Before						  //before test
    public void Beforescenario() {
    setup();
   System.out.println("Hook Begins...");	
    }

    @After						  //after test
    public void Afterscenario(Scenario scenario) {
    	
    	if(scenario.isFailed()) {
    	Screenshot.takeScreenShot(wd, scenario.getName());
    	}
    	
        Stopappium();
        System.out.println("Hook Ends");

    }
    }

	

