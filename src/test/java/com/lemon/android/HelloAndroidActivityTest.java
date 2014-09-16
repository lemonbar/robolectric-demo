package com.lemon.android;

import android.app.Activity;
import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by lemon on 14-9-16.
 */
@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {
    @Test
    public void testcase01() throws Exception {

        Activity activity = Robolectric.buildActivity(HelloAndroidActivity.class).create().get();
        TextView results = (TextView) activity.findViewById(R.id.textView);

        assertThat(results.getText().toString(), equalTo("Hello"));
    }
}
