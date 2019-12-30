package com.example.hpuser.hairgallery;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    TextView name;
    TextView comment;
    Button sendMsg;
    String getComment;
    String getName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name = (TextView) findViewById(R.id.textname);
        comment = (TextView) findViewById(R.id.textcomment);
        sendMsg= (Button) findViewById(R.id.send);
        sendMsg.setEnabled(false);
        comment.setEnabled(false);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals("")){
                    comment.setEnabled(false);
                }else
                    comment.setEnabled(true);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        comment.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if(s.toString().equals("")){
                        sendMsg.setEnabled(false);
                    }else
                        sendMsg.setEnabled(true);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
sendMsg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        getComment=comment.getText().toString().trim();
        getName= name.getText().toString().trim();
        Intent i = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "cozmusetechnology@gmail.com", null));
        i.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
        i.putExtra(Intent.EXTRA_TEXT, getName + " Says " + getComment);
        startActivity(i);
    }
});
    }




}
