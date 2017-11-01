package com.example.cristian.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Button btn = (Button) findViewById(R.id.btn_iniciar);
        Button btnC = (Button) findViewById(R.id.btn_config);

        btn.setOnClickListener(this);
        btnC.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_iniciar:
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.btn_config:
                startActivity(new Intent(this,LGameTest.class));
                break;
        }

    }
}
