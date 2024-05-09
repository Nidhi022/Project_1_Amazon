package z.amazon.test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import z.amazon.source.Amazon_Registration_Page;

public class registration_to_amazon_1 {

	@Test
	public void testcase1() {

		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Amazon_Registration_Page a1 = new Amazon_Registration_Page(d1);
		a1.customername();
		a1.phonenumber();
		a1.setpassword();
		a1.continuebutton();

	}

}
