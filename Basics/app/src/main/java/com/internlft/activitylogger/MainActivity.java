package com.internlft.activitylogger;

import android.app.usage.UsageStatsManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.usage.UsageStats;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Parcelable;

public class MainActivity extends AppCompatActivity {
    UsageStats usageStats;
    UsageStats justBlank = new UsageStats(usageStats);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void monitorApp(View view){

        boolean checkToggle = ((ToggleButton)view).isChecked();
        if(checkToggle){
            Toast.makeText(getBaseContext(),"Monitoring Started",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getBaseContext(),"Monitoring Stopped",Toast.LENGTH_SHORT).show();
            String thisAppName = usageStats.getPackageName();
            String timeUsed = Long.toString(usageStats.getTotalTimeInForeground());// Shows total Usage Time
            String totalStats = "Name: " + thisAppName+ "Usage Time: " + timeUsed;



            //      TextView textView = (TextView)findViewById(R.id.stats);
        //    textView.setText(thisAppName);
        }
    }
}
