package com.Selenium.SeleniumCucumberFramework1;

import Functions.Redirection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions 
{
	Redirection r = new Redirection();
	
    @Given("initialise the driver")
    public void initialise_the_driver()
    {
      r.ChromInitialise();
      r.OpenBrowser();
    }

    @When("individual flow")
    public void individual_flow() 
    {
    	r.TypeOfApplication();
    	r.WhenAreYouMoving();
    	r.WhenAreYouMovingContinue();
    	r.WhereAreYouMovingTo();
    	r.StartDateToRedirectYourMail();
    	r.ThreeSelectDurationAndPrice();
    	
    }
    @And("booking your redirection")
    public void booking_your_redirection()
    {
    	r.TotalPriceToPay();
    	r.DomesticAbuse();
    	r.DetailsOfWhoMoving();
    	r.DetailsOfWhoMovingContinue();
    }
    
    @Then("processing in the browser")
    public void processing_in_the_browser() 
    {
       r.YourMoveDetailsFrom();
       r.YourMoveDetailsTo();
       r.IsTheNewAddressYourOwn();
       r.WillYouBeReturningToYourOriginalAddressYes();
       r.YourMoveDetailsContinue();       
    }
    
    @And("exiting the browser")
    public void exiting_the_browser()
    {
    	r.RedirectionOptionsContinue();
    	r.SummaryBillingAddressNew();
    	r.SummaryContinueToPayment();
    	r.PayWithDebitOrCreditCard();
    	r.LastStepPaymentDeclined();
    	r.CloseBrowser();
    	
    }
    
    
    
}
