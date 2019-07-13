package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.java.en.And;

public class MyHomePage extends Annotations{
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Leads") 
	WebElement eleLeads;
	@And("Click the Leads Tab")
	public MyLeadsPage clickLeadsTab() {
		click(eleLeads);  
		return new MyLeadsPage(); 
	}
	
}
