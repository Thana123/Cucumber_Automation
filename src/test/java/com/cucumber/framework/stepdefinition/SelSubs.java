package com.cucumber.framework.stepdefinition;

import java.util.Map;

import org.junit.Assert;

import com.cucumber.framework.helper.PageObject.SparkSportsHomepage.*;
import com.cucumber.framework.helper.PageObject.SparkSportsMonthlySubscriptionpage.MonthlySubs;
import com.cucumber.framework.helper.PageObject.SparkSportsloginpage.SparkSportsLoginpage;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelSubs {

	private MonthlySubs subsPage;

	@Then("^select sevenday free trial$")
	public void select_sevenday_free_trial() throws Throwable {
		subsPage.freeTrail();
		Assert.assertTrue(subsPage.checkForTitle("https://www.sparksport.co.nz/signup/1"));
	}

	@Then("^select voucher subscription$")
	public void select_voucher_subscription() throws Throwable {
		subsPage.useVouch();
		Assert.assertTrue(subsPage.checkForTitle("https://www.sparksport.co.nz/signup/1"));
	}

}
