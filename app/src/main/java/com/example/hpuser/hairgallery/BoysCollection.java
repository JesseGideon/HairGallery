package com.example.hpuser.hairgallery;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class  BoysCollection extends AppCompatActivity {
ImageView cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys_collection);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        cl= (ImageView) findViewById(R.id.lowCut);

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent lowcut= new Intent(BoysCollection.this,Low_Cut.class);
                startActivity(lowcut);



            }
        });
    }


    public void RoundCutClick(View view) {

        Intent roundCut = new Intent(BoysCollection.this,RoundCut.class);
        startActivity(roundCut);

    }



    public void MohawlkClicked(View view) {
        Intent MohawlkCut = new Intent(BoysCollection.this,MohawlkCut.class);
        startActivity(MohawlkCut);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}

