package com.dcoders.satishkumar.g.iamin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dcoders.satishkumar.g.iamin.fragment.SliderFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new SliderFragment()).commit();
    }
}
