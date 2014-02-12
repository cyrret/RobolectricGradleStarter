package org.robolectric.gradle.app;

import android.app.Application;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

import static org.fest.assertions.api.Assertions.assertThat;

public class MainActivityTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldPassSomeTest() throws Exception {
        assertThat(true).isTrue();
        Application application = Robolectric.application;
    }
}