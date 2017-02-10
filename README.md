# Appium - Movies - Page Object Model
This is a sample project to demonstrate page object model in appium

**testng**is used as test framework.
Sample android used for automation is
 BitbarSampleApp.apk given by @bitbar.

### Dependency
1. Java
2. Maven

###libraries used
1. Appium
2. Testng
3. log4j

### Steps to clone execute the tests
```
git clone https://github.com/reachbharathan/appium-android-movies.git
cd appium-android-movies
mvn clean compile
mvn clean test
```


### How to use this repo
Before executing the steps, few installations and setup needs to be completed.
1. Install android sdk and configure the android corresponding to the OS you have. refer 'https://developer.android.com/studio/install.html' .

2. Create a android device of you choice, I would recommend to use android studio for creating device which takes care of most of settings.

3. Once the Android stimulator is created, open the app in stimulator using appium inorder to test the configs.

4. Start the app using the command line ```emulator -avd <Android device Name>```

5. Now configure the deviceName field in startAppium.sh accourding the your device name.

6. Now the its all set to execute the test,execute `mvn clean test` command in command line (Note for windows users the settings and commands might slighly vary)from root folder, index.html report will be generated in target folder

7. The entire test suite can be executed from a single test runner file "TestRunner"

#### Note
1. The configuration of android sdk and setting of stimulator will take tie for first times, be patient and refer lots of blog to know and own it
2. Will increase the test as and when i find time
