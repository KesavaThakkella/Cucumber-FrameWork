$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/code/Cucumber-FrameWork/src/main/java/Features/nopcommerce.feature");
formatter.feature({
  "line": 1,
  "name": "Nop commerce site testing",
  "description": "",
  "id": "nop-commerce-site-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Testing the NOP Commerce site",
  "description": "",
  "id": "nop-commerce-site-testing;testing-the-nop-commerce-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "if user is on admin area demo",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter email \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on sales and Orders tab",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Get the order numbers from orders table",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Also get the data of customer from table",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Get the Created On date from orders table",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Edit the order status pending for order",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Download the pdf",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Attach a file in Order Notes section",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on backbutton and select the Start date and End date",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommerce.if_user_is_on_admin_area_demo()"
});
formatter.result({
  "duration": 54673527700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 13
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "NopCommerce.Enter_email_and_password(String,String)"
});
formatter.result({
  "duration": 762846800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@class\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d86.0.4240.183)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-BLK7VFFJ\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\kesava\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 86.0.4240.183, webStorageEnabled: true}\nSession ID: 8ef51c63e0a4660143a764370a446c43\n*** Element info: {Using\u003dxpath, value\u003d//input[@class\u003d\u0027email\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinitionfile.NopCommerce.Enter_email_and_password(NopCommerce.java:41)\r\n\tat ✽.When Enter email \"admin@yourstore.com\" and password \"admin\"(F:/code/Cucumber-FrameWork/src/main/java/Features/nopcommerce.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NopCommerce.Click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Click_on_sales_and_Orders_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Get_the_order_numbers_from_orders_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Also_get_the_data_of_customer_from_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Get_the_Created_On_date_from_orders_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Edit_the_order_status_pending_for_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Download_the_pdf()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Attach_a_file_in_Order_Notes_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NopCommerce.Click_on_backbutton_and_select_the_Start_date_and_End_date()"
});
formatter.result({
  "status": "skipped"
});
});