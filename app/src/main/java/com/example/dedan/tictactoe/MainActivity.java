
package com.example.dedan.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.android.tictactoe.R;

public class MainActivity extends AppCompatActivity {

    Button b, b2, b3, b4, b5, b6, b7, b8, b9;

    int player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.b);
        b = (Button) findViewById(R.id.b2);
        b = (Button) findViewById(R.id.b3);
        b = (Button) findViewById(R.id.b4);
        b = (Button) findViewById(R.id.b5);
        b = (Button) findViewById(R.id.b6);
        b = (Button) findViewById(R.id.b7);
        b = (Button) findViewById(R.id.b8);
        b = (Button) findViewById(R.id.b9);

        player = 1;


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b3.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b3.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b3.setText("O");
                    }
                }

                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b4.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b4.setText("O");
                    }
                }

                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b5.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b5.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b5.setText("O");
                    }
                }
                endGame();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b6.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b6.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b6.setText("O");
                    }
                }

                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (b7.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b7.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b7.setText("O");
                    }
                }

                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b8.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b8.setText("O");
                    }
                }
                endGame();

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b9.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b9.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b9.setText("O");
                    }
                }

                endGame();
            }
        });
    }
    public void endGame(){

    }
}

