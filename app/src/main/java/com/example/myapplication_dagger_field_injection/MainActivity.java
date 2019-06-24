package com.example.myapplication_dagger_field_injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // before this part will be executed - build project

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);


        car.drive();

    }

}
