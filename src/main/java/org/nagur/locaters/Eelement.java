 package org.nagur.locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Eelement {
	public WebDriver driver;
	public Eelement(WebDriver driver) {
		this.driver=driver;
	 }
	@FindBy(xpath="//label[contains(text(),Username)]/following::input") public WebElement username;
	@FindBy(xpath="//form[@name='ShippingBean']/descendant::input[@type='password']") public WebElement userpassword;
	@FindBy(xpath="//form[@name='ShippingBean']/descendant::div[@align='center']/descendant::input") public WebElement loginbutton;
	@FindBy(xpath="//form[@name='ShippingBean']/descendant::div[@align='center']/descendant::input/following-sibling::input") public WebElement forgotpasword;
	@FindBy(xpath="//a[contains(text(),'Log Out')]/self::a") public WebElement logoutbutton;
	@FindBy(xpath="//li[@class='b2']/descendant::h4") public WebElement getquote;
	@FindBy(xpath="//a[@class='topopup']/child::b") public WebElement help;
	@FindBy(xpath="//td[contains(text(),'Type of Insurance')]/following::td/child::select") public WebElement typeofinsurence;
	@FindBy(xpath="//form[@method='post']/child::div/child::input") public WebElement continewbutton;
	@FindBy(xpath="//form[@name='BusinessFormBean']/child::table/tbody/tr/following::select") public WebElement state;
	@FindBy(xpath="//select[@name='businessName']/self::select") public WebElement policycategory;
	@FindBy(xpath="//div[@id='select2']/child::select") public WebElement primaryservice;
	@FindBy(xpath="//a[contains(text(),'Back')]/preceding::input[@class='button']") public WebElement Policy_Selection_continue;
	@FindBy(xpath="//span[contains(text(),'No')]/preceding::input[@value='Yes']") public WebElement Recommended_coverage_first_yes;
	@FindBy(xpath="//span[contains(text(),'No')]/following::input[@value='No']") public WebElement Recommended_coverage_first_no;
	@FindBy(xpath="//li[contains(text(),'Comprehensive general liability :')]/following::input") public WebElement Comprehensive_general_liability_txt;
	@FindBy(xpath="//li[contains(text(),'Loss of Income')]/child::input") public WebElement Los_of_Income_txt;
	@FindBy(xpath="//li[contains(text(),'Loss of Income')]/following-sibling::li/child::input") public WebElement Accounts_Receivable_txt;
	@FindBy(xpath="//b[contains(text(),' Include Optional Business Coverages')]/following::span[contains(text(),'Yes')]/following-sibling::input[@value='Yes']") public WebElement Include_Optional_Business_Coverages_yes;
	@FindBy(xpath="//b[contains(text(),' Include Optional Business Coverages')]/following::span[contains(text(),'No')]/following-sibling::input[@value='Yes']") public WebElement Include_Optional_Business_Coverages_No;
	@FindBy(xpath="//input[@name='retailShopsO2']/preceding::input[1]") public WebElement Employee_dishonesty_txt;
	@FindBy(xpath="//input[@name='retailShopsO2']/self::input") public WebElement Equipment_Breakdown_txt;
	@FindBy(xpath="//input[@name='retailShopsO2']/following::input[1]") public WebElement Utility_Interruption_txt;
	@FindBy(xpath="//div[@class='entry']/descendant::input[@id='totalAmount']") public WebElement total_ammout_feild;
	@FindBy(xpath="//input[@class='button' AND @value='Continue']") public WebElement Continue_button;
	@FindBy(xpath="//input[@class='button' AND @value='Continue']/following::a[contains(text(),'Cancel')]") public WebElement Cancel_button;
	@FindBy(xpath="//input[@class='button' AND @value='Continue']/following::a[contains(text(),'Back')]") public WebElement Back_button;
	
	
	/*************************************************About as page *************************************************/
	
	@FindBy(xpath="//*[@id='breadcrumbs-one']/li/child::a[contains(text(),'About You')]") public WebElement About_As;
	@FindBy(xpath="//td[contains(text(),'Title')]/following-sibling::td/child::select") public WebElement About_As_title;
	@FindBy(xpath="//td[contains(text(),'Title')]/parent::tr/following::tr[1]/child::td[2]/child::input") public WebElement About_As_firstname_txt;
	@FindBy(xpath="//td[contains(text(),'Title')]/parent::tr/following::tr[1]/child::td[2]/child::input/following::input[@name='lastName']") public WebElement About_As_lastname_txt;
	@FindBy(xpath="//td[contains(text(),'Title')]/parent::tr/following::tr[1]/child::td[2]/child::input/following::input[@name='street']") public WebElement About_As_street_txt;
	
	@FindBy(xpath="") public WebElement About_Secondry_street;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[11]/td[2]/input") public WebElement About_city;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[12]/td[2]/input") public WebElement About_Staet;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[12]/td[2]/input") public WebElement About_Zipcode;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[14]/td[2]/input") public WebElement About_MobileNumber;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[15]/td[2]/input") public WebElement About_Gmail;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[16]/td[2]/input") public WebElement About_Squre_feet;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[17]/td[2]/input[1]") public WebElement About_homeloan_YesButton;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[17]/td[2]/input[2]") public WebElement About_Homeloan_NoBuotton;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[18]/td[2]/select")public WebElement About_Additional_location;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[19]/td[2]/select")public WebElement About_OwnerShip_Strcture;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[20]/td[2]/select") public WebElement About_YourEmloyes_drpdn;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[21]/td[2]/input[1]") public WebElement About_Goodsproduct_YesButton;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[21]/td[2]/input[2]") public WebElement About_Goodsproduct_NoButton;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[21]/td[2]/input[2]")public WebElement About_Tangible_YesButton;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[21]/td[2]/input[3]")public WebElement About_Trangles_NoButton;
	@FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[23]/td[2]/select")public WebElement About_Last12month_drpdn;
    @FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[24]/td[2]/input") public WebElement About_Calender_CoverageStart;
    @FindBy(xpath="//*[@id='main']/div[2]/form/table/tbody/tr[25]/td[2]/input") public WebElement About_Calender_CoverageUpto;
    @FindBy(xpath="//*[@id='main']/div[2]/form/div/input") public WebElement About_ContinueButton;
    @FindBy(xpath="//*[@id='main']/div[2]/form/div/a[1]") public WebElement About_CancelButton;
    @FindBy(xpath="//*[@id='main']/div[2]/form/div/a[2]") public WebElement About_BackButton;
}
