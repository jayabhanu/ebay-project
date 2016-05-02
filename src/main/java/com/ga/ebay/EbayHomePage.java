/**
 *   File Name: EbayHomePage.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 30, 2016
 *
 */

package com.ga.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * EbayHomePage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EbayHomePage {
	public static WebDriver driver;
	private String baseURL = "http://ebay.com";

	@FindBy(xpath = "//div/div[5]/span[2]/input")
	private WebElement passwordFld;

	@FindBy(id = "gh-ug")
	private WebElement signInText;

	@FindBy(xpath = "//div//div[4]/span[2]/input")
	private WebElement usernameFld;

	public EbayHomePage(WebDriver driver) {
		// point the
		EbayHomePage.driver = driver;
		// Initi
		PageFactory.initElements(driver, this);
	}

	public void clickSignInAndInitializeLogIn() {
		// Go to home page http://ebay.com
		driver.get(this.baseURL);

		// catch the proxied webelement signintext and
		this.signInText.click();
	}

	public void signWithUserInAndInitializeLogIn(String username, String password) {
		this.usernameFld.sendKeys(username);
		this.passwordFld.sendKeys(password);
		this.passwordFld.submit();

	}
}
