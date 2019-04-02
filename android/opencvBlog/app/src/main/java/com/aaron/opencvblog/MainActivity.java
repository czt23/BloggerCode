package com.aaron.opencvblog;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    ImageView imageView;
    Bitmap srcBitmap,grayBitmap;
    boolean flag = false;

    static {
        System.loadLibrary("opencv_java3");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        button.setOnClickListener(this);
        proc();
    }

    @Override
    public void onClick(View v) {
        if(v == button){
            if(!flag) {
                imageView.setImageBitmap(grayBitmap);
                flag = true;
                button.setText("GRAY");
            }else{
                imageView.setImageBitmap(srcBitmap);
                flag = false;
                button.setText("RAW");
            }
        }
    }

    public void proc(){
        Mat rgbMat = new Mat();
        Mat grayMat = new Mat();
        srcBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.photo);
        grayBitmap = Bitmap.createBitmap(srcBitmap.getWidth(),srcBitmap.getHeight(),Bitmap.Config.RGB_565);
        Utils.bitmapToMat(srcBitmap,rgbMat);
        Imgproc.cvtColor(rgbMat,grayMat,Imgproc.COLOR_RGB2GRAY);
        Utils.matToBitmap(grayMat,grayBitmap);
    }

}
