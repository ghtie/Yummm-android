package com.casept.yummm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //@BindView(R.id.btnBuySwipe)
    //Button btnBuySwipe;

    private Button btnBuySwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ButterKnife.bind(this);

        btnBuySwipe = (Button) findViewById(R.id.btnBuySwipe);

        btnBuySwipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
    }

    private void launchActivity() {

        Intent intent = new Intent(this, VenueActivity.class);
        startActivity(intent);
    }

    /*@OnClick(R.id.btnBuySwipe)
    public void displayVenues(View view){
        Intent intent = new Intent(view.getContext(), VenueActivity.class);
        startActivityForResult(intent, 0);
    }*/


}
