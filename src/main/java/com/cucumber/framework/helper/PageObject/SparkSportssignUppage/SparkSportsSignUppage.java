package com.cucumber.framework.helper.PageObject.SparkSportssignUppage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.TextBox.TextBoxHelper;

import com.cucumber.framework.helper.Navigation.*;;
public class SparkSportsSignUppage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(SparkSportsSignUppage.class);

	public SparkSportsSignUppage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	/** Web Elements */
	
	@FindBy(how=How.NAME,using="firstName")
	public WebElement firstName;
	@FindBy(how=How.NAME,using="lastName")
	public WebElement lastName;
	@FindBy(how=How.NAME,using="email")
	public WebElement email;
	@FindBy(how=How.NAME,using="password")
	public WebElement passWord;
	@FindBy(how=How.NAME,using="mktgOptIn")
	public WebElement mktgOptIn;
	@FindBy(how=How.NAME,using="agreeToTerms")
	public WebElement termsanCon;
	@FindBy(how=How.XPATH,using="//div[3]/div/form/div/div[8]/button")
	public WebElement alReadysignedup;
	@FindBy(how=How.XPATH,using="//div[3]/div/form/div/div[9]/button")
	public WebElement createAccount;
	
	
	/** Actions */
	
	public void fstName(String firname){
		firstName.sendKeys(firname);
	}
	public void lstName(String lnam){
		lastName.sendKeys(lnam);
	}
	public void eMail(String mailID){
		email.sendKeys(mailID);
	}
	public void pasWrd(String pWord){
		passWord.sendKeys(pWord);
	}
	public void mrktOpt(){
		mktgOptIn.click();;
	}
	public void ternCon(){
		termsanCon.click();;
	}
	public void alreadySigned(){
		alReadysignedup.click();
	}
	public void creteAcc(){
		createAccount.click();
	}
}
