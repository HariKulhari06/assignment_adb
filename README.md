# Assignment (ADB Shell Script Testing)

>Create an Android project with two activities: one splash screen and one general info activity. The splash screen contains a Lottie animation (you can pick one from here https://lottiefiles.com/featured) and this activity should be the main entry point of the app once started.

>The info activity will be displayed once the Lottie animations completes. No special requirement needed for the info activity in terms of UI. The navigation between the two activities must be done using the Navigation component (https://bit.ly/36Oznaw).

>The goal of this project assignment is to create a mechanism that let you skip the splash screen (and display directly the info activity) if the app is started from command line using adb.
>The suggested way is to use some custom flag in the the adb command statement, but this might not be the only way to do that, up to you. The code needed to start the app from command line, setup of additional flags, etc must be included in a bash script.

- Language to use: Kotlin and Bash script
- IDE to use: Android Studio
- Use git, and track changes by making multiple commits with meaningful messages.


#### Start application with splash activity

```sh
adb shell am start -n com.example.assignment/com.example.assignment.ui.splash.SplashActivity
```

#### Start application without splash activity

```sh
adb shell am start -n com.example.assignment/com.example.assignment.ui.splash.SplashActivity --ez "navigate_to_info" true
```