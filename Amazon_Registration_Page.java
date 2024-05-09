package z.amazon.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Registration_Page {
	@FindBy(id = "ap_customer_name")
	WebElement customer_name;

	@FindBy(id = "ap_phone_number")
	WebElement phone_number;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "continue")
	WebElement continue_button;

	public void customername() {
		customer_name.sendKeys("kusum");
	}

	public void phonenumber() {
		phone_number.sendKeys("");
	}

	public void setpassword() {

		password.sendKeys("");

	}

	public void continuebutton() {
		continue_button.click();
	}
	
	public Amazon_Registration_Page(ChromeDriver d1) {
		
		PageFactory.initElements(d1, this);
	}


}
