package configuraciones;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidConfigEmulador {

    public AndroidDriver RetornaConfigEmul() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\src\\test\\resources\\app\\Android-NativeDemoApp-0.4.0.apk");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".MainActivity");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.wdiodemoapp");
        //cap.setCapability(AndroidMobileCapabilityType.DISABLE_WINDOW_ANIMATION, true);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);

        return driver;
    }
}