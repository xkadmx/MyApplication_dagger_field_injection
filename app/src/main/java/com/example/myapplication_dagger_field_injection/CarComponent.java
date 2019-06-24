package com.example.myapplication_dagger_field_injection;


import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject (MainActivity mainactivity);  // providing a method for the interface
}
