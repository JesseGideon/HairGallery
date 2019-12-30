package com.example.hpuser.hairgallery;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Braids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_braids);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    public void braids1Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids.class);
        startActivity(braids);
    }

    public void braids2Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids2.class);
        startActivity(braids);
    }

    public void braids3Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids3.class);
        startActivity(braids);
    }

    public void braids4Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids4.class);
        startActivity(braids);
    }

    public void braids5Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids5.class);
        startActivity(braids);
    }

    public void braids6Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids6.class);
        startActivity(braids);
    }

    public void braids7Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids7.class);
        startActivity(braids);
    }

    public void braids8Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids8.class);
        startActivity(braids);
    }

    public void braids9Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids9.class);
        startActivity(braids);
    }

    public void braids10Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids10.class);
        startActivity(braids);

    }

    public void braids11Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids11.class);
        startActivity(braids);
    }

    public void braids12Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids12.class);
        startActivity(braids);
    }

    public void braids13Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids13.class);
        startActivity(braids);
    }

    public void braids14Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids14.class);
        startActivity(braids);
    }

    public void braids15Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids15.class);
        startActivity(braids);
    }

    public void braids16Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids16.class);
        startActivity(braids);
    }

    public void braids17Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids17.class);
        startActivity(braids);
    }

    public void braids18Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids18.class);
        startActivity(braids);
    }

    public void braids19Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids19.class);
        startActivity(braids);
    }

    public void braids20Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids20.class);
        startActivity(braids);
    }

    public void braids21Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids21.class);
        startActivity(braids);
    }

    public void braids22Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids22.class);
        startActivity(braids);
    }

    public void braids23Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids23.class);
        startActivity(braids);
    }

    public void braids24Click(View view) {
        Intent braids = new Intent(getApplicationContext(),PagerBraids24.class);
        startActivity(braids);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
