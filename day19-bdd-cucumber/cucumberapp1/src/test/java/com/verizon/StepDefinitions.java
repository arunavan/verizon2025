package com.verizon;

import com.verizon.Belly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @When("I wait 1 minute")
    public void allStepDefinitionsAreImplemented() {
    	  Belly belly = new Belly();
    	belly.waitStep();
    }
   @Then("my belly should grow")
    public void theScenarioPasses() {
    	  Belly belly = new Belly();
    	  belly.endProcess();
    }
    
    
	
	
	
	
	@Given("when i login")
    public void one() {
        System.out.println("testing started");
    }
    @When("add item to cart")
    public void pass() {
    	  System.out.println("pass");
    }
   @Then("able to checkout")
    public void checkout() {
    	 System.out.println("Success");
    }
    
    
	
	
}
