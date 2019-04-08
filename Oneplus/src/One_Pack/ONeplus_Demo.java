package One_Pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ONeplus_Demo {

	public String baseUrl = "https://www.oneplus.in/";
	WebDriver driver = null;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void verifyHomepageTitle() throws InterruptedException {
		String expectedTitle = "Never Settle - OnePlus (India)";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(10000);
		System.out.println("-----------HomePage Verified----------------");
	}

	@Test(priority = 1)
	public void verifyHandles() {
		String childwindow = driver.getWindowHandle();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div[1]/a")).click();
	}

	@Test(priority = 2)
	public void verifyoneplus() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-pages-slide\"]/li[2]/a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("------------Oneplus 6T-------------");
	}

	@Test(priority = 3)
	public void verifyMclaren() {
		driver.findElement(By.xpath("//*[@id=\"op-narrow-banner\"]/div[2]/div/div[1]/div[1]/a[1]")).click();
		driver.navigate().back();
		System.out.println("---------Mclaren----------");
	}

	@Test(priority = 4)
	public void verifyLogin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"show-user-info\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"show-user-info\"]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sign-in-main\"]/div/div/div/div[1]/div[4]/a[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("paras.chitnis@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ssu332@paras");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("------------Login-------------");
	}

	@Test(priority = 5)
	public void verifyoneplus6tpurchase() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"op-narrow-banner\"]/div[1]/div/div[1]/div[1]/a[1]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"page-phone\"]/div[2]/section/div[1]/div[5]/fieldset/div/ul/li[1]/label[2]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"page-phone\"]/section[2]/div[2]/div/h3/span[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"page-phone\"]/section[2]/div[2]/div/h3/span[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul[1]/li[1]/a")).click();
	}

	@Test(priority = 6)
	public void verifyCheckout() {
		driver.findElement(By.xpath("//*[@id=\"show-basket-info\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"final_checkout\"]")).click();
		driver.findElement(By.id("shipping-in-first-name")).sendKeys("Suvit Chitnis");
		driver.findElement(By.id("shipping-in-telephone")).sendKeys("7000895831");
		driver.findElement(By.id("shipping-in-pincode")).sendKeys("400096");
		driver.findElement(By.id("shipping-in-street1"))
				.sendKeys("229/3 Sushila Apartment Sher-e-punjab Andheri East Mumbai");
		driver.findElement(By.xpath("//*[@id=\"id-shipping-address\"]/div/div[2]/div[2]/div[2]/a")).click();
		System.out.println("Done 1");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/section[4]/div/div[2]/div[2]/div[2]/a"))
				.click();
		System.out.println("Done 2");
	}
	
	@Test(priority = 7)
	public void verifyAccessories() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"family-slide-trigger\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("card-image")).click();
		driver.findElement(By.id("field-pincode")).sendKeys("400096");
		driver.findElement(By.xpath("//*[@id=\"page-accessory\"]/div[1]/section/div/div/div/div/div/div/div[2]/div/div[1]/div[5]/form/div[2]/button")).click();
		driver.findElement(By.cssSelector(".btn-add-to-cart")).click();
		driver.findElement(By.xpath("//*[@id=\"show-basket-info\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"final_checkout\"]")).click();
		System.out.println("------------Accessories------------");
	}

	@Test(priority = 8)
	public void verifysupport() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul[2]/li[5]/a")).click();
		Thread.sleep(2000);
		System.out.println("----------Support-------------");
	}

	@Test(priority = 9)
	public void verifyBrand() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-pages-slide\"]/li[5]/a")).click();
		Thread.sleep(2000);
		System.out.println("-----------Brand-----------");
	}

	@Test(priority = 10)
	public void verifyCommunity() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-pages-slide\"]/li[6]/a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("----------Community----------");
	}

	@Test(priority = 11)
	public void verifyExperiance() throws InterruptedException {
		driver.findElement(By.cssSelector("#nav-pages-slide > li:nth-child(7) > a")).click();
		Thread.sleep(2000);
		System.out.println("---------Experiance & Retail-----------");
	}

	@Test(priority = 12)
	public void verifyOneplus6() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[1]/dd/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 13)
	public void verifyOneplus5T() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[1]/dd/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 14)
	public void verifyOneplus5() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[1]/dd/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 15)
	public void verifyOneplus3T() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[1]/dd/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 16)
	public void verifyAddtocart() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul[3]/li[2]/a[1]/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"final_checkout\"]")).click();
	}

	@Test(priority = 17)
	public void verifycase() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[2]/dd/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page-accessory-list\"]/section[2]/div/div[2]/a/div[2]/img")).click();
		driver.findElement(By.id("field-pincode")).sendKeys("400096");
		driver.findElement(By.xpath("//*[@id=\"page-accessory\"]/div[1]/section/div/div/div/div/div/div/div[2]/div/div[1]/div[5]/form/div[2]/button")).click();
		driver.findElement(By.cssSelector(".btn-add-to-cart")).click();
		driver.findElement(By.xpath("//*[@id=\"show-basket-info\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"final_checkout\"]")).click();
		System.out.println("------------Case------------");
	}

	@Test(priority = 18)
	public void verifyPower() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[2]/dd/ul/li[2]/a")).click();
	}

	@Test(priority = 19)
	public void verifyAudio() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[2]/dd/ul/li[3]/a")).click();
	}

	@Test(priority = 20)
	public void verifyBundles() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[2]/dd/ul/li[4]/a")).click();
	}

	
	@Test(priority = 21)
	public void verifyGear() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[2]/dd/ul/li[5]/a")).click();
	}

	@Test(priority = 22)
	public void verifyProtection() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[2]/dd/ul/li[6]/a")).click();
	}

	@Test(priority = 23)
	public void verifyReferral() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[3]/dd/ul/li[2]/a")).click();
	}

	@Test(priority = 24)
	public void verifyStudent() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[3]/dd/ul/li[3]/a")).click();
	}

	@Test(priority = 25)
	public void verifyShots() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[3]/dd/ul/li[4]/a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@Test(priority = 26)
	public void verifyShopping() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[4]/dd/ul/li[1]/a")).click();
	}

	@Test(priority = 27)
	public void verifyUser() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[4]/dd/ul/li[2]/a")).click();
	}

	@Test(priority = 28)
	public void verifyService() {
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[4]/dd/ul/li[3]/a")).click();
			driver.findElement(By.id("input-search")).sendKeys("Mumbai");
			driver.findElement(By.id("searchList")).click();
	}
	
	@Test(priority=29)
	public void verifyContact() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[4]/dd/ul/li[5]/a")).click();
	}

	@Test(priority = 30)
	public void verifyAbout() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[5]/dd/ul/li[1]/a")).click();
	}

	@Test(priority = 31)
	public void verifyCareer() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/dl[5]/dd/ul/li[3]/a")).click();
	}

	@Test(priority = 32)
	public void verifyhyperlinks() {
		String brokentitle = "Page Not Found";
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);
		List<WebElement> linkElementsArr = driver.findElements(By.tagName("a"));
		String[] linkTextArrToBeUsed = new String[linkElementsArr.size()];
		int i = 0;
		for (WebElement e : linkElementsArr) {
			linkTextArrToBeUsed[i] = e.getText();
			i++;
		}
		for (String t : linkTextArrToBeUsed) {
			if (!t.equals("") && !t.equals("underfined") && !t.isEmpty() && t != null) {
				driver.findElement(By.linkText(t)).click();
				if (driver.getTitle().equals(brokentitle)) {
					System.out.println(t + "is not Working");
					driver.navigate().back();
				} else {
					System.out.println(t + "is Working");
				}
				driver.navigate().back();
			}
		}
	}
}
