package com.internlft.activitylogger;

import android.app.usage.UsageStatsManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.usage.UsageStats;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Parcelable;

public class MainActivity extends AppCompatActivity {
    //UsageStats usageStats;
    //UsageStats justBlank = new UsageStats(usageStats);
    TextView textView = (TextView)findViewById(R.id.stats);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    public void monitorApp(View view){

        boolean checkToggle = ((ToggleButton)view).isChecked();
        if(checkToggle){
            Toast.makeText(getBaseContext(),"Monitoring Started",Toast.LENGTH_SHORT).show();
            Log.i(LOG_TAG,"Monitoring Toast Given");
        }
        else {
            Toast.makeText(getBaseContext(),"Monitoring Stopped",Toast.LENGTH_SHORT).show();
          /*  try {
                String thisAppName = usageStats.getPackageName();
                String timeUsed = Long.toString(usageStats.getTotalTimeInForeground());// Shows total Usage Time
                String totalStats = "Name: " + thisAppName+ "Usage Time: " + timeUsed;

            } catch (NullPointerException e){
              Toast.makeText(getBaseContext(),"App not declared you idiot",Toast.LENGTH_LONG).show();
            };*/


            //
        //    textView.setText(thisAppName);
        }
    }
}
