package com.cucumber.framework.helper.PageObject.SparkSportsHomepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.Navigation.*;;
public class SparkSportsHomepage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(SparkSportsHomepage.class);

	public SparkSportsHomepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	/** Web Elements */
	@FindBy(how=How.XPATH,using="//div[2]/header/div/button/span")
	public WebElement logIn;
	@FindBy(how=How.XPATH,using="//div[2]/header/div/a[2]/button/span[1]")
	public WebElement signUp;
	@FindBy(how=How.XPATH,using="//div[1]/div/div/div/button[1]/span[1]/span/span/a/p/strong")
	public WebElement disCover;
	@FindBy(how=How.XPATH,using="//div[1]/div/div/div/button[2]/span[1]/span/span/a")
	public WebElement lernMore;
	

	/** Actions */
	
	public void login(){
		logIn.click();
	
	}
	public void sigUp(){
		signUp.click();
	}
	public void disCov(){
		disCover.click();
	}
	public void learnMr(){
		lernMore.click();
	}
	
	
}
