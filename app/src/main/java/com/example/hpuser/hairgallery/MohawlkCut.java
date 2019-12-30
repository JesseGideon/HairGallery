package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MohawlkCut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohawlk_cut);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    public void onclickMohawk1(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys.class);
        startActivity(next);
    }


    public void onClickMohawk2(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys2.class);
        startActivity(next);
    }

    public void onClickMoawk3(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys3.class);
        startActivity(next);
    }

    public void onClickMoahawk4(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys4.class);
        startActivity(next);
    }

    public void onClickMoahawk5(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys5.class);
        startActivity(next);
    }

    public void onClickMoahawk6(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys6.class);
        startActivity(next);
    }

    public void onClickMoahawk7(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys7.class);
        startActivity(next);
    }

    public void onClickMoahawk8(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys8.class);
        startActivity(next);
    }

    public void onClickMoahawk9(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys9.class);
        startActivity(next);
    }

    public void onClickMoahawk10(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys10.class);
        startActivity(next);
    }

    public void onClickMoahawk11(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys11.class);
        startActivity(next);
    }

    public void onClickMohawk12(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys12.class);
        startActivity(next);
    }

    public void onClickMoahawk13(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys13.class);
        startActivity(next);
    }

    public void onClickMoahawk14(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys14.class);
        startActivity(next);
    }

    public void onClickMoahawk15(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys15.class);
        startActivity(next);
    }

    public void onClickMoahawk17(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys17.class);
        startActivity(next);
    }

    public void onClickMoahawk18(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys18.class);
        startActivity(next);
    }

    public void SixtenClick(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuysSixteen.class);
        startActivity(next);
    }

    public void onClick19Img(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys19.class);
        startActivity(next);
    }

    public void onclick20(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys20.class);
        startActivity(next);
    }

    public void onclick21Img(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys21.class);
        startActivity(next);
    }

    public void onclick22img(View view) {
        Intent next=new Intent(getApplicationContext(),PagerMohawkGuys22.class);
        startActivity(next);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
