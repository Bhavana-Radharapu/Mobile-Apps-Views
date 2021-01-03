package com.example.cs478_project_2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void view_Image(View view) {
        OpenImageActivity();
    }

    private void OpenImageActivity() {
        Intent intent = new Intent(this,Full_Image.class);
        startActivity(intent);

    }
}