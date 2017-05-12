package com.example.takasur.flexibleui;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void response(int i) {
        FragmentManager manager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.updateText(i);
    }
}
