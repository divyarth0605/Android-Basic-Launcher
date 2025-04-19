package com.multitaskinglauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "Multitasking Launcher Loaded", Toast.LENGTH_SHORT).show();

        // Launch home screen apps (placeholder logic)
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(this, "Chrome not installed", Toast.LENGTH_SHORT).show();
        }

        finish(); // Close launcher after launch for now
    }
}
