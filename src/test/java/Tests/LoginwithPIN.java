package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.LoginObjects;

public class LoginwithPIN extends Configuration {

	@Test (priority=1)
	public void loginwithMPIN() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);


		LoginObjects POM=new LoginObjects(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.unikrew.faceoff:id/et_phone_number")));

		POM.MSISDNField.click();

		//Entering Mobile Number (03071412970)
		POM.Zero.click();
		POM.Three.click();
		POM.Zero.click();
		POM.Seven.click();
		POM.One.click();
		POM.Four.click();
		POM.One.click();
		POM.Two.click();
		POM.Nine.click();
		POM.Seven.click();
		POM.Zero.click();

		//Clicking on Continue after enter MObile Number
		POM.Continue.click();

		//Entering MPIN

		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();

	}

	@Test (priority=2)

	public void Guidedtour() 
	{	

		//Waiting for Tour First step to appear
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));

		LoginObjects POM=new LoginObjects(driver);

		//Tour started
		POM.Next.click();
		POM.Next1.click();
		POM.Next2.click();
		POM.Next3.click();
		POM.Next3.click();
		POM.Next3.click();
		POM.Next3.click();
		POM.Next3.click();
		POM.Next3.click();
		POM.Next4.click();
		POM.Close.click();
		
        System.out.print("Tour After Login Finished Successfully"); 
	}
	
	public void TransfertoBankAcc() 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView")));
		LoginObjects POM=new LoginObjects(driver);

		POM.BankTransferButton.click();
		POM.SearchBank.click();
		
		
	}
}


