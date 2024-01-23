##Running tests

- Since we are using appium, initialize the server by typing "Appium" into a terminal window
- I used Android studio to run the tests. The test is in the main Kotlin file. Running via UI is how this repo is configured. 
- As requested, the build gradle is located [Here](https://github.com/jeeerdin/AppiumTests/blob/master/app/build.gradle)


##Approach
- Since the test is fairly simple, verification was fairly easy using the head text changing as a main form of asserting.
- POM works for almost anything. Could easily parameterize the tests, but I didn't within this repo (the sendKeys function for example would allow for other options).
- Having the driver details in it's own package made sense to me. Testing on multiple device versions, test environments, devices, etc, are all areas that would make sense.
- Regarding the last point; having the test suites be modular and dynamic like that could allow an entire test suite to run on multiple types of android devices and versions.
- Instead of using data for login (which I would probably use git secrets to do within a pipeline. ENV file if local), I just made an object for the get started flow. It would need to be it's own page object anyways in a full framework.
