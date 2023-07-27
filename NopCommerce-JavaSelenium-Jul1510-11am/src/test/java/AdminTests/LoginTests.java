package AdminTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AdminDashBoardPage;
import POM.AdminLoginPage;
import Utility.utility;

public class LoginTests extends Base{


  private static final AdminLoginPage page = null;
private static final WebElement WebElement = null;
private AdminDashBoardPage adp;
@Test
  public void verifyAdminIsLoginWithValidCred() throws IOException, InterruptedException {
	  utility util = new utility();
	  util.adminLogin((this.getData(this.getProperty("sheetname"),1,0)), (this.getData(this.getProperty("sheetname"),1,1)));
	  AdminDashBoardPage adp = PageFactory.initElements(driver, AdminDashBoardPage.class);
	  boolean actual = adp.getDbTitle().isDisplayed();
	  Assert.assertTrue(actual);
	  
  }
	  @Test
	  public void userCanAbleSeeTheDashBoard() throws IOException, InterruptedException
	  {
		  AdminLoginPage page =PageFactory.initElements(driver,AdminLoginPage.class);
		  verifyAdminIsLoginWithValidCred();
		  AdminDashBoardPage adp = PageFactory.initElements(driver, AdminDashBoardPage.class);
		 boolean dash= adp.getDbTitle().isDisplayed();
		 Assert.assertTrue(dash);
	  }
	  
	  @Test
	  public void userCanAbleSeeTheCatagories() throws IOException, InterruptedException {
	  AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	  verifyAdminIsLoginWithValidCred();
		page.getCatalog().click();
		page.getCatagories().click();
		page.getAddnew().click();
		page.getName().sendKeys(getData(getProperty("sheetname"), 2, 0));
		page. getSave().click();
		boolean dash = page.getSearch().isDisplayed();
		 Assert.assertTrue(dash);
	  }
	  
	@Test
	public void userCanAbleSeeTheSalesAndOrders() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	 verifyAdminIsLoginWithValidCred(); 
	 page.getSales().click();
	 page.getOrders().click();
	 boolean dash = page.getVendor().isDisplayed();
	 Assert.assertTrue(dash);
	 
	}
	
	@Test
	public void userCanAbleTheSearchTheCustomers() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();
	page.getCustomers().click();
	page.getCustomers2().click();
	page.getEmail().sendKeys(getData(getProperty("sheetname"),3, 0));
	page.getSearch2().click();
	boolean dash = page.getBody().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	 public void userCanAbleTheAddNewCustomers() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();	
	page.getCustomers().click();
	page.getCustomers2().click();
	page.getAdd().click();
	page.getMail().sendKeys(getData(getProperty("sheetname"),4,0));
	page.getPassword().sendKeys(getData(getProperty("sheetname"),4,1));
	page.getFristname().sendKeys(getData(getProperty("sheetname"),5,0));
	page.getLastname().sendKeys(getData(getProperty("sheetname"),6,0));
	page.getGender().click();
	page.getDob().sendKeys(getProperty("DOB"));
	page.getCompanyname().sendKeys(getData(getProperty("sheetname"),8,0));
	page.getExement().click();
	page.getNewsletter().click();
	page.getYourname().click();
	driver.manage().timeouts().implicitlyWait( Integer.parseInt(this.getProperty(this.min_wait)), TimeUnit.SECONDS);
	page.getCustomerrole().click();
	page.getGuests().click();
	page.getNotvendor();
	page.getAdmincom().sendKeys(getData(getProperty("sheetname"),9,0));
	page.getSave2().click();
	boolean dash = page.getEmail12().isDisplayed();
	Assert.assertTrue(dash);
	}
		
	@Test
	public void userCanAbleTheOnlineCustomers() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();		
	page.getCustomers().click();
	page.getOnlineorders().click();
	boolean dash = page.getLearnmore().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	public void userCanAbleTheVendors() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();		
	page.getCustomers().click();
	page.getVendors().click();
	boolean dash = page.getVendorname().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	public void userCanAbleThePromotionsAndDiscounts() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();			
	page. getPromotions().click();
	page.getDiscounts().click();
	boolean dash = page.getCardgroup().isDisplayed();
	Assert.assertTrue(dash);	
	}
	
	@Test
	public void userCanAbleTheContentMengement() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();
	page.getContentmenegement().click();
	page.getTopics().click();
	boolean dash = page.getTopicpage().isDisplayed();
	Assert.assertTrue(dash);
	
	}
	@Test
	public void userCanAbleTheConfiguration() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();	
	page.getConfiguration().click();
	page.getSettings().click();
	page.getGenaralset().click();
	boolean dash = page.getMulti().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	public void userCanAbleTheSystem() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();
	page.getSystem().click();
	page.getSysinfo().click();
	boolean dash = page.getVerison().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	public void userCanAbleTheReports () throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();	
	page.getReports().click();
	page.getSalesreport().click();
	boolean dash = page.getRunreport().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	public void userCanAbleTheHelps () throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();	
	page.getSystem().click();
	page.getWarning().click();
	boolean dash= page.getUrl().isDisplayed();
	Assert.assertTrue(dash);
	}
	
	@Test
	public void userCanAbleTheCustomerReports() throws IOException, InterruptedException {
	AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
	verifyAdminIsLoginWithValidCred();
	page.getReports().click();
	page.getCutomerreports().click();
	page.getRegistered().click();
	boolean dash = page.getPeriod().isDisplayed();
	Assert.assertTrue(dash);
	}
	
}
		
	
	