package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import static android.widget.Toast.LENGTH_LONG;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText myTextField = findViewById(R.id.editText);
        String str = myTextField.getText().toString();
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button clickMe = findViewById(R.id.clickButton);
//        clickMe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                Log.i("info", "button pressed");
//            }
//        });

    }
}
