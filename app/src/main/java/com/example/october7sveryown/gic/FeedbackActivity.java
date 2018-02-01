package com.example.october7sveryown.gic;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView title =(TextView)findViewById(R.id.title_text);
        Typeface tftitle=Typeface.createFromAsset(getAssets(),"fonts/PT_Sans-Web-Bold.ttf");
        title.setTypeface(tftitle);

        Button bt = (Button)findViewById(R.id.btFeedback);
        bt.setTypeface(tftitle);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, HomeScreenActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
