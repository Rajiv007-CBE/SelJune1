package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations{
public CreateLeadPage()
{
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(how=How.ID, using = "createLeadForm_companyName")
WebElement eleCnameBox;

public void enterCompanyName()
{
	append(eleCnameBox,"Vuram");
}
@FindBy(how=How.ID, using ="createLeadForm_firstName")
WebElement eleFNameBox;

public void enterFirstName()
{
	append(eleFNameBox, "Arun");
}
@FindBy(how=How.ID, using ="createLeadForm_lastName")
WebElement eleLNameBox;


public void enterLastName()
{
	append(eleLNameBox, "S");
}
}
