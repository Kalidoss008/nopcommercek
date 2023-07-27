package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Helper.Base;

public class AdminLoginPage extends Base{

	@FindBy(id = "Email")
	WebElement emailIdTxtBx;
	
	@FindBy(name="Password")
	WebElement pwdTxtBx;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement remembermeChBx;
	
   @FindBy(xpath="//i[@class='nav-icon fas fa-book']")
	WebElement catalog;
   
   @FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[2]/a/p")
  WebElement catagories;
   
   @FindBy(xpath="//a[@class='btn btn-primary']")
   WebElement Addnew;
   
   @FindBy(xpath="//input[@class='form-control text-box single-line']")
   WebElement Name;
   
   @FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
   WebElement save;
   
   @FindBy(xpath="(//div[@class='card-body'])[1]")
   WebElement search;
   
   @FindBy(xpath="//i[@class='nav-icon fas fa-shopping-cart']")
   WebElement sales;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[7]")
   WebElement Orders;
   
   @FindBy(xpath="(//label[@class='col-form-label'])[9]")
   WebElement vendor;
   
   @FindBy(xpath="//i[@class='nav-icon far fa-user']")
   WebElement Customers;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[13]")
   WebElement Customers2;
   
   @FindBy(xpath="//input[@class='form-control text-box single-line']")
   WebElement Email;
   
   @FindBy(xpath="//button[@id='search-customers']")
   WebElement Search2 ;
   
   @FindBy(xpath="//div[@class='card-body']")
   WebElement Body ;
   
   @FindBy(xpath="//a[@class='btn btn-primary']")
   WebElement Add ;
    
   @FindBy(xpath="(//input[@class='form-control text-box single-line'])[1]")
   WebElement mail ;
   
   @FindBy(xpath="//input[@id='Password']")
   WebElement Password ;
   
   @FindBy(xpath="//input[@id='FirstName']")
   WebElement Fristname ;
   
   @FindBy(xpath="//input[@id='LastName']")
   WebElement Lastname ;
   
   @FindBy(xpath="//input[@id='Gender_Male']")
   WebElement Gender ;
   
   @FindBy(xpath="//input[@id='DateOfBirth']")
   WebElement Dob ;
   
   @FindBy(xpath="//input[@id='Company']")
   WebElement Companyname ;
   
   @FindBy(xpath="(//input[@class='check-box'])[1]")
   WebElement exement;
   
   public WebElement getExement() {
	return exement;
   }
   
	@FindBy(xpath="(//div[@class='k-widget k-multiselect k-multiselect-clearable'])[1]")
	WebElement newsletter1 ;

	@FindBy(xpath="//li[text()='Your store name']")
	WebElement yourname ;
	
	@FindBy(xpath="(//div[@class='k-multiselect-wrap k-floatwrap'])[2]")
	WebElement customerrole;
	
	public WebElement getGuests() {
		return guests;
	}

	@FindBy(xpath="//li[text()='Administrators']")
	WebElement guests ;

	@FindBy(xpath="//select[@id='VendorId']")
	WebElement notvendor ;
	
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement Admincom ;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
	WebElement save2;
	
	@FindBy(xpath="//div[@class='documentation-reference']")
	WebElement email12;
	
public WebElement getEmail12() {
		return email12;
	}

public WebElement getSave2() {
		return save2;
	}

	public void setSave2(WebElement save2) {
		this.save2 = save2;
	}

public WebElement getAdmincom() {
		return Admincom;
	}

	public void setAdmincom(WebElement admincom) {
		Admincom = admincom;
	}

public WebElement getNotvendor() {
	Select s=new Select(notvendor);
	s.selectByIndex(1);
		return notvendor;
	}

	public void setNotvendor(WebElement notvendor) {
		this.notvendor = notvendor;
	}

public WebElement getCustomerrole() {
		return customerrole;
	}

	public void setCustomerrole(WebElement customerrole) {
		this.customerrole = customerrole;
	}

public WebElement getNewsletter1() {
		return newsletter1;
	}

	public WebElement getYourname() {
		return yourname;
	}

public WebElement getNewsletter() {
		return newsletter1;
	}

public void setCutomerreports(WebElement cutomerreports) {
	this.cutomerreports = cutomerreports;
}

public void setRegistered(WebElement registered) {
	Registered = registered;
}

public void setPeriod(WebElement period) {
	this.period = period;
}
@FindBy(xpath="//input[@class='check-box']")
   WebElement Checkbox ;
   
   @FindBy(xpath="(//div[@class='k-multiselect-wrap k-floatwrap'])[1]")
   WebElement News ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[15]")
   WebElement Onlineorders ;
   
   @FindBy(xpath="//div[@class='documentation-reference']")
   WebElement learnmore ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[16]")
   WebElement Vendors ;
   
   @FindBy(xpath="(//div[@class='label-wrapper'])[1]")
   WebElement Vendorname ;
   
   @FindBy(xpath="//i[@class='nav-icon fas fa-tags']")
   WebElement Promotions ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[20]")
   WebElement Discounts ;
   
   @FindBy(xpath="//div[@class='card-body']")
   WebElement Cardgroup ;
   
  @FindBy(xpath="//i[@class='nav-icon fas fa-cubes']")
  WebElement Contentmenegement ;
  
  @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[24]")
  WebElement Topics ;
  
   @FindBy(xpath="//i[@class='nav-icon fas fa-cogs']")
	WebElement Configuration ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[32]")
   WebElement Settings ;
   
   @FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[7]/ul/li[1]/ul/li[1]/a/p")
   WebElement Genaralset ;
   
   @FindBy(xpath="//div[@class='col-md-12 store-scope-configuration']")
   WebElement Multi ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[50]")
   WebElement Sysinfo ;
   
   @FindBy(xpath="//i[@class='nav-icon fas fa-cube']")
   WebElement System ;
   
   @FindBy(xpath="(//label[@class='col-form-label'])[1]")
   WebElement Verison ;
   
   @FindBy(xpath="//i[@class='nav-icon fas fa-chart-line']")
   WebElement Reports ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[58]")
   WebElement salesreport ;
   
   @FindBy(xpath="//button[@id='search-salessummary']")
   WebElement Runreport ;
   
   @FindBy(xpath="(//a[@class='btn btn-blue'])[1]")
   WebElement Nopcompage ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[63]")
   WebElement cutomerreports ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[64]")
   WebElement Registered ;
   
   @FindBy(xpath="(//th[@class='sorting_disabled'])[1]")
   WebElement period ;
   
   @FindBy(xpath="(//i[@class='nav-icon far fa-dot-circle'])[52]")
   WebElement Warning ;
   
   @FindBy(xpath="(//p[@class='text-green'])[1]")
   WebElement Url ;
   
  public WebElement getWarning() {
	return Warning;
}

public WebElement getUrl() {
	return Url;
}

public WebElement getCutomerreports() {
	return cutomerreports;
}

public WebElement getRegistered() {
	return Registered;
}

public WebElement getPeriod() {
	return period;
}

public void setOnlineorders(WebElement onlineorders) {
	Onlineorders = onlineorders;
}

public void setLearnmore(WebElement learnmore) {
	this.learnmore = learnmore;
}

public void setVendors(WebElement vendors) {
	Vendors = vendors;
}

public void setVendorname(WebElement vendorname) {
	Vendorname = vendorname;
}

public void setPromotions(WebElement promotions) {
	Promotions = promotions;
}

public void setDiscounts(WebElement discounts) {
	Discounts = discounts;
}

public void setCardgroup(WebElement cardgroup) {
	Cardgroup = cardgroup;
}

public void setContentmenegement(WebElement contentmenegement) {
	Contentmenegement = contentmenegement;
}

public void setTopics(WebElement topics) {
	Topics = topics;
}

public void setConfiguration(WebElement configuration) {
	Configuration = configuration;
}

public void setSettings(WebElement settings) {
	Settings = settings;
}

public void setGenaralset(WebElement genaralset) {
	Genaralset = genaralset;
}

public void setMulti(WebElement multi) {
	Multi = multi;
}

public void setSysinfo(WebElement sysinfo) {
	Sysinfo = sysinfo;
}

public void setSystem(WebElement system) {
	System = system;
}

public void setVerison(WebElement verison) {
	Verison = verison;
}

public void setNopcompage(WebElement nopcompage) {
	Nopcompage = nopcompage;
}

public void setTopicpage(WebElement topicpage) {
	this.topicpage = topicpage;
}

public WebElement getNopcompage() {
	return Nopcompage;
}

public WebElement getReports() {
	return Reports;
}

public void setReports(WebElement reports) {
	Reports = reports;
}

public WebElement getSalesreport() {
	return salesreport;
}

public void setSalesreport(WebElement salesreport) {
	this.salesreport = salesreport;
}

public WebElement getRunreport() {
	return Runreport;
}

public void setRunreport(WebElement runreport) {
	Runreport = runreport;
}

public WebElement getSysinfo() {
	return Sysinfo;
}

public WebElement getSystem() {
	return System;
}

public WebElement getVerison() {
	return Verison;
}

public WebElement getConfiguration() {
	return Configuration;
}

public WebElement getSettings() {
	return Settings;
}

public WebElement getGenaralset() {
	return Genaralset;
}

public WebElement getMulti() {
	return Multi;
}

public WebElement getContentmenegement() {
	return Contentmenegement;
}

public WebElement getTopics() {
	return Topics;
}

public WebElement getTopicpage() {
	return topicpage;
}
@FindBy(xpath="//div[@class='content-header clearfix']")
  WebElement topicpage ;

public WebElement getCardgroup() {
	return Cardgroup;
}

public WebElement getPromotions() {
	return Promotions;
}

public WebElement getDiscounts() {
	return Discounts;
}

public WebElement getVendorname() {
	return Vendorname;
}

public WebElement getVendors() {
	return Vendors;
}

public WebElement getLearnmore() {
	return learnmore;
}

public WebElement getOnlineorders() {
	return Onlineorders;
}

public void setCheckbox(WebElement checkbox) {
	Checkbox = checkbox;
}

public void setNews(WebElement news) {
			News = news;
}

public WebElement getCheckbox() {
	return Checkbox;
}

public WebElement getNews() {
	return News;
}

public void setAdd(WebElement add) {
	Add = add;
}

public void setMail(WebElement mail) {
	this.mail = mail;
}

public void setPassword(WebElement password) {
	Password = password;
}

public void setFristname(WebElement fristname) {
	Fristname = fristname;
}

public void setLastname(WebElement lastname) {
	Lastname = lastname;
}

public void setGender(WebElement gender) {
	Gender = gender;
}

public void setDob(WebElement dob) {
	Dob = dob;
}

public void setCompanyname(WebElement companyname) {
	Companyname = companyname;
}

public WebElement getAdd() {
	return Add;
}

public WebElement getMail() {
	return mail;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getFristname() {
	return Fristname;
}

public WebElement getLastname() {
	return Lastname;
}

public WebElement getGender() {
	return Gender;
}

public WebElement getDob() {
	return Dob;
}

public WebElement getCompanyname() {
	return Companyname;
}

public void setEmail(WebElement email) {
	Email = email;
}

public void setSearch2(WebElement search2) {
	Search2 = search2;
}

public void setBody(WebElement body) {
	Body = body;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getSearch2() {
	return Search2;
}

public WebElement getBody() {
	return Body;
}

public void setCustomers(WebElement customers) {
	Customers = customers;
}

public void setCustomers2(WebElement customers2) {
	Customers2 = customers2;
}

public WebElement getCustomers() {
	return Customers;
}

public WebElement getCustomers2() {
	return Customers2;
}

public void setVendor(WebElement vendor) {
	this.vendor = vendor;
}

public WebElement getVendor() {
	return vendor;
}

public void setOrders(WebElement orders) {
	Orders = orders;
}

public WebElement getOrders() {
	return Orders;
}

public void setSales(WebElement sales) {
	this.sales = sales;
}

public WebElement getSales() {
	return sales;
}

public void setSearch(WebElement search) {
	this.search = search;
}

public WebElement getSearch() {
	return search;
}

public void setSave(WebElement save) {
	this.save = save;
}

public WebElement getSave() {
	return save;
}

public void setName(WebElement name) {
	Name = name;
}

public WebElement getName() {
	return Name;
}

public void setAddnew(WebElement addnew) {
	Addnew = addnew;
}

public WebElement getAddnew() {
	return Addnew;
}

public void setCatalog(WebElement catalog) {
	this.catalog = catalog;
}

public void setCatagories(WebElement catagories) {
	this.catagories = catagories;
}

public WebElement getCatalog() {
	return catalog;
}

public WebElement getCatagories() {
	return catagories;
}

public WebElement getLoginBtn1() {
	return catalog;
}

public void setEmailIdTxtBx(WebElement emailIdTxtBx) {
	this.emailIdTxtBx = emailIdTxtBx;
}

public void setPwdTxtBx(WebElement pwdTxtBx) {
	this.pwdTxtBx = pwdTxtBx;
}

public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}

public void setRemembermeChBx(WebElement remembermeChBx) {
	this.remembermeChBx = remembermeChBx;
}

public void setLoginBtn1(WebElement loginBtn1) {
	this.catalog = loginBtn1;
}

public void setLoginBtn2(WebElement loginBtn2) {
	this.loginBtn2 = loginBtn2;
}

public WebElement getLoginBtn2() {
	return loginBtn2;
}
@FindBy(xpath="//p[text( )=' Categories']")
   WebElement loginBtn2;
	
	public WebElement getEmailIdTxtBx() {
       return emailIdTxtBx;
	}

	public WebElement getPwdTxtBx() {
		return pwdTxtBx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getRemembermeChBx() {
		return remembermeChBx;
	}

	public boolean isDisplayed() {
		return false;
	}

	public WebElement getDashboard() {
		return null;
	}

	

}
	
	
	
	
	

