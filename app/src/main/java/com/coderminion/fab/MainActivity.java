package com.coderminion.fab;

import android.os.Bundle;


import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//      TODO GITHUB repo (Use ctrl + click on URL)   https://github.com/futuresimple/android-floating-action-button
//      TODO Website (Use ctrl + click on URL)  https://material.io/guidelines/components/buttons.html#buttons-button-types

        FloatingActionButton some_action = (FloatingActionButton)findViewById(R.id.some_action);
        FloatingActionButton action_another = (FloatingActionButton)findViewById(R.id.action_another);
        final FloatingActionsMenu floatingActionsMenu = (FloatingActionsMenu)findViewById(R.id.multiple_actions);


        some_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                floatingActionsMenu.collapse();
                Toast.makeText(getApplicationContext(),"Some Action",Toast.LENGTH_SHORT).show();
            }
        });


        action_another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                floatingActionsMenu.collapse();
                Toast.makeText(getApplicationContext(),"Another Action",Toast.LENGTH_SHORT).show();
            }
        });




    }
}
