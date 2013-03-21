package org.robolectric.shadows;

import android.widget.CheckBox;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.TestRunners;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(TestRunners.WithDefaults.class)
public class CheckBoxTest {
    @Test
    public void testWorks() throws Exception {
        CheckBox checkBox = new CheckBox(Robolectric.application);
        assertThat(checkBox.isChecked()).isFalse();

        checkBox.setChecked(true);
        assertThat(checkBox.isChecked()).isTrue();

        checkBox.performClick();
        assertThat(checkBox.isChecked()).isFalse();

        checkBox.toggle();
        assertThat(checkBox.isChecked()).isTrue();
    }
}