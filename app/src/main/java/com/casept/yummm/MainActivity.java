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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnBuySwipe)
    public void onBuySwipeClick(View view){
        launchVenueActivity();
    }

    private void launchVenueActivity() {

        Intent intent = new Intent(this, VenueActivity.class);
        startActivity(intent);
    }

}
