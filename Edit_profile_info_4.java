package z.amazon.test;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import z.amazon.source.Amazon_login_Page;
import z.amazon.source.Amazon_profile_page;

public class Edit_profile_info_4 {
	
	
	@Test
	public void testcase4() {
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		Amazon_login_Page a2= new Amazon_login_Page(d1);
		a2.useremail();
		a2.continuebutton();
		a2.userpassword();
		a2.submitbutton();
		
		
		Amazon_profile_page a3= new Amazon_profile_page(d1);
		a3.acc_and_list(d1);
		a3.user_acc();
		a3.user_profile();
		a3.user_name();
		a3.user_name_edit();
		
		a3.user_name_change();
		a3.save();	
		
	}
	}
