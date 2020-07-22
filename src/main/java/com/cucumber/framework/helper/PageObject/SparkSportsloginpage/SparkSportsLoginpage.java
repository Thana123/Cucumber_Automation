package com.cucumber.framework.helper.PageObject.SparkSportsloginpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.Navigation.*;;
public class SparkSportsLoginpage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(SparkSportsLoginpage.class);

	public SparkSportsLoginpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	/** Web Elements */
	
	@FindBy(how=How.NAME,using="username")
	public WebElement userName;
	@FindBy(how=How.NAME,using="password")
	public WebElement passWord;
	@FindBy(how=How.XPATH,using="//div[3]/div[2]/div[2]/div/form/div[3]")
	public WebElement submitLogin;
	@FindBy(how=How.XPATH,using="//div[2]/div/form/div[4]/div[2]/h6")
	public WebElement rememberMe;	
	@FindBy(how=How.XPATH,using="//div[2]/div/form/div[5]/a")
	public WebElement forgotPassword;
	@FindBy(how=How.NAME,using="email")
	public WebElement requestpassword;
	@FindBy(how=How.XPATH,using="//div[2]/div/form/div/div[3]/button/span[1]")
	public WebElement requestNewPassword;
	@FindBy(how=How.XPATH,using="//div[4]/div[2]/div[2]/div/form/div/h6[2]")
	public WebElement confrequestNewPassword;
	
	
	/** Action */
	public void uname(String uName){
		userName.sendKeys(uName);
	}
	public void passwrd(String pwrd){
		passWord.sendKeys(pwrd);
	}
	public void submitBtn(){
		submitLogin.click();
	}
	public void rememberM(){
		rememberMe.click();;
	}
	public void frgtPasswrd(){
		forgotPassword.click();;
	}
	public void emailID(String emailID){
		requestpassword.sendKeys(emailID);
	}
	public void reqNwPword(){
		requestNewPassword.click();
		
	}
	public String  getreqNwPword(){
		String confrmtext = confrequestNewPassword.getText();
		return confrmtext;
	}
	
}
