package pages
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.junit.Assert.assertTrue


class LeaguesPage(private val driver: AppiumDriver<*>) {
    private val wait = WebDriverWait(driver, 10)

    @AndroidFindBy(accessibility = "Leagues")
    private val leaguesTab: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/league_name_text' and @text='NBA']")
    private val selectLeague: MobileElement? = null

    @AndroidFindBy(accessibility = "Standings")
    private val standingsTab: MobileElement? = null

    @AndroidFindBy(accessibility = "Navigate up")
    private val backArrowHeader: MobileElement? = null

    @AndroidFindBy(accessibility = "Conference")
    private val conferenceTab: MobileElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    fun navigateAndVerifyLeagues() {
        wait.until(ExpectedConditions.visibilityOf(leaguesTab))
        leaguesTab?.click()

        wait.until(ExpectedConditions.visibilityOf(selectLeague))
        selectLeague?.click()
        assertTrue("Leagues tab was not selected", leaguesTab?.isSelected ?: false)


        wait.until(ExpectedConditions.visibilityOf(standingsTab))
        standingsTab?.click()
        assertTrue("Standings tab was not selected", standingsTab?.isSelected ?: false)
        assertTrue("Conference tab was not selected", conferenceTab?.isSelected ?: false)

        wait.until(ExpectedConditions.visibilityOf(backArrowHeader))
        backArrowHeader?.click()
        assertTrue("Leagues tab was not selected after navigating back", leaguesTab?.isSelected ?: false)
    }
}