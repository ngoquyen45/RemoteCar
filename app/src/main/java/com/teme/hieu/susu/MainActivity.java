package com.teme.hieu.susu;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    public static int REQUEST_BLUETOOTH = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        BluetoothAdapter BTadapter = BluetoothAdapter.getDefaultAdapter();

        //final ArrayList<String> arr = new ArrayList<String>();
        //Set <BluetoothDevice> pairedDevices = mAdapter.getBondedDevices();
        /*if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
                arr.add(device.getName());
            }
        }
        ArrayAdapter adapt = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arr);
        ListView lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapt);*/
        final Intent mh2 = new Intent(MainActivity.this,Main2Activity.class);
        ImageView imgStart = (ImageView)findViewById(R.id.start);
        imgStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mh2);
            }
        });

    }

}
