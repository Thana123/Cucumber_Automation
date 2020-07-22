package com.cucumber.framework.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.cucumber.framework.helper.PageObject.SparkSportsHomepage.*;
import com.cucumber.framework.helper.PageObject.SparkSportsMonthlySubscriptionpage.MonthlySubs;
import com.cucumber.framework.helper.PageObject.SparkSportssignUppage.SparkSportsSignUppage;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupPg {
	
	private SparkSportsHomepage hPage;
	private SparkSportsSignUppage signupPage;
	private MonthlySubs subsPage;
	

	@Then("^Select seven days free trial subscription$")
	public void select_days_free_trial_subscription(int arg1) throws Throwable {
		subsPage.freeTrail();
		Assert.assertTrue(subsPage.checkForTitle("https://www.sparksport.co.nz/signup/1"));
	}

	@Then("^Fill and submit the signup form$")
	public void fill_and_submit_the_signup_form(DataTable userdetails) throws Throwable {
		List<List<String>> data = userdetails.raw();
		
	    signupPage.fstName(data.get(1).get(0));
	    signupPage.lstName(data.get(1).get(1));
	    signupPage.eMail(data.get(1).get(2));
	    signupPage.pasWrd(data.get(1).get(3));
	    signupPage.mrktOpt();
	    signupPage.ternCon();
	    signupPage.creteAcc();
	    Assert.assertTrue(subsPage.checkForTitle("https://www.sparksport.co.nz/subscribe"));
	    
	}


}
