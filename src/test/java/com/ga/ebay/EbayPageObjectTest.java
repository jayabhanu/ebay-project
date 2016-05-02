/**
 *   File Name: EbayPageObjectTest.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 30, 2016
 *
 */

package com.ga.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * EbayPageObjectTest //ADDD (description of class)
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
public class EbayPageObjectTest {

	@Test
	public void testEbayLogin() {
		// Create the webdriver
		WebDriver driver = new FirefoxDriver();

		// create the EbayHomePage Object
		EbayHomePage ebayHomePage;

		// Initialize the page object
		ebayHomePage = new EbayHomePage(driver);

		// Use page object to driver the code
		ebayHomePage.clickSignInAndInitializeLogIn();
	}

}
