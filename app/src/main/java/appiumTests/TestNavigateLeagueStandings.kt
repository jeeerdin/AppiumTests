package appiumTests
import pages.LeaguesPage
import pages.GetStartedPage
import utilityFiles.DriverConfig

fun main() {
    val driver = DriverConfig.setupDriver();
    val getStartedPage = GetStartedPage(driver)
    val leaguesPage = LeaguesPage(driver)

    try {
        getStartedPage.getStarted()
        leaguesPage.navigateAndVerifyLeagues()

    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        driver.quit()
    }
}

