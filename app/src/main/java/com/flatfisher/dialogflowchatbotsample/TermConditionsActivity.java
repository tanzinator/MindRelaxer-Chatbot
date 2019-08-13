package com.flatfisher.dialogflowchatbotsample;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.firebase.auth.FirebaseAuth;

public class TermConditionsActivity extends  AppCompatActivity {
    private CheckBox checkboxView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tc);
        checkboxView = (CheckBox) findViewById(R.id.checkBox);
        final Button signinButton = (Button) findViewById(R.id.submit);
        signinButton.setEnabled(false);
        checkboxView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    signinButton.setEnabled(true);
                    signinButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(context, LoginActivity.class);
                            startActivity(intent);
                        }
                    });

                }
            }
        });
    }
}
