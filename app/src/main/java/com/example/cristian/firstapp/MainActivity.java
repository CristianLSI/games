package com.example.cristian.firstapp;

import android.content.res.ColorStateList;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int chance = 0;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);





        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_reload:
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btn1.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn2.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn3.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn4.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn5.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn6.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn7.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn8.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                btn9.setBackgroundTintList(ColorStateList.valueOf(android.R.drawable.btn_default));
                return true;
            default:
                return true;

        }
    }

    public void cambiarColor(){



    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.btn1:
                if (btn1.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn1.setText("O");
                        btn1.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        resultado();
                    } else {
                        chance = 0;
                        btn1.setText("X");
                        btn1.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        resultado();
                    }
                }
                break;

            case R.id.btn2:
                if (btn2.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn2.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn2.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn2.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn2.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn3:
                if (btn3.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn3.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn3.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn3.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn3.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn4:
                if (btn4.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn4.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn4.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn4.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn4.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn5:
                if (btn5.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn5.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn5.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn5.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn5.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn6:
                if (btn6.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn6.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn6.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn6.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn6.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn7:
                if (btn7.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn7.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn7.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn7.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn7.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn8:
                if (btn8.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn8.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn8.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn8.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn8.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn9:
                if (btn9.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn9.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorO)));
                        btn9.setText("O");
                        resultado();
                    } else {
                        chance = 0;
                        btn9.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorX)));
                        btn9.setText("X");
                        resultado();
                    }
                }
                break;

        }
    }

    public void resultado() {
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            // button.callOnClick();
        } else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            Toast.makeText(this, "Jugador X es el ganador", Toast.LENGTH_SHORT).show();
            // button.callOnClick();
        } else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        } else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            Toast.makeText(this, "Jugador O es el ganador", Toast.LENGTH_SHORT).show();
            //button.callOnClick();
        }
    }
}