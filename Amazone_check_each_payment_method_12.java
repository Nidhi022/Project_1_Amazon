package z.amazon.test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import z.amazon.source.Amazon_Searchresult_Page;
import z.amazon.source.Amazon_login_Page;

public class Amazone_check_each_payment_method_12 {

	@Test
	public void testcase11() throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		Amazon_login_Page a2= new Amazon_login_Page(d1);
		a2.useremail();
		a2.continuebutton();
		a2.userpassword();
		a2.submitbutton();
		
		Amazon_Searchresult_Page a4= new Amazon_Searchresult_Page(d1);
		
		a4.search_box();
		a4.search_button();
		a4.clickonproduct();
		Set<String> g1= d1.getWindowHandles();
		System.out.println(g1);
		Iterator<String> g2= g1.iterator();
		String s1= g2.next();
		String s2= g2.next();
		d1.switchTo().window(s2);
		a4.addto_card();
		a4.clickoncart();
		a4.click_onbuy();
		a4.click_address();
		a4.card_click();
		Thread.sleep(1000);
		a4.netbanking_click();
		Thread.sleep(1000);
		a4.upi_click();
		Thread.sleep(1000);
		a4.emi_click();
		Thread.sleep(1000);
		a4.COD_click();

}
}



