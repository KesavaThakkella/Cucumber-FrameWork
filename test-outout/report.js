$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kesava/git/My-Cucumber/CucumberFramework/src/main/java/Features/mercurysite.feature");
formatter.feature({
  "line": 1,
  "name": "Mercury Travels Site Testing",
  "description": "",
  "id": "mercury-travels-site-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Tesing Travels",
  "description": "",
  "id": "mercury-travels-site-testing;tesing-travels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on titile page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "titile of login page is MERCURY",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Select destination from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Select duration from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Select start date from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "select type of holiday from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on search holidays icon",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select the Indian holidays screen",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "After click on About Us menu",
  "keyword": "Then "
});
formatter.match({
  "location": "Mercury.user_is_on_titile_page()"
});
formatter.result({
  "duration": 40271039900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027No, thanks\u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-BLK7VFFJ\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\kesava\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 83.0.4103.106, webStorageEnabled: true}\nSession ID: fb649526f1293a54d782306898c4ea5a\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027No, thanks\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinitionfile.Mercury.user_is_on_titile_page(Mercury.java:30)\r\n\tat ✽.Given user is on titile page(C:/Users/kesava/git/My-Cucumber/CucumberFramework/src/main/java/Features/mercurysite.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Mercury.titile_of_login_page_is_MERCURY()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.Enter_destination()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.Select_duration_from_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.Select_start_date_from_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.select_type_of_holiday_from_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.click_on_search_holidays_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.Select_the_Indian_holidays_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mercury.After_click_on_About_Us_menu()"
});
formatter.result({
  "status": "skipped"
});
});