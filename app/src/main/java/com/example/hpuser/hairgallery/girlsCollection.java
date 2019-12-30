package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class girlsCollection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls_collection);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void braidsClick(View view) {
        Intent braids = new Intent(girlsCollection.this,Braids.class);
        startActivity(braids);
    }

    public void curlyClicked(View view) {
        Intent curly = new Intent(girlsCollection.this,CurlyCrocket.class);
        startActivity(curly);
    }

    public void updoClicked(View view) {
        Intent updo = new Intent(girlsCollection.this,Updo.class);
        startActivity(updo);
    }

    public void MohawlkGirlsClicked(View view) {
        Intent mowalkGirls = new Intent(girlsCollection.this,MohawkGirls.class);
        startActivity(mowalkGirls);
    }

    public void FixingClicked(View view) {
        Intent fixing = new Intent(girlsCollection.this,Fixing.class);
        startActivity(fixing);
    }

    public void OtherClicekd(View view) {
        Intent other= new Intent(girlsCollection.this,Others.class);
        startActivity(other);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
