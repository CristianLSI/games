package com.example.cristian.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Chanti Ledesma on 01/11/2017.
 */

public class LGameTest extends AppCompatActivity implements View.OnClickListener {


    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12;
    // ArrayList<Button> buttonArray = new ArrayList<>();
    //ArrayList<Integer> direcciones = new ArrayList<>();
    int[][] board = new int[3][4];
    int[] posicion = {0, 0};

    private void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = 0;
            }
        }
    }

    private boolean validMove(int i, int j) {
        boolean b = false;
        if (((Math.abs(posicion[0] - i) == 2) && (Math.abs(posicion[1] - j) == 1)) || (((Math.abs(posicion[0] - i) == 1) && (Math.abs(posicion[1] - j) == 2)))) {
            b = true;
        }
        return b;
    }

    private void setX(int x) {
        posicion[0] = x;
    }

    private void setY(int y) {
        posicion[1] = y;
    }

    private boolean checkWin() {
        boolean b = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 0) {
                    b = false;
                }
            }
        }
        return b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lgametest);

        /* buttonArray.add(button1);
        buttonArray.add(button2);
        buttonArray.add(button3);
        buttonArray.add(button4);
        buttonArray.add(button5);
        buttonArray.add(button6);
        buttonArray.add(button7);
        buttonArray.add(button8);
        buttonArray.add(button9);
        buttonArray.add(button10);
        buttonArray.add(button11);
        buttonArray.add(button12);

        direcciones.add(R.id.btn1);
        direcciones.add(R.id.btn2);
        direcciones.add(R.id.btn3);
        direcciones.add(R.id.btn4);
        direcciones.add(R.id.btn5);
        direcciones.add(R.id.btn6);
        direcciones.add(R.id.btn7);
        direcciones.add(R.id.btn8);
        direcciones.add(R.id.btn9);
        direcciones.add(R.id.btn10);
        direcciones.add(R.id.btn11);
        direcciones.add(R.id.btn12);*/


        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btn10);
        button11 = (Button) findViewById(R.id.btn11);
        button12 = (Button) findViewById(R.id.btn12);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

        board[0][0] = 1;
        button1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        //Soy una modificacion xD


    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.btn1:
                if (board[0][0] == 0) {
                    if (validMove(0, 0)) {
                        board[0][0] = 1;
                        button1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(0);
                        setY(0);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;
            case R.id.btn2:
                if (board[0][1] == 0) {
                    if (validMove(0, 1)) {
                        board[0][1] = 1;
                        button2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(0);
                        setY(1);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn3:
                if (board[0][2] == 0) {
                    if (validMove(0, 2)) {
                        board[0][2] = 1;
                        button3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(0);
                        setY(2);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn4:
                if (board[0][3] == 0) {
                    if (validMove(0, 3)) {
                        board[0][3] = 1;
                        button4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(0);
                        setY(3);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn5:
                if (board[1][0] == 0) {
                    if (validMove(1, 0)) {
                        board[1][0] = 1;
                        button5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(1);
                        setY(0);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;
            case R.id.btn6:
                if (board[1][1] == 0) {
                    if (validMove(1, 1)) {
                        board[1][1] = 1;
                        button6.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(1);
                        setY(1);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn7:
                if (board[1][2] == 0) {
                    if (validMove(1, 2)) {
                        board[1][2] = 1;
                        button7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(1);
                        setY(2);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn8:
                if (board[1][3] == 0) {
                    if (validMove(1, 3)) {
                        board[1][3] = 1;
                        button8.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(1);
                        setY(3);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn9:
                if (board[2][0] == 0) {
                    if (validMove(2, 0)) {
                        board[2][0] = 1;
                        button9.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(2);
                        setY(0);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;
            case R.id.btn10:
                if (board[2][1] == 0) {
                    if (validMove(2, 1)) {
                        board[2][1] = 1;
                        button10.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(2);
                        setY(1);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn11:
                if (board[2][2] == 0) {
                    if (validMove(2, 2)) {
                        board[2][2] = 1;
                        button11.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(2);
                        setY(2);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;

            case R.id.btn12:
                if (board[2][3] == 0) {
                    if (validMove(2, 3)) {
                        board[2][3] = 1;
                        button12.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        setX(2);
                        setY(3);
                        if (checkWin()) {
                            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
                            reset();
                        }
                    }
                }

                break;
        }

    }
}
