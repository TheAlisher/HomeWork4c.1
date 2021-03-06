package com.example.homework4c1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.homework4c1.R;
import com.example.homework4c1.ui.models.Task;

public class FormActivity extends AppCompatActivity {

    EditText editTitle;
    EditText editDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Новая задача");
        }
        editTitle = findViewById(R.id.editTitle);
        editDesc = findViewById(R.id.editDesc);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void onClick(View view) {
        String title = editTitle.getText().toString().trim();
        String desc = editDesc.getText().toString().trim();
        Task task = new Task(title, desc);
        Intent intent = new Intent();
        intent.putExtra("task", task);
        setResult(RESULT_OK, intent);
        finish();
    }
}
