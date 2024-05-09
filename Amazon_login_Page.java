package z.amazon.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login_Page {

	@FindBy(id = "ap_email")
	WebElement email;

	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement submit;

	public void useremail() {
		email.sendKeys("");
	}

	public void continuebutton() {
		continue_button.click();
	}

	public void userpassword() {
		password.sendKeys("");
	}
	
	public void submitbutton () {
		submit.click();
	}

	public Amazon_login_Page(ChromeDriver d1) {
		PageFactory.initElements(d1=d1, this);
	}

	}

