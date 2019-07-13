package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.java.en.And;

public class MyLeadsPage extends Annotations{
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
@FindBy(how=How.LINK_TEXT, using="Create Lead")
	
	WebElement EleCreateLead;
	@And("Click Create Lead")	
	public CreateLeadPage clickCreateLead()
	{
		click(EleCreateLead);
		return new CreateLeadPage();
	}
}
