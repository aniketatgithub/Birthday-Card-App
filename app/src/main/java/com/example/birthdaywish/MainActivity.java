package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String key = "com.example.birthdaywish.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETname = findViewById(R.id.ETname);
    }
String name ;
    EditText ETname ;

    public void BTNfun(View view) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
        name = ETname.getText().toString();
        Intent newpage = new Intent(this,MainActivity2.class);
        newpage.putExtra(key,name);
        startActivity(newpage);
    }
}