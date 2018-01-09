package com.casept.yummm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnBuySwipe)
    Button btnBuySwipe;

    //private Button btnBuySwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnBuySwipe)
    public void onClick(View view){
        launchActivity();
    }

    private void launchActivity() {

        Intent intent = new Intent(this, VenueActivity.class);
        startActivity(intent);
    }

}
