package Pranah;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PranahPage {
	
	public String baseUrl = "https://www.pranahwellbeing.com/";
	public WebDriver driver ; 
	
	
	@BeforeTest
	public void setup() throws InterruptedException
	{   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNEHA\\eclipse-workspace\\Pranah_Project\\Driver\\chromedriver.exe");
		System.out.println("Before Test executed");
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		
		//maximise windows
		driver.manage().window().maximize();
        
		Thread.sleep(2000);
		//open url
		driver.get(baseUrl);

		//timer i kept as 60 you can keep 40
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); //60 seconds
		
		 
	  
		
		
	}

	@Test(priority = 1, enabled=true)
    public void Open_HomePage() throws InterruptedException
    {
		driver.findElement(By.xpath("//*[@id=\"comp-ln64r1qn\"]/a/span")).click();
		System.out.println("Open pick an app");
		
		String message_expected = "The way towards complete well being";
        String message_actual = driver.findElement(By.xpath("//*[@id=\"comp-llxupfhx\"]/h1/span/span")).getText();

		//Assert.assertTrue(message_actual.contains(message_expected));
        Assert.assertEquals(message_expected, message_actual);
        System.out.println("Assertion passed");
        Thread.sleep(1500);
        
      //Click On Book a Session
      	driver.findElement(By.linkText("Book a session")).click();
      	System.out.println("Click on Book a session");
      	Thread.sleep(3000);
        
      	//Scroll down
      	JavascriptExecutor jse = (JavascriptExecutor) driver; 
		 jse.executeScript("window.scrollBy(0,4000)");
		 Thread.sleep(5000);
        
      //..................................................................................................................	
        //Click On Menu 
      	driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
      	System.out.println("..............Open Menu...................");
      	Thread.sleep(3000);
		//Click On Home Link
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Open Homelink");
		Thread.sleep(3000);
		
		//Click On AboutUs Link
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("Open AboutUslink");
		Thread.sleep(4000);
		
		//Click On OurServices Link
		driver.findElement(By.linkText("Our Services")).click();
		System.out.println("Open OurServiceslink");
		Thread.sleep(4000);
		
		//Click On Book our Space Link
		driver.findElement(By.linkText("Book our Space")).click();
		System.out.println("Open BookourSpace link");
		Thread.sleep(3000);
		
		//Click On Events & Workshops Link
		driver.findElement(By.linkText("Events & Workshops")).click();
		System.out.println("Open Events & Workshops");
		Thread.sleep(3000);
		
		//Click On Social Link
		driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
		System.out.println("..............Open Socials...................");
		Thread.sleep(3000);
		
		
		//Click On Instagram Link
		driver.findElement(By.linkText("Instagram")).click();
		System.out.println("Instagram link");
		Thread.sleep(3000);
		
		//Click On Facebook Link
		driver.findElement(By.linkText("Facebook")).click();
		System.out.println("Facebook link");
		Thread.sleep(3000);				
		
    }
	
	@Test(priority = 2, enabled=false)
	public void Open_AboutUs() throws InterruptedException
	{
		driver.findElement(By.id("comp-ln1ewit81label")).click();
		System.out.println("Open About Us Page");
		Thread.sleep(3000);
		
	//.....................................Click All links to be opened....................................
		        //Click On Menu 
				driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
				System.out.println("..............Open Menu...................");
				Thread.sleep(3000);
		        //Click On Home Link
				driver.findElement(By.linkText("Home")).click();
				System.out.println("Open Homelink");
				Thread.sleep(3000);
				
				//Click On AboutUs Link
				driver.findElement(By.linkText("About Us")).click();
				System.out.println("Open AboutUslink");
				Thread.sleep(3000);
				
				//Click On OurServices Link
				driver.findElement(By.linkText("Our Services")).click();
				System.out.println("Open OurServiceslink");
				Thread.sleep(3000);
				
				//Click On Book our Space Link
				driver.findElement(By.linkText("Book our Space")).click();
				System.out.println("Open BookourSpace link");
				Thread.sleep(3000);
				
				//Click On Events & Workshops Link
				driver.findElement(By.linkText("Events & Workshops")).click();
				System.out.println("Open Events & Workshops");
				Thread.sleep(3000);
				
				//Click On Social Link
				driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
				System.out.println("..............Open Socials...................");
				Thread.sleep(3000);
				
				
				//Click On Instagram Link
				driver.findElement(By.linkText("Instagram")).click();
				System.out.println("Instagram link");
				Thread.sleep(3000);
				
				//Click On Facebook Link
				driver.findElement(By.linkText("Facebook")).click();
				System.out.println("Facebook link");
				Thread.sleep(3000);
		
	}
	
	@Test(priority = 3, enabled=false)
	public void OpenOurServices() throws InterruptedException
	{
		driver.findElement(By.linkText("Our Services")).click();
		System.out.println("Open Our Services");
		Thread.sleep(3000);
		
		//Individual Therapy Session
		driver.findElement(By.xpath("//*[@id=\"comp-lnm0ibs7\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lnm0qpl0\"]/a")).click();
		System.out.println("Book Now"); 
		
		//Relationship Session
		driver.findElement(By.xpath("//*[@id=\"comp-lnm0uk69\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lnm0uk6c3\"]/a/span")).click();
		System.out.println("Book Now");
		Thread.sleep(3000);
		
		//Family Therapy Session
		driver.findElement(By.xpath("//*[@id=\"comp-lnm10atr\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lnm10au05\"]/a")).click();
		System.out.println("Book Now");
		Thread.sleep(3000);
		
		//Career Counselling Session
		driver.findElement(By.xpath("//*[@id=\"comp-lnm1gocw\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lnm1god11\"]/a")).click();
		System.out.println("Book Now");
		Thread.sleep(3000);
		
		//Group Sessions
		driver.findElement(By.xpath("//*[@id=\"comp-lnp10z9s4\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lnp10z9x2\"]/a/span")).click();
		System.out.println("Book Now");
		Thread.sleep(3000); 
		
		//Support Groups
		driver.findElement(By.xpath("//*[@id=\"comp-lnp1e5v52\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lnp1e5v82\"]/a")).click();
		System.out.println("Book Now");
		Thread.sleep(3000);
		
		//Hypnotherapy
		driver.findElement(By.xpath("//*[@id=\"comp-lomykq3b1\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lomykq3m\"]/a")).click();
		System.out.println("Book Now");
		Thread.sleep(3000);
		
		//Graphotherapy
		driver.findElement(By.xpath("//*[@id=\"comp-lomyosu4\"]/h1/span/span"));
		driver.findElement(By.xpath("//*[@id=\"comp-lomyosub1\"]/a")).click();
		System.out.println("Book Now");
		Thread.sleep(3000); 
		
		//.....................................Click All links to be opened....................................
				      
		       //Click On Menu 
				driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
				System.out.println("..............Open Menu...................");
				Thread.sleep(3000);
				        //Click On Home Link
						driver.findElement(By.linkText("Home")).click();
						System.out.println("Open Homelink");
						Thread.sleep(3000);
						
						//Click On AboutUs Link
						driver.findElement(By.linkText("About Us")).click();
						System.out.println("Open AboutUslink");
						Thread.sleep(3000);
						
						//Click On OurServices Link
						driver.findElement(By.linkText("Our Services")).click();
						System.out.println("Open OurServiceslink");
						Thread.sleep(3000);
						
						//Click On Book our Space Link
						driver.findElement(By.linkText("Book our Space")).click();
						System.out.println("Open BookourSpace link");
						Thread.sleep(3000);
						
						//Click On Events & Workshops Link
						driver.findElement(By.linkText("Events & Workshops")).click();
						System.out.println("Open Events & Workshops");
						Thread.sleep(3000);
						
						//Click On Social Link
						driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
						System.out.println("..............Open Socials...................");
						Thread.sleep(3000);
						
						
						//Click On Instagram Link
						driver.findElement(By.linkText("Instagram")).click();
						System.out.println("Instagram link");
						Thread.sleep(3000);
						
						//Click On Facebook Link
						driver.findElement(By.linkText("Facebook")).click();
						System.out.println("Facebook link");
						Thread.sleep(3000);
		
	}
		
		@Test(priority = 4, enabled=false)
		public void OURSPACE() throws InterruptedException
       {
       driver.findElement(By.linkText("Our Space")).click();
		System.out.println("OUR SPACE");
		Thread.sleep(3000);
		
		//Book now
		driver.findElement(By.xpath("//*[@id=\"comp-ln0midyk2\"]/a/div")).click();
		System.out.println("Book Now");
		Thread.sleep(3000); 
//..................................................................................................................	
		        //Click On Menu 
				driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
				System.out.println("..............Open Menu...................");
				Thread.sleep(3000);
		//Click On Home Link
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Open Homelink");
		Thread.sleep(3000);
		
		//Click On AboutUs Link
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("Open AboutUslink");
		Thread.sleep(3000);
		
		//Click On OurServices Link
		driver.findElement(By.linkText("Our Services")).click();
		System.out.println("Open OurServiceslink");
		Thread.sleep(3000);
		
		//Click On Book our Space Link
		driver.findElement(By.linkText("Book our Space")).click();
		System.out.println("Open BookourSpace link");
		Thread.sleep(3000);
		
		//Click On Events & Workshops Link
		driver.findElement(By.linkText("Events & Workshops")).click();
		System.out.println("Open Events & Workshops");
		Thread.sleep(3000);
		
		//Click On Social Link
		driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
		System.out.println("..............Open Socials...................");
		Thread.sleep(3000);
		
		
		//Click On Instagram Link
		driver.findElement(By.linkText("Instagram")).click();
		System.out.println("Instagram link");
		Thread.sleep(3000);
		
		//Click On Facebook Link
		driver.findElement(By.linkText("Facebook")).click();
		System.out.println("Facebook link");
		Thread.sleep(3000);
	   }
		
	@Test(priority = 5, enabled=false)
	public void Open_Packages() throws InterruptedException
		{
			driver.findElement(By.id("comp-ln1ewit84label")).click();
			System.out.println("Open Packages Page");
			Thread.sleep(3000);
			
			//click on 3 Sessions
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng3n3g__item1\"]/h2/span/span/span"));
			 System.out.println("Open 3 Sessions");
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng21ms__item1\"]/a/div/span[1]")).click();
			 System.out.println("Click on Know more");	
			 Thread.sleep(3000);
				
				
			//click on 6 Sessions
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng3n3g__item-kl57gfgh\"]/h2/span/span/span"));
			 System.out.println("Open 6 Sessions");
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng21ms__item-kl57gfgh\"]/a/div/span[1]")).click();
			 System.out.println("Click on Know more");	
			 Thread.sleep(3000);		
			
			//click on 9 Sessions
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng3n3g__item2\"]/h2/span/span/span"));
			 System.out.println("Open 9 Sessions");
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng21ms__item2\"]/a/div/span[1]")).click();
			 System.out.println("Click on Know more");	
			 Thread.sleep(3000);	
				
			//click on 12 Sessions
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng3n3g__item-kl57gi80\"]/h2/span/span/span"));
			 System.out.println("Open 12 Sessions");
			 driver.findElement(By.xpath("//*[@id=\"comp-lnng21ms__item-kl57gi80\"]/a/div/span[1]")).click();
			 System.out.println("Click on Know more");	
			 Thread.sleep(3000);	
//..................................................................................................................	
			    //Click On Menu 
				driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
				System.out.println("..............Open Menu...................");
				Thread.sleep(3000);
					//Click On Home Link
					driver.findElement(By.linkText("Home")).click();
					System.out.println("Open Homelink");
					Thread.sleep(3000);
					
					//Click On AboutUs Link
					driver.findElement(By.linkText("About Us")).click();
					System.out.println("Open AboutUslink");
					Thread.sleep(3000);
					
					//Click On OurServices Link
					driver.findElement(By.linkText("Our Services")).click();
					System.out.println("Open OurServiceslink");
					Thread.sleep(3000);
					
					//Click On Book our Space Link
					driver.findElement(By.linkText("Book our Space")).click();
					System.out.println("Open BookourSpace link");
					Thread.sleep(3000);
					
					//Click On Events & Workshops Link
					driver.findElement(By.linkText("Events & Workshops")).click();
					System.out.println("Open Events & Workshops");
					Thread.sleep(3000);
					
					//Click On Social Link
					driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
					System.out.println("..............Open Socials...................");
					Thread.sleep(3000);
					
					
					//Click On Instagram Link
					driver.findElement(By.linkText("Instagram")).click();
					System.out.println("Instagram link");
					Thread.sleep(3000);
					
					//Click On Facebook Link
					driver.findElement(By.linkText("Facebook")).click();
					System.out.println("Facebook link");
					Thread.sleep(3000);				
		}
	@Test(priority = 6, enabled=false)
	public void Open_Events() throws InterruptedException
	{
		driver.findElement(By.id("comp-ln1ewit85label")).click();
		System.out.println("Open Events");
		Thread.sleep(3000);
		
	//.....................................Click All links to be opened....................................
		        
		       //Click On Menu 
				driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
				System.out.println("..............Open Menu...................");
				Thread.sleep(3000);
				//Click On Home Link
				driver.findElement(By.linkText("Home")).click();
				System.out.println("Open Homelink");
				Thread.sleep(3000);
				
				//Click On AboutUs Link
				driver.findElement(By.linkText("About Us")).click();
				System.out.println("Open AboutUslink");
				Thread.sleep(3000);
				
				//Click On OurServices Link
				driver.findElement(By.linkText("Our Services")).click();
				System.out.println("Open OurServiceslink");
				Thread.sleep(3000);
				
				//Click On Book our Space Link
				driver.findElement(By.linkText("Book our Space")).click();
				System.out.println("Open BookourSpace link");
				Thread.sleep(3000);
				
				//Click On Events & Workshops Link
				driver.findElement(By.linkText("Events & Workshops")).click();
				System.out.println("Open Events & Workshops");
				Thread.sleep(3000);
				
				//Click On Social Link
				driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
				System.out.println("..............Open Socials...................");
				Thread.sleep(3000);
				
				//Click On Instagram Link
				driver.findElement(By.linkText("Instagram")).click();
				System.out.println("Instagram link");
				Thread.sleep(3000);
				
				//Click On Facebook Link
				driver.findElement(By.linkText("Facebook")).click();
				System.out.println("Facebook link");
				Thread.sleep(3000);
		
	}
	@Test(priority = 7, enabled=false)
	public void Open_Blogs() throws InterruptedException
	{
		driver.findElement(By.id("comp-ln1ewit86label")).click();
		System.out.println("Open Blogs");
		Thread.sleep(3000);
		
	//.....................................Click All links to be opened....................................
		        
		
		        //Click On Menu 
				driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
				System.out.println("..............Open Menu...................");
				Thread.sleep(3000);
		
		        //Click On Home Link
				driver.findElement(By.linkText("Home")).click();
				System.out.println("Open Homelink");
				Thread.sleep(3000);
				
				//Click On AboutUs Link
				driver.findElement(By.linkText("About Us")).click();
				System.out.println("Open AboutUslink");
				Thread.sleep(3000);
				
				//Click On OurServices Link
				driver.findElement(By.linkText("Our Services")).click();
				System.out.println("Open OurServiceslink");
				Thread.sleep(3000);
				
				//Click On Book our Space Link
				driver.findElement(By.linkText("Book our Space")).click();
				System.out.println("Open BookourSpace link");
				Thread.sleep(3000);
				
				//Click On Events & Workshops Link
				driver.findElement(By.linkText("Events & Workshops")).click();
				System.out.println("Open Events & Workshops");
				Thread.sleep(3000);
				
				//Click On Social Link
				driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
				System.out.println("..............Open Socials...................");
				Thread.sleep(3000);
				
				
				//Click On Instagram Link
				driver.findElement(By.linkText("Instagram")).click();
				System.out.println("Instagram link");
				Thread.sleep(3000);
				
				//Click On Facebook Link
				driver.findElement(By.linkText("Facebook")).click();
				System.out.println("Facebook link");
				Thread.sleep(3000);
		
	}
	@Test(priority = 8, enabled=false)
	public void Open_FAQs() throws InterruptedException
	{
		driver.findElement(By.id("comp-ln1ewit87label")).click();
		System.out.println("Open FAQs");
		Thread.sleep(3000);
		
	//.....................................Click All links to be opened....................................
		
		        //Click On Menu 
		        driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
		        System.out.println("..............Open Menu...................");
		        Thread.sleep(3000);
		        //Click On Home Link
				driver.findElement(By.linkText("Home")).click();
				System.out.println("Open Homelink");
				Thread.sleep(3000);
				
				//Click On AboutUs Link
				driver.findElement(By.linkText("About Us")).click();
				System.out.println("Open AboutUslink");
				Thread.sleep(3000);
				
				//Click On OurServices Link
				driver.findElement(By.linkText("Our Services")).click();
				System.out.println("Open OurServiceslink");
				Thread.sleep(3000);
				
				//Click On Book our Space Link
				driver.findElement(By.linkText("Book our Space")).click();
				System.out.println("Open BookourSpace link");
				Thread.sleep(3000);
				
				//Click On Events & Workshops Link
				driver.findElement(By.linkText("Events & Workshops")).click();
				System.out.println("Open Events & Workshops");
				Thread.sleep(3000);
				
				//Click On Social Link
				driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
				System.out.println("..............Open Socials...................");
				Thread.sleep(3000);
				
				//Click On Instagram Link
				driver.findElement(By.linkText("Instagram")).click();
				System.out.println("Instagram link");
				Thread.sleep(3000);
				
				//Click On Facebook Link
				driver.findElement(By.linkText("Facebook")).click();
				System.out.println("Facebook link");
				Thread.sleep(3000);
	}
	
	
	@Test(priority = 9, enabled=false)
	public void PrivacyPolicy() throws InterruptedException
   {
   driver.findElement(By.linkText("Privacy Policy")).click();
	System.out.println("Privacy Policy");
	Thread.sleep(3000);
	
	
//..................................................................................................................	
	//Click On Menu 
	driver.findElement(By.xpath("//*[@id=\"comp-kl8471b3\"]/p/span/span"));
	System.out.println("..............Open Menu...................");
	Thread.sleep(3000);
	//Click On Home Link
	driver.findElement(By.linkText("Home")).click();
	System.out.println("Open Homelink");
	Thread.sleep(3000);
	
	//Click On AboutUs Link
	driver.findElement(By.linkText("About Us")).click();
	System.out.println("Open AboutUslink");
	Thread.sleep(3000);
	
	//Click On OurServices Link
	driver.findElement(By.linkText("Our Services")).click();
	System.out.println("Open OurServiceslink");
	Thread.sleep(3000);
	
	//Click On Book our Space Link
	driver.findElement(By.linkText("Book our Space")).click();
	System.out.println("Open BookourSpace link");
	Thread.sleep(3000);
	
	//Click On Events & Workshops Link
	driver.findElement(By.linkText("Events & Workshops")).click();
	System.out.println("Open Events & Workshops");
	Thread.sleep(3000);
	
	//Click On Social Link
	driver.findElement(By.xpath("//*[@id=\"comp-kl84gayn\"]/p/span/span"));
	System.out.println("..............Open Socials...................");
	Thread.sleep(3000);
	
	
	//Click On Instagram Link
	driver.findElement(By.linkText("Instagram")).click();
	System.out.println("Instagram link");
	Thread.sleep(3000);
	
	//Click On Facebook Link
	driver.findElement(By.linkText("Facebook")).click();
	System.out.println("Facebook link");
	Thread.sleep(3000);
   }
	
	   
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);//wait for 5 secs before quit
		driver.close();
		driver.quit();

	}
}
