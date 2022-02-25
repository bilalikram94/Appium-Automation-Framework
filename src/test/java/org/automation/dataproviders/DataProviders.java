package org.automation.dataproviders;

import org.testng.annotations.DataProvider;

/*
 * Using DataProvider. Usage Example is in LoginPageTests.class -> verifyInvalidLogin
 */
public final class DataProviders {

	/*@DataProvider(name = "InvalidLoginCreds", parallel = true)
	public Object[][] getInvalidCreds() {
		return new Object[][] { { "user1", "user1" }, { "user2", "user2" }, { "user3", "user3" } };
	}*/

	@DataProvider(name = "ValidLoginCreds", parallel = true)
	public Object[][] getValidCreds() {
		return new String[][] { { "bilalikram", "openfire1234" } };
	}

	@DataProvider(name = "ValidLoginCreds1", parallel = true)
	public Object[][] getValidCreds1() {
		return new String[][] { { "test.91", "openfire1234" } };
	}

	@DataProvider(name = "ValidStgCreds", parallel = true)
	public Object[][] getStgCreds1() {
		return new String[][] { { "emmadvisa", "openfire1234" } };
	}

	@DataProvider(name = "ValidUatCreds", parallel = true)
	public Object[][] getUatCred() {
		return new String[][] { { "test.100", "openfire1234" } };
	}

	@DataProvider(name = "InValidLoginCreds", parallel = true)
	public Object[][] getInValidCreds() {
		return new String[][] { { "bilal.ikram", "openfire123" } };
	}
}



