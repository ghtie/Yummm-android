package com.casept.yummm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VenueActivity extends AppCompatActivity {

    @BindView(R.id.btnBack)
    Button btnBack;

    //@BindView(R.id.venue1)
    //TextView venue1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnBack)
    public void onBackClick(View view){
        launchMainMenuActivity();
    }

    private void launchMainMenuActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /*@OnClick(R.id.venue1)
    public void onVenueClick(){
        launchSwipeListActivity();
    }

    private void launchSwipeListActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

}
