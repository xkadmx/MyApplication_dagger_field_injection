package com.example.myapplication_dagger_field_injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // before this part will be executed - build project

        CarComponent component = DaggerCarComponent.create();

        car = component.getCar();

    }

}
