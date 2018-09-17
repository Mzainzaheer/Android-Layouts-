package com.example.muhammadfaiq.smdassignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Muhammad Faiq on 9/14/2018.
 */

public class Constraint extends AppCompatActivity
{

     Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint);
        btn = (Button) findViewById(R.id.button);  //This is for Relative layout
        btn.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v)
            {
                ShowLog();
            }
        });
    }

    public void ShowLog()
    {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        int selectedId = -1;
        selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton  radioButton = (RadioButton) findViewById(selectedId);


        CheckBox check = (CheckBox) findViewById(R.id.checkBox);


        EditText name = (EditText)  findViewById(R.id.editText);
        EditText password = (EditText)  findViewById(R.id.editText2);
        String str = name.getText().toString();
        String str2 = password.getText().toString();


        if (check.isChecked())
        {
            if (str.isEmpty())
                Toast.makeText(getApplicationContext(),
                        "Enter email " ,
                        Toast.LENGTH_SHORT).show();
           else if (str2.isEmpty())
                Toast.makeText(getApplicationContext(),
                        "Enter password " ,
                        Toast.LENGTH_SHORT).show();
           else if (selectedId == -1)
                Toast.makeText(getApplicationContext(),
                        "Select gender " ,
                        Toast.LENGTH_SHORT).show();


           else
            Toast.makeText(getApplicationContext(),
                    "Email: " + str
                            + ". Password: " + str2
                            + ". Gender: " + radioButton.getText() ,
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Accept the terms and conditions please " ,
                    Toast.LENGTH_SHORT).show();
        }


    }

}
