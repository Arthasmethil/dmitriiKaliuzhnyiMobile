# For start these tests: 

## Local tests

1. Connect your device to PC or start emulator via Android Studio
2. Start Appium server
3. In BaseTest change URL in appiumDriver to "System.getProperty("ts.appium")"
4. Open cmd

For test app
$ mvn clean test -P native

For test web
$ mvn clean test -P web

## Mobile farm tests

1. Get personal API key and project name from mobile farm, put it in config.properties
2. Open cmd

For test Native app on android
$ mvn clean test -P cloudNative

For test web on android
$ mvn clean test -P cloudWeb

For test Native app on iOS
$ mvn clean test -P iosNative

For test web on iOS
$ mvn clean test -P iosWeb
