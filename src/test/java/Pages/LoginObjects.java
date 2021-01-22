package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginObjects {

		public LoginObjects(AppiumDriver<AndroidElement> driver) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		@AndroidFindBy(id=("com.unikrew.faceoff:id/et_phone_number"))
		public AndroidElement MSISDNField;
		
		@AndroidFindBy(id=("com.unikrew.faceoff:id/btn_send_otp"))
		public AndroidElement Continue;
		
		//Guided Tour Objects
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"))
		public AndroidElement Next;

		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
		public AndroidElement Next1;

		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
		public AndroidElement Next2;

		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
		public AndroidElement Next3;
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
		public AndroidElement Next4;

		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
		public AndroidElement Gotit;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/close"))
		public AndroidElement Close;
			
		//Money Transfer to Bank Transfer Objects
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"))
		public AndroidElement BankTransferButton;
		
		@AndroidFindBy(id=("com.unikrew.faceoff:id/et_search_bank"))
		public AndroidElement SearchBank;
		
		//Keyboard Elements
		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_0"))
		public AndroidElement Zero;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_1"))
		public AndroidElement One;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_2"))
		public AndroidElement Two;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_3"))
		public AndroidElement Three;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_4"))
		public AndroidElement Four;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_5"))
		public AndroidElement Five;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_6"))
		public AndroidElement Six;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_7"))
		public AndroidElement Seven;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_8"))
		public AndroidElement Eight;

		@AndroidFindBy(id=("com.unikrew.faceoff:id/t9_key_9"))
		public AndroidElement Nine;
		
		
}
