package tech.gtfts.gothef_cktosleep;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.entity.StringEntity;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;

public class MainActivity extends AppCompatActivity {

  private TimePicker timePicker;
  private String phoneNumber;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    timePicker = (TimePicker)findViewById(R.id.timepicker);
    timePicker.setIs24HourView(false);
    TelephonyManager tMgr = (TelephonyManager)getApplicationContext().getSystemService(
            Context.TELEPHONY_SERVICE);
    phoneNumber = tMgr.getLine1Number();
  }

  // dunno how the hell im supposed to do this rest stuff
  @TargetApi(Build.VERSION_CODES.M)
  public void setAlarm(View view) {
    System.out.print(timePicker.getHour());
    System.out.println(":" + Integer.toString(timePicker.getMinute()));
    HttpClient httpClient = new DefaultHttpClient();
    HttpPost httpPost = new HttpPost("http://terrencehung.flowca.st");

    try {
      httpPost.setEntity(new StringEntity());

    }
  }

}
