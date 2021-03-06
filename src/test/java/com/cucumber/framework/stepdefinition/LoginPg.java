package com.cucumber.framework.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.cucumber.framework.helper.PageObject.SparkSportsHomepage.*;
import com.cucumber.framework.helper.PageObject.SparkSportsloginpage.SparkSportsLoginpage;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPg {

	private SparkSportsLoginpage LoginPage;

	@Then("^Login with username and password$")
	public void login_with_username_and_password(DataTable usercredentials) throws Throwable {
		
		List<List<String>> data = usercredentials.raw();
		LoginPage.uname(data.get(0).get(0));
		LoginPage.passwrd(data.get(0).get(1));
	}

	@When("^Click on  forgot password$")
	public void click_on_forgot_password() throws Throwable {
		LoginPage.frgtPasswrd();

	}

	@Then("^Request new Password$")
	public void request_new_Password(DataTable emailIDs) throws Throwable {
		List<List<String>> data = emailIDs.raw();
		LoginPage.frgtPasswrd();
		String getconftext = LoginPage.getreqNwPword();
		Assert.assertEquals(getconftext , "A password reset link has been requested for" + data.get(0).get(0));
	}



}
