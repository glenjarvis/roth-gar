# roth-gar
A personalized Android Application for RothGar the Ranger

## Requirements

Amazon Fire 10 Tablet (optional)

## Developer Requirements:

MacOSX 10.15 or higher
Android Studio 4.2 or higher

## Developer Setup

### For MacOS with Homebrew
* Install [Android Studio](https://developer.android.com/studio/) version 4.2
* Install [HomeBrew](https://docs.brew.sh/) if not already installed
* Ensure Git is installed. It comes by default. I prefer using brew: `brew install git`
* Ensure Java SDK is installed: `brew install openjdk`
* Find JDK path: `brew info openjdk` (e.g.,  /usr/local/opt/openjdk/libexec/openjdk.jdk)
* Update JDK in Android Studio (Menu -> Settings -> ... etc.) TODO: Fine tune these instructions
* cd to the location where you keep Code Repositories: e.g., `cd ~/Code/`
* Clone this repo: `git clone https://github.com/glenjarvis/roth-gar.git`
* cd roth-gar
* create `local.properties` file with contents `sdk.dir=<path to jdk>`
  For example, path to Android studio jdk: `~/Library/Android/sdk`
* In Android Studio: File -> Open -> (roth-gar directory)
* TODO: Fine tune instructions for upgrading Gradle

## Tested on:

```
MacOSX 10.15.17
Android Studio 4.2.2
  Build #AI-202.7660.26.42.7486908, built on June 23, 2021
  Runtime version: 11.0.8+10-b944.6916264 x86_64
  VM: OpenJDK 64-Bit Server VM
Fire OS 7.3.1.9 
```
