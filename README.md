Building and running unit tests from the command line:
./gradlew build

Intellij:
1. Open the build.gradle file
2. Import the project with default settings
3. Go to Project Structure -> Modules -> RobolectricGradleExample pane
4. In the Paths tab, set the Test Output Path to [root path]/RobolectricGradleExample/build/test-classes/debug
5. In the Dependencies tab, move the Module SDK dependency (i.e. Androidf API 19 Platform) to be the last item in the list.

Android Studio:
This is essentially the same as for Intellij. However, because Test Output Path and Dependencies Ordering are not modifiable via UI in Android Studio, you must modify these items in the project iml file directly and reload the project. These are the necessary modifications:

	<component name="NewModuleRootManager" inherit-compiler-output="false">
		<output url="file://$MODULE_DIR$/build/classes/debug" />
		<output-test url="file://$MODULE_DIR$/build/test-classes/debug" />			<--- make sure this line is included
		<exclude-output />
		<content url="file://$MODULE_DIR$"> 

AND......

	    	<orderEntry type="library" exported="" scope="TEST" name="wagon-provider-api-1.0-beta-6" level="project" />
	    	<orderEntry type="library" exported="" scope="TEST" name="xercesMinimal-1.9.6.2" level="project" />
	    	<orderEntry type="jdk" jdkName="Android API 19 Platform" jdkType="Android SDK" />					<---make sure this is the last orderEntry
		</component>
	</module>



RobolectricGradleExample.iml has been checked-in as a starting point.


