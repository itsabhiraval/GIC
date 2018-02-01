package com.example.october7sveryown.gic;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        CheckBox terms = (CheckBox)findViewById(R.id.terms);

        TextView title =(TextView)findViewById(R.id.title_text);
        Typeface tftitle=Typeface.createFromAsset(getAssets(),"fonts/PT_Sans-Web-Bold.ttf");
        title.setTypeface(tftitle);
        terms.setTypeface(tftitle);

        TextView login = (TextView)findViewById(R.id.link_login);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


        Typeface tfgen=Typeface.createFromAsset(getAssets(),"fonts/PT_Sans-Web-Regular.ttf");
        EditText etmail=(EditText)findViewById(R.id.input_email);
       EditText etpassword=(EditText)findViewById(R.id.input_password);
        EditText fname=(EditText)findViewById(R.id.input_firstname);
        EditText lname=(EditText)findViewById(R.id.input_lastname);
        EditText rePass=(EditText)findViewById(R.id.input_Repassword);
        EditText enroll=(EditText)findViewById(R.id.enrollmentNo);
        EditText college=(EditText)findViewById(R.id.clgname);

        TextView gender = (TextView)findViewById(R.id.gender_textview);
        gender.setTypeface(tfgen);

        TextView link = (TextView)findViewById(R.id.link_login);

        link.setTypeface(tftitle);

        EditText mobile =(EditText)findViewById(R.id.mobileNo);
        RadioButton rbMale = (RadioButton) findViewById(R.id.male_radio_btn);
        RadioButton rbfemale = (RadioButton) findViewById(R.id.female_radio_btn);



        etmail.setTypeface(tfgen);
        etpassword.setTypeface(tfgen);
        fname.setTypeface(tfgen);
        lname.setTypeface(tfgen);
        rePass.setTypeface(tfgen);
        enroll.setTypeface(tfgen);
        college.setTypeface(tfgen);
        mobile.setTypeface(tfgen);
        rbMale.setTypeface(tfgen);
        rbfemale.setTypeface(tfgen);

        Button bsubmit=(Button)findViewById(R.id.btn_signup);
        bsubmit.setTypeface(tfgen);

        terms.setTypeface(tfgen);
    }
}


