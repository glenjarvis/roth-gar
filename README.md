# roth-gar
A personalized Android Application for RothGar the Ranger

## Requirements

Amazon Fire 10 Tablet (optional)

## Developer Requirements:

MacOSX 10.15 or higher
Android Studio 4.2 or higher

## Developer Setup

### For MacOS with Homebrew
* Install [Android Studio](https://developer.android.com/studio/) version 4.2.2
  Android Studio comes with the Java Development Kit (JDK) and the Android Software Development Kit
  (SDK) installed within their Mac App Contents folder.
* Install [HomeBrew](https://docs.brew.sh/) if not already installed
* Ensure Git is installed. It comes by default. I prefer using brew: `brew install git`
* cd to the location where you keep Code Repositories: e.g., `cd ~/Code/`
* Clone this repo: `git clone https://github.com/glenjarvis/roth-gar.git`
* In Android Studio: File -> Open -> (roth-gar directory) -> build.gradle
  (do not choose the build.gradle inside the app folder)
* Android Studio will generate a local.properties file pointing to the internal Android SDK, do not change this directory unless you pre-installed the Android SDK and prefer to use that version.
* In Android Studio: Open the build.gradle file in the app module (folder) and note these variables:
 - compileSdkVersion
 - buildToolsVersion
 - minSdkVersion
* Click on Tools -> SDK Manager
* In the SDK Manager Window, check the box in the bottom right that says "Show Package Details"
* Make sure the box for Android SDK Platform ## is checked (## = compileSdkVersion number)
* Click on the SDK Tools tab
* Check the box in the bottom right that says "Show Package Details"
* Under Android SDK Build Tools, make sure the box for the buildToolsVersion string is checked
* Click OK to install any of the items that weren't previously checked
* Connect your device, or run your emulator, that has an OS version that matches or is higher than the minSdkVersion
* Run the app to the connected device/emulator

### Optional Steps to use a custom JDK
* Install your preferred JDK: `brew install openjdk`
* Find JDK path: `brew info openjdk` (e.g.,  /usr/local/opt/openjdk/libexec/openjdk.jdk)
* In Android Studio: File -> Project Structure -> SDK Location in left menu pane -> update the JDK Location field 

## Tested on:

```
MacOSX 10.15.17
Android Studio 4.2.2
  Build #AI-202.7660.26.42.7486908, built on June 23, 2021
  Runtime version: 11.0.8+10-b944.6916264 x86_64
  VM: OpenJDK 64-Bit Server VM
Fire OS 7.3.1.9 
```
