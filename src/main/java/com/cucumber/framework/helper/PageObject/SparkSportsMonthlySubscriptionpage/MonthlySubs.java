package com.cucumber.framework.helper.PageObject.SparkSportsMonthlySubscriptionpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.Navigation.*;;
public class MonthlySubs extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(MonthlySubs.class);

	public MonthlySubs(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	/** Web Elements */
	
	@FindBy(how=How.XPATH,using="//div[3]/div/div[1]/div/div[1]/div[3]/a")
	public WebElement dayFreeTrial;
	@FindBy(how=How.XPATH,using="//div[3]/div/div[1]/div/div[1]/div[4]/a")
	public WebElement useVoucher;
	@FindBy(how=How.XPATH,using="//div[2]/header/div/a[2]/button/span[1]")
	public WebElement signUp;
	
	/** Action **/
	
	public void freeTrail(){
		dayFreeTrial.click();;
	}
	public void useVouch(){
		useVoucher.click();;
	}
	public void sigUp(){
		signUp.click();
	}
	public String getURL(){
		return driver.getCurrentUrl();
	}

}
