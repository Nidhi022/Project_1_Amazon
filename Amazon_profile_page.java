package z.amazon.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_profile_page {

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement acc_list;

	@FindBy(xpath = "//span[.='Your Account']")
	WebElement ur_acc;

	@FindBy(xpath = "//a[.='Manage Your Profiles']")
	WebElement ur_profile;

	@FindBy(xpath = "//div[@class='a-column a-span12']")
	WebElement ur_name;

	@FindBy(xpath = "//a[@id='name-edit-modal-link']")
	WebElement edit;

	@FindBy(xpath = "//input[@id='profile-name-text-input']")
	WebElement name_field;

	@FindBy(xpath = "//span[@id='profile-name-edit-submit-button-announce']")
	WebElement save_button;

	private WebDriver d1;

	// strong[.='Name is updated']

	public void acc_and_list(WebDriver d1) {

		Actions a4 = new Actions(this.d1 = d1);
		a4.moveToElement(acc_list).perform();

	}

	public void user_acc() {
		ur_acc.click();
	}

	public void user_profile() {
		ur_profile.click();
	}

	public void user_name() {
		ur_name.click();
	}

	public void user_name_edit() {
		edit.click();
	}

	public void user_name_change() {

		name_field.sendKeys("nidhiA");
	}

	public void save() {
		save_button.click();
	}

	public Amazon_profile_page(ChromeDriver d1) {
		PageFactory.initElements(d1 = d1, this);
	}

}
