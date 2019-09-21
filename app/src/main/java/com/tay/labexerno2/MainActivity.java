package com.tay.labexerno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etcrs1, etcrs2, etcrs3, etcrs4, etcrs5, etcrs6, etcrs7, etcrs8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etcrs1 = findViewById(R.id.editText);
        etcrs2 = findViewById(R.id.editText2);
        etcrs3 = findViewById(R.id.editText3);
        etcrs4 = findViewById(R.id.editText4);
        etcrs5 = findViewById(R.id.editText5);
        etcrs6 = findViewById(R.id.editText6);
        etcrs7 = findViewById(R.id.editText7);
        etcrs8 = findViewById(R.id.editText8);
    }
    public void save(View v){
        SharedPreferences sp = getSharedPreferences("courses", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String cour1 = etcrs1.getText().toString();
        String cour2 = etcrs2.getText().toString();
        String cour3 = etcrs3.getText().toString();
        String cour4 = etcrs4.getText().toString();
        String cour5 = etcrs5.getText().toString();
        String cour6 = etcrs6.getText().toString();
        String cour7 = etcrs7.getText().toString();
        String cour8 = etcrs8.getText().toString();
        editor.putString("course1", cour1);
        editor.putString("course2", cour2);
        editor.putString("course3", cour3);
        editor.putString("course4", cour4);
        editor.putString("course5", cour5);
        editor.putString("course6", cour6);
        editor.putString("course7", cour7);
        editor.putString("course8", cour8);
        editor.commit();
        Toast.makeText(this, "Courses are saved...", Toast.LENGTH_LONG).show();
    }

    public void next(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
