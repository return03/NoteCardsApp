package com.example.drott.karteikartenapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements MainActivityInterface {
    private int noCategory=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCategoryOne= (Button) findViewById(R.id.Category1);
        Button buttonCategoryTwo= (Button) findViewById(R.id.Category2);
        Button buttonCategoryThree= (Button) findViewById(R.id.Category3);
        Button buttonCategoryFour= (Button) findViewById(R.id.Category4);
        Button buttonCategoryFive= (Button) findViewById(R.id.Category5);

        onClickListener(buttonCategoryOne, 1);
        onClickListener(buttonCategoryTwo, 2);
        onClickListener(buttonCategoryThree, 3);
        onClickListener(buttonCategoryFour, 4);
        onClickListener(buttonCategoryFive, 5);




    }

    private void onClickListener(Button buttonPressed, final int noOfCategory){
        noCategory=noOfCategory;

        buttonPressed.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intentOne = new Intent(getBaseContext(), Category.class);
                intentOne.putExtra("MainActivity", noCategory);
                startActivity(intentOne);


            }
        });
    }

    public int getNoCategory(){
        return noCategory;
    }
}
