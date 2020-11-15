package ru.startandroid.p00101_listener;


import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    Button button3;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        button3 = (Button) findViewById(R.id.button3);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btnOk:
                        tvOut.setText(R.string.text1);
                        break;
                    case R.id.btnCancel:
                        tvOut.setText(R.string.text2);
                        break;
                    case R.id.button3:
                        tvOut.setText(R.string.text3);
                        break;
                }
            }
        };
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setText(R.string.textButton);
            }
        });



        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка 1");
            }
        });
        btnCancel.setOnClickListener (this);

    }

    public void clickButton3(View view) {
        tvOut.setText("Нажата кнопка 3");
    }

    @Override
    public void onClick(View v) {
        tvOut.setText("Нажата кнопка 2");
    }
}
