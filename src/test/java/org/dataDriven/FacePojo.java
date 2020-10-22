package org.dataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacePojo extends FaceBase{

	public FacePojo() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pas;
	
	@FindBy(id="u_0_b")
	private WebElement log;
	
	@FindBy(xpath="//div[contains(text(),'match')]")
	private WebElement wrong;

	public WebElement getWrong() {
		return wrong;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPas() {
		return pas;
	}

	public WebElement getLog() {
		return log;
	}
	
	
	
	
}
