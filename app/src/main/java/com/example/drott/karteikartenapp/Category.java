package com.example.drott.karteikartenapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;
import java.lang.String;

/**
 * Created by drott on 07.06.2018.
 */
public class Category extends Activity {
    private TextView display;
    private int requestedCategory;
    private String strRequCat;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        display = (TextView) findViewById(R.id.display);
        Bundle bundle = getIntent().getExtras();
        requestedCategory=bundle.getInt("MainActivity");
        display.setText(Integer.toString(requestedCategory));


    }
}