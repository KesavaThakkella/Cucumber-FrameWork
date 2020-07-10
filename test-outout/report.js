$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kesava/git/My-Cucumber/CucumberFramework/src/main/java/Features/Addnewcustomer.feature");
formatter.feature({
  "line": 1,
  "name": "GTPL Bank New Customer Creation",
  "description": "",
  "id": "gtpl-bank-new-customer-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 5,
  "name": "GTPL Bank Customer Creation",
  "description": "",
  "id": "gtpl-bank-new-customer-creation;gtpl-bank-customer-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is guru",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters \"mngr228993\" and \"bUnYdYh\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "clicks on new customer tab",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter customername \"kesava Thakkella\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "add address \"2-15-4/1, mulugarthi nagana street, undiroad, Bhim\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Addnewcustomer.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 42603058300,
  "status": "passed"
});
formatter.match({
  "location": "Addnewcustomer.title_of_login_page_is_guru()"
});
formatter.result({
  "duration": 642134300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr228993",
      "offset": 8
    },
    {
      "val": "bUnYdYh",
      "offset": 25
    }
  ],
  "location": "Addnewcustomer.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 693626601,
  "status": "passed"
});
formatter.match({
  "location": "Addnewcustomer.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1896331000,
  "status": "passed"
});
formatter.match({
  "location": "Addnewcustomer.clicks_on_new_customer_tab()"
});
formatter.result({
  "duration": 300631800,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : User is not valid}\n  (Session info: chrome\u003d83.0.4103.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds: null\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-BLK7VFFJ\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\kesava\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 83.0.4103.106, webStorageEnabled: true}\nSession ID: 98de17315b8b794a0f1e1792d710e955\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(), \u0027New Customer\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:172)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinitionfile.Addnewcustomer.clicks_on_new_customer_tab(Addnewcustomer.java:51)\r\n\tat ✽.Then clicks on new customer tab(C:/Users/kesava/git/My-Cucumber/CucumberFramework/src/main/java/Features/Addnewcustomer.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "kesava Thakkella",
      "offset": 20
    }
  ],
  "location": "Addnewcustomer.enter_customername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2-15-4/1, mulugarthi nagana street, undiroad, Bhim",
      "offset": 13
    }
  ],
  "location": "Addnewcustomer.add_address(String)"
});
formatter.result({
  "status": "skipped"
});
});