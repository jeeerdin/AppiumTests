package pages
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class GetStartedPage(private val driver: AppiumDriver<*>) {
    private val wait = WebDriverWait(driver, 10)

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private val allowButton: MobileElement? = null

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    private val getStartedButton: MobileElement? = null

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_disallow")
    private val disallowButton: MobileElement? = null

    @AndroidFindBy(id = "com.fivemobile.thescore:id/search_bar_placeholder")
    private val searchTeamButton: MobileElement? = null

    @AndroidFindBy(id = "com.fivemobile.thescore:id/search_src_text")
    private val searchButton: MobileElement? = null

    @AndroidFindBy(xpath = "//*[@resource-id='com.fivemobile.thescore:id/txt_name' and @text='Philadelphia Eagles']")
    private val teamSelection: MobileElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    fun getStarted() {
        allowButton?.click()
        wait.until(ExpectedConditions.visibilityOf(getStartedButton))
        getStartedButton?.click()
        wait.until(ExpectedConditions.visibilityOf(getStartedButton))
        getStartedButton?.click()
        wait.until(ExpectedConditions.visibilityOf(disallowButton))
        disallowButton?.click()
        wait.until(ExpectedConditions.visibilityOf(searchTeamButton))
        searchTeamButton?.click()
        searchButton?.sendKeys("eagles")

        wait.until(ExpectedConditions.visibilityOf(teamSelection))
        teamSelection?.click()
        wait.until(ExpectedConditions.visibilityOf(getStartedButton))
        getStartedButton?.click()
        wait.until(ExpectedConditions.visibilityOf(getStartedButton))
        getStartedButton?.click()
    }
}