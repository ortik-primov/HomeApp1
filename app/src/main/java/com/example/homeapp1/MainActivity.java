package com.example.homeapp1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        EditText editProfession = findViewById(R.id.text);

        EditText editPersonName = findViewById(R.id.textPersonName);

        EditText editPhoneNumber = findViewById(R.id.phoneNumber);

        EditText editPassword = findViewById(R.id.textPassword);

        EditText editEmailAddress = findViewById(R.id.textEmailAddress);

        Button buttonSave = findViewById(R.id.buttonSave);

        TextView labelProfession = findViewById(R.id.labelProfession);

        TextView labelPersonName = findViewById(R.id.labelPersonName);

        TextView labelPhoneNumber = findViewById(R.id.labelPhoneNumber);

        TextView labelPassword = findViewById(R.id.labelPassword);

        TextView labelEmailAddress = findViewById(R.id.labelEmailAddress);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                labelProfession.setText("Должность: " + editProfession.getText().toString());

                labelPersonName.setText("Имя, фамилия: " + editPersonName.getText().toString());

                labelPhoneNumber.setText("Номер телефона: " + editPhoneNumber.getText().toString());

                labelPassword.setText("Пароль личного кабинета: " + editPassword.getText().toString());

                labelEmailAddress.setText("E-mail: " + editEmailAddress.getText().toString());

            }
        });

    }
}