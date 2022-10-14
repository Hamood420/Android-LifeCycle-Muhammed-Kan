package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.MainActivity;
import com.example.login.R.id;


public class form extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        EditText nameEditText = (EditText) findViewById(R.id.names);
        String fullName = nameEditText.getText().toString();

        EditText currentWeightEditText = (EditText) findViewById(R.id.current_weight);
        String currentWeight = currentWeightEditText.getText().toString();

        EditText heightEditText = (EditText) findViewById(R.id.height);
        String Height = heightEditText.getText().toString();

        EditText goalWeightEditText = (EditText) findViewById(R.id.goal_weight);
        String GoalWeight = goalWeightEditText.getText().toString();

        EditText ageEditText = (EditText) findViewById(R.id.age);
        String age = ageEditText.getText().toString();

        display = (TextView) findViewById(id.display);
    }

    public void submitbuttonHandler(View view) {
        //Decide what happens when the user clicks the submit button
        TextView label = (TextView) findViewById(R.id.display);
        label.setText("Thank you. Have a nice day!!");
    }

    public void radioButtonhandler(View view) {
        // Decide what happens when a user clicks on a button
        Intent intent = new Intent(form.this, MainActivity.class);
        Button button = (Button) findViewById(id.btn2);
        String Sign_Out = button.getText().toString();
        intent.putExtra("Sign Out", Sign_Out);
        startActivity(intent);

    }
}