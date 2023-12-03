# Yellow

[![Releases](https://img.shields.io/github/downloads/SMOLKEYS/yellow-java/total?style=for-the-badge)](https://github.com/SMOLKEYS/yellow-java/releases)

[![BE Builds](https://img.shields.io/badge/Bleeding%20Edge%20Builds-Stable%3F%20Who%20knows!-red?style=for-the-badge)](https://github.com/SMOLKEYS/yellow-java-builds/releases)

[![Release Builds](https://img.shields.io/badge/Release%20Builds-Stable%3F%20I%20have%20no%20idea%20anymore!-orange?style=for-the-badge)](https://github.com/SMOLKEYS/yellow-java/releases)

![Stars](https://img.shields.io/github/stars/SMOLKEYS/yellow-java?style=for-the-badge)

![Languages](https://img.shields.io/github/languages/count/SMOLKEYS/yellow-java?style=for-the-badge)

A random piece of chaos I made. My second java mod aside Ion (prior to the kotlin port of it), my main project.

There's also the unmaintained [JS version](https://github.com/SMOLKEYS/yellow) if you need it for some reason. (Don't use it, it contains the old bullethell configurations which are pieces of absolute batshit.)


# Building (Desktop-only)

## Windows

1. Install [Java 17+ (Select either regular EXE installer or MSI installer)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) and Git/GH (Optional) through `winget install -e --id Git.Git`/`winget install -e --id GitHub.cli`.
2. Download the source code through GitHub or clone the repository with `git clone https://github.com/SMOLKEYS/yellow-java` or `gh repo clone SMOLKEYS/yellow-java`.
3. Run `./gradlew jar` in the mod's root directory. This should download any needed dependencies and build a JAR file located in `build/libs`. Import it into the game.

## Linux

> <sub>The steps are practically the same for Windows, but you go with it differently. It's also assumed you know what you're doing since it's, well, Linux. But a step-by-step is still provided anyway.</sub>

1. Install [Java 17+ (Mindustry is ran using Java, so you probably already have it installed)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) and Git/GH (Optional) through your package manager.
2. Download the source code through GitHub or clone the repository with `git clone https://github.com/SMOLKEYS/yellow-java` or `gh repo clone SMOLKEYS/yellow-java`.
3. Run `./gradlew jar` in the mod's root directory. This should download any needed dependencies and build a JAR file located in `build/libs`. Import it into the game.

## Android

> <sub>Yes, you can build on Android. This also applies for most java mods out there.</sub>

1.  Install Termux through [F-Droid](https://f-droid.org/en/packages/com.termux/) or the [repositories releases section](https://github.com/termux/termux-app/releases). You're better off with the F-Droid one, as it automatically provides the correct APK for your device.
2. Run `pkg update && pkg upgrade` to upgrade necessary packages.
3. Install Java 17 through`pkg in openjdk-17` and Git/GH (Optional) through `pkg in git gh`.
4. Download the source code through GitHub or clone the repository with `git clone https://github.com/SMOLKEYS/yellow-java` or `gh repo clone SMOLKEYS/yellow-java`.

> [!WARNING]
> Building the mod at this point is useless and not recommended, as you can't even import it into Mindustry. See what Warning 2 says below.

---

> [!TIP]
> **For Windows and Linux only.**
>
> You can use the `./gradlew copy` task so it builds the mod and copies it to Mindustry's mods directory.

> [!WARNING]
> The output JAR provided by building the mod in any of the first 2 ways is NOT compatible with Android. See Multiplatform section just below.


# Building (Multiplatform)

> [!NOTE]
> It is more than recommended to see how it works by following the steps above for the PC-only jar.

Because Android's a piece of shit, this section has to exist.

## Windows

`//TODO: I forgot the steps. Windows sucks.`

## Linux

`//TODO: I don't know how real Linux works. Android Linux sucks.`

## Android

> <sub>Yes, you can build the mod for Android in Android.</sub>

1.  Run `setup-sdk.sh` in the mod's root directory with `./setup-sdk.sh`. **This will only work in a Bash shell.**
  1.5. If it returns a permission denied error, `chmod 755 setup-sdk.sh` then run it again.
2. Restart Termux.
3. Go to the mod directory and run `./gradlew deploy`. This should build a multiplatform JAR compatible for both Android and Desktop. By getting this far you should at least know how to import it.

---

> [!TIP]
> **For Windows and Linux**: If you have access to ADB, you can connect your Android device to your machine either through USB or WiFi and run `./gradlew androidCopy`. This builds the mod and copies it to Mindustry's mod directory in the device.
>
> **For Android**: You can install ADB with `pkg in android-tools` and connect it to your device. Once you do that, you can use `./gradlew androidCopy` in Termux too!
>
> **Any**: Providing `-Padb.quickstart=true` and/or `-Padb.useBE=true` after `./gradlew androidCopy` works. `adb.quickstart` tells it to open Mindustry after building the mod and copying it. `adb.useBE` tells it to copy the mod to the Mindustry BE mods directory instead. Using both in tandem will build the mod, then open Mindustry BE after copying it.
>
> **NOTE: This only works if your device has Development settings enabled and either Wireless/USB debugging turned on.**


# Contributors/Suggestors

## Contributors
xzxADIxzx - Weapon Switch UI, Import handling

Mnemotechnician - Weapon Switch Functionality

## Suggestors
Dryehm - "Menu Man 3" Achievement

Janssendel - David's Star effect for Bullethell




|Links|
|---|
|[SMOLHome Discord Server](https://discord.gg/uAddT46bFx)|
|[Ion (Second Main Project)](https://github.com/PKChaos/Ion)|
|[The Original Project Repository (JS)](https://github.com/SMOLKEYS/yellow)|


|Time|Event|Info|
|---|---|---|
|August 5, 2021; 8:41PM PST|Prologue|The first image of the flare|
|August 5, 2021; 8:44PM PST|Prologue|Designation of name "Yellow" to the flare (by ffx#0370)|
|August 5, 2021; 8:48PM PST|Beginning|Project commited to GitHub|
|August 21, 2021; ??? PST|Beginning|Uploaded yellow sprite|
|December 6, 2021: ??? PST|New Beginning|Creation of the java version of the project, aka this repository|
