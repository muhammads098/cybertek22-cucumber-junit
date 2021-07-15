package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setupScenrio(){
        System.out.println("setting up browser with further details...");
    }

    @After
    public void tearDownScenario(){
        System.out.println("--Teardown steps are being applied...");
        Driver.closeDriver();
    }
}
