package com.teme.hieu.susu;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView left,right,up,down,sword,led,car;
    TextView speed;
    Animation rotateLeft,rotateRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Anhxa();
        SetClick();
    }
    public void Anhxa(){
        speed = (TextView)findViewById(R.id.speed);
        left = (ImageView)findViewById(R.id.left);
        right = (ImageView)findViewById(R.id.right);
        up = (ImageView)findViewById(R.id.up);
        down = (ImageView)findViewById(R.id.down);
        sword = (ImageView)findViewById(R.id.sword);
        led = (ImageView)findViewById(R.id.led);
        car = (ImageView)findViewById(R.id.car);
        rotateLeft = AnimationUtils.loadAnimation(Main2Activity.this,R.anim.roteeleft);
        rotateRight = AnimationUtils.loadAnimation(Main2Activity.this,R.anim.rotee);
    }
    public void SetClick(){
        left.setOnClickListener(myclick);
        right.setOnClickListener(myclick);
        up.setOnClickListener(myclick);
        down.setOnClickListener(myclick);
        sword.setOnClickListener(myclick);
        led.setOnClickListener(myclick);
    }
    private View.OnClickListener myclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.left:
                    car.startAnimation(rotateLeft);
                    break;
                case R.id.right:
                    car.startAnimation(rotateRight);
                    break;
                case R.id.up:
                    break;
                case R.id.down:
                    break;
                case R.id.led:
                    break;
                case R.id.sword:
                    break;
            }
        }
    };

}
