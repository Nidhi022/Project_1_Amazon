package z.amazon.test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import z.amazon.source.Amazon_Searchresult_Page;
import z.amazon.source.Amazon_login_Page;

public class Verify_product_added_tocart_shopingpge_9 {
	
	//Done
	@Test
	public void testcase9() {
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
		
		
		
		Assert.assertEquals("Amazon.in Shopping Cart", "Amazon.in Shopping Cart");
		
}
}