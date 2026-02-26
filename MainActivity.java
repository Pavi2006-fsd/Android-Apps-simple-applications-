package com.example.program1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    CheckBox c1, c2, c3;
    RadioButton r1, r2;
    EditText t1, t2;
    TextView display;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.editText1); // Name
        t2 = (EditText) findViewById(R.id.editText2); // Phone
        display = (TextView) findViewById(R.id.editText3);

        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);

        r1 = (RadioButton) findViewById(R.id.radio1);
        r2 = (RadioButton) findViewById(R.id.radio2);

        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = t1.getText().toString();
                String phone = t2.getText().toString();

                String gender = "";
                if (r1.isChecked()) {
                    gender = "Female";
                } else if (r2.isChecked()) {
                    gender = "Male";
                }

                String language = "";
                if (c1.isChecked()) language += "C/C++ ";
                if (c2.isChecked()) language += "Python ";
                if (c3.isChecked()) language += "Java ";

                if (language.equals("")) {
                    language = "No language selected";
                }

                String result =
                        "Name: " + name + "\n" +
                        "Gender: " + gender + "\n" +
                        "Languages: " + language + "\n" +
                        "Phone: " + phone;

                display.setText(result);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
