package com.numerica98.laboratorio2_ejercicio2;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1= findViewById(R.id.caja1);
        img2= findViewById(R.id.caja2);
        img3= findViewById(R.id.caja3);
        img4= findViewById(R.id.caja4);
        img5= findViewById(R.id.caja5);
        img6= findViewById(R.id.caja6);
        img7= findViewById(R.id.caja7);
        img8= findViewById(R.id.caja8);
        img9= findViewById(R.id.caja9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        int viewId = v.getId();
        int[] img= {R.drawable.china, R.drawable.corea, R.drawable.japon};
        numero = (int) Math.floor(Math.random()*(2+0+1));

        switch (viewId){
            case R.id.caja1:
                img1.setImageResource(img[numero]);
                break;
            case R.id.caja2:
                img2.setImageResource(img[numero]);
                break;
            case R.id.caja3:
                img3.setImageResource(img[numero]);
                break;
            case R.id.caja4:
                img4.setImageResource(img[numero]);
                break;
            case R.id.caja5:
                img5.setImageResource(img[numero]);
                break;
            case R.id.caja6:
                img6.setImageResource(img[numero]);
                break;
            case R.id.caja7:
                img7.setImageResource(img[numero]);
                break;
            case R.id.caja8:
                img8.setImageResource(img[numero]);
                break;
            case R.id.caja9:
                img9.setImageResource(img[numero]);
                break;
        }
    }
}
