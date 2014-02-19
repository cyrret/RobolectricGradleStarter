RobolectricGradleStarter
========================
A Gradle starter project for your Android app that enables running Robolectric tests in both the IDE and commandline. Supports both focused and full-suite test runs.

Command-line
------------------------------------------------------
```bash
./gradlew build
```

Intellij
---------
1. Open the build.gradle file
2. Import the project with default settings
3. Go to Project Structure -> Modules -> RobolectricGradleExample pane
4. In the Dependencies tab, move the Module SDK dependency (i.e. Android API 19 Platform) to be the last item in the list.

Android Studio
---------------
This is essentially the same as for Intellij. However, because Dependencies Ordering is not modifiable via UI in Android Studio, you must modify the project iml file directly and reload the project:

```html
	    	<orderEntry type="library" exported="" scope="TEST" name="wagon-provider-api-1.0-beta-6" level="project" />
	    	<orderEntry type="library" exported="" scope="TEST" name="xercesMinimal-1.9.6.2" level="project" />
	    	<orderEntry type="jdk" jdkName="Android API 19 Platform" jdkType="Android SDK" />					<---make sure this is the last orderEntry
		</component>
	</module>
```

