package com.example.test.loadscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = MainActivity.this.findViewById(R.id.btnSetLoad);
        final FrameLayout frameLayout = MainActivity.this.findViewById(R.id.plateformeFrame);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(frameLayout.getVisibility()==View.GONE) {
                    frameLayout.setVisibility(View.VISIBLE);
                }else{
                    frameLayout.setVisibility(View.GONE);
                }
            }
        });





    }
}
