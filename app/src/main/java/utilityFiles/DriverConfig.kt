package utilityFiles
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

class DriverConfig {
    companion object {
        fun setupDriver(): AppiumDriver<MobileElement> {
            val caps = DesiredCapabilities()
            val projectPath = System.getProperty("user.dir")
            val apkPath = "$projectPath\\app\\apks\\score.apk"
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "boys")
            caps.setCapability(MobileCapabilityType.APP, apkPath)
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")

            return AppiumDriver(URL("http://127.0.0.1:4723/"), caps)
        }
    }
}
