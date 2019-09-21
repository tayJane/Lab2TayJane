package com.tay.labexerno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        input = findViewById(R.id.editText9);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("courses", MODE_PRIVATE);
        String crs1SP = sp.getString("course1", null);
        String crs2SP = sp.getString("course2", null);
        String crs3SP = sp.getString("course3", null);
        String crs4SP = sp.getString("course4", null);
        String crs5SP = sp.getString("course5", null);
        String crs6SP = sp.getString("course6", null);
        String crs7SP = sp.getString("course7", null);
        String crs8SP = sp.getString("course8", null);
        String course = input.getText().toString();

        if(course.equals(crs1SP) || course.equals(crs2SP) || course.equals(crs3SP) || course.equals(crs4SP) ||
                course.equals(crs5SP) || course.equals(crs6SP) || course.equals(crs7SP) || course.equals(crs8SP)){
            Toast.makeText(this, "Course is present...", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Course is Not present...", Toast.LENGTH_LONG).show();
        }
    }

    public void previous(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
