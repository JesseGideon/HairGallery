package com.example.hpuser.hairgallery;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HomeSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sample);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Uri imageShare = Uri.parse("android.resource://com.example.hpuser.hairgallery/drawable/"+R.drawable.background);
                Intent share= new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.putExtra(Intent.EXTRA_TEXT,"Hey There,Wonder How i do Look Good EveryDay?Check out this App that Contains List of hair Styles," +
                        "And Look Better Than Me.");
                //share.putExtra(Intent.EXTRA_STREAM,imageShare);
                share.setType("text/plain");
                startActivity(Intent.createChooser(share,"Share App Using"));
            }
        });

            FloatingActionButton fab2= (FloatingActionButton) findViewById(R.id.fabSend);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendMsg = new Intent(HomeSample.this,Feedback.class);
                startActivity(sendMsg);
            }
        });
    }

    public void Exit(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(HomeSample.this);
        myAlert.setTitle("Exit Application");
        myAlert.setMessage("Quit Application")

                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();

                            }
                        })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                });
        AlertDialog create= myAlert.create();
        create.show();
    }

    public void menStyleClicked(View view) {
        Intent boys = new Intent(HomeSample.this,BoysCollection.class);
        startActivity(boys);
    }

    public void ladysStyleClicked(View view) {
        Intent ladys = new Intent(HomeSample.this,girlsCollection.class);
        startActivity(ladys);
    }

    public void about(View view) {
        AlertDialog.Builder myhey= new AlertDialog.Builder(this,R.style.Theme_AppCompat_DayNight_Dialog);
        myhey.setTitle("About Home Gallery");
        myhey.setMessage("Hello,Am Hair Gallery, Thanks For Having me on Your Device." +
                "\n" + "\n"+ "\n"+
                "Cozmuse" + "\n" +
                "Version 1.0");
        myhey.setIcon(R.drawable.background);
        myhey.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog create= myhey.create();
        create.show();
    }


}
