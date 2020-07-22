package com.cucumber.framework.stepdefinition;

import java.util.Map;

import org.junit.Assert;

import com.cucumber.framework.helper.PageObject.SparkSportsHomepage.*;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HmPage {

	private SparkSportsHomepage hPage;

	@Given("^At the home page https://www\\.sparksport\\.co\\.nz/$")
	public void at_the_home_page_https_www_sparksport_co_nz() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		hPage = new SparkSportsHomepage(ObjectRepo.driver);
		ObjectRepo.data.put("HomePage", hPage);
	}

	@When("^Click on  login$")
	public void click_on_login(String ltitle ) throws Throwable {
		hPage.login();
		Assert.assertTrue(hPage.checkForTitle(ltitle));
	}

	@When("^Click on  signup$")
	public void click_on_signup(String sigtitle) throws Throwable {
		hPage.sigUp();
		Assert.assertTrue(hPage.checkForTitle(sigtitle));
	}

	@When("^Click on  discover$")
	public void click_on_discover(String dtitle) throws Throwable {
		hPage.disCov();
		Assert.assertTrue(hPage.checkForTitle(dtitle));
	}

	@When("^Click on  LearnMore$")
	public void click_on_LearnMore(String llrntitle) throws Throwable {
		hPage.learnMr();
		Assert.assertTrue(hPage.checkForTitle(llrntitle));
	}

}
