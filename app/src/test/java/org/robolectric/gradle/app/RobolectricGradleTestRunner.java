package org.robolectric.gradle.app;

import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

public class RobolectricGradleTestRunner extends RobolectricTestRunner {
    public RobolectricGradleTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected AndroidManifest getAppManifest(Config config) {
        // TODO: make this not a hack
        System.setProperty("android.manifest", "app/src/main/AndroidManifest.xml");
        System.setProperty("android.resources", "app/src/main/res");
        System.setProperty("android.assets", "app/src/main/assets");
        return super.getAppManifest(config);
    }
}
