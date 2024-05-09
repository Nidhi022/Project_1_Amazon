package z.amazon.source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Searchresult_Page {

	ChromeDriver d1;
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchbutton;

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement star4;

	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[8]")
	WebElement clickonproduct;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addtocard;

	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement cart;

	@FindBy(xpath = "//span[@id='sc-subtotal-label-buybox']")
	WebElement itemincart;

	@FindBy(xpath = "(//input[@class='a-color-link'])[1]")
	WebElement delete;

	@FindBy(xpath = "(//span[@class='a-button-inner'])[1]")
	WebElement buy;

	@FindBy(xpath = "(//span[@class='a-button-inner'])[3]")
	WebElement address;

	@FindBy(id = "pp-ErvUI6-97")
	WebElement card;
	@FindBy(id = "pp-ErvUI6-103")
	WebElement net;
	@FindBy(id = "pp-ErvUI6-123")
	WebElement upi;
	@FindBy(id = "pp-ErvUI6-128")
	WebElement emi;
	@FindBy(xpath = "(//input[@class='a-button-input'])[2]")
	WebElement COD;

	public void search_box() {
		searchbox.sendKeys("shoe");
	}

	public void search_button() {
		searchbutton.click();
	}

	public void star() {
		star4.click();
	}

	public void clickonproduct() {
		clickonproduct.click();

	}

	public void addto_card() {

		addtocard.click();
	}

	public void clickoncart() {

		cart.click();
	}

	public void item_quntatity() {

		if (itemincart.isDisplayed() == true) {
			delete.click();
		}
	}

	public void click_onbuy() {

		buy.click();
	}

	public void click_address() {

		address.click();
	}
	public void card_click() {

		card.click();
	}
	public void netbanking_click() {

		net.click();
	}
	public void upi_click() {

		upi.click();
	}
	public void emi_click() {

		emi.click();
	}

	public void COD_click() {

		COD.click();
	}

	public Amazon_Searchresult_Page(ChromeDriver d1) {

		PageFactory.initElements(d1, this);
	}

}
