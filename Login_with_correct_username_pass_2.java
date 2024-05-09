package z.amazon.test;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import z.amazon.source.Amazon_login_Page;

public class Login_with_correct_username_pass_2 {
	
	@Test
public void testcase2() {
	ChromeDriver d1 = new ChromeDriver();
	d1.manage().window().maximize();
	d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	Amazon_login_Page a2= new Amazon_login_Page(d1);
	a2.useremail();
	a2.continuebutton();
	a2.userpassword();
	a2.submitbutton();
	
	Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	
	
	
	
	
}
}
