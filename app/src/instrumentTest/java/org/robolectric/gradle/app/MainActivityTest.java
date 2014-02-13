package org.robolectric.gradle.app;

import android.app.Dialog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowAlertDialog;

import static org.fest.assertions.api.ANDROID.assertThat;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.robolectric.Robolectric.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    @Before
    public void setUp() throws Exception {
        Robolectric.buildActivity(MainActivity.class).create().start().resume();
    }

    @Test
    public void shouldPassSomeTest() throws Exception {
        assertThat(true).isTrue();
    }

    @Test
    public void shouldShowDialog() throws Exception {
        Dialog dialog = ShadowAlertDialog.getLatestAlertDialog();
        assertThat(dialog).isShowing();
        assertThat(shadowOf(dialog).getTitle()).isEqualTo("I am showing");
    }
}