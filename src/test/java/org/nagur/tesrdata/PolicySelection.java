package org.nagur.tesrdata;

import java.lang.reflect.Method;

import org.nagur.browsers.OpenBroser;
import org.nagur.utill.Testutil;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PolicySelection extends OpenBroser {
	@DataProvider(name="Data")
	public static Object[][] testParameterData(Method method) throws Exception
	{
		refunobject.initialize(); 
	    Object data[][]=Testutil.getData(refunobject.datatable_suite1,"");
	    return data;
	}
	
	@Test(dataProvider ="Data")
	public void policySelectionmeth(String uname,String pass,String data) throws Exception {
		
		refunobject.loginfunction();
		Thread.sleep(3000);
		refunobject.clicking(refunobject.getquote);
		refunobject.clicking(refunobject.continewbutton);
		refunobject.dropDownmeth(refunobject.continewbutton, "New York",0);
		refunobject.dropDownmeth(refunobject.policycategory, "", 1);
		refunobject.clicking(refunobject.Policy_Selection_continue);
		refunobject.assertSelection(refunobject.Include_Optional_Business_Coverages_yes);
		refunobject.sendMatter(refunobject.Comprehensive_general_liability_txt, "10000");
		refunobject.sendMatter(refunobject.Los_of_Income_txt, "5000");
		refunobject.sendMatter(refunobject.Accounts_Receivable_txt, "9000");
		refunobject.assertSelection(refunobject.Include_Optional_Business_Coverages_No);
		refunobject.sendMatter(refunobject.Employee_dishonesty_txt, "5000");
		refunobject.sendMatter(refunobject.Equipment_Breakdown_txt, "6000");
		refunobject.sendMatter(refunobject.Utility_Interruption_txt, "5000");
		refunobject.sendMatter(refunobject.total_ammout_feild, "1000");
		refunobject.clicking(refunobject.Continue_button);
		refunobject.dropDownmeth(refunobject.About_As_title, "", 1);
		refunobject.sendMatter(refunobject.About_As_firstname_txt, "shaik");
		refunobject.sendMatter(refunobject.About_As_lastname_txt, "nagulmeera");
		refunobject.sendMatter(refunobject.About_As_street_txt, "Guntur");
		refunobject.sendMatter(refunobject.About_Secondry_street, "Guntur");
		refunobject.sendMatter(refunobject.About_city, "Guntur");
		refunobject.sendMatter(refunobject.About_Staet, "Ap");
		refunobject.sendMatter(refunobject.About_Zipcode, "522601");
		refunobject.sendMatter(refunobject.About_MobileNumber, "888888888");
		refunobject.sendMatter(refunobject.About_Gmail, "abc@gmail.com");
		refunobject.sendMatter(refunobject.About_Gmail, "abc@gmail.com");
		refunobject.sendMatter(refunobject.About_Squre_feet, "143");
		refunobject.assertSelection(refunobject.About_Homeloan_NoBuotton);
		refunobject.dropDownmeth(refunobject.About_Additional_location, "", 1);
		refunobject.dropDownmeth(refunobject.About_Additional_location, "Trust", 0);
		refunobject.dropDownmeth(refunobject.About_YourEmloyes_drpdn, "", 2);
		refunobject.assertSelection(refunobject.About_Goodsproduct_NoButton);
		refunobject.assertSelection(refunobject.About_Tangible_YesButton);
		refunobject.dropDownmeth(refunobject.About_Last12month_drpdn, "No", 0);

	}

}
