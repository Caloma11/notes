package edu.cs50.harvard.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    private EditText editText;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        editText = findViewById(R.id.note_edit_text);
        String content = getIntent().getStringExtra("content");
        int id = getIntent().getIntExtra("id", 0);
        editText.setText(content);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        MainActivity.database.noteDao().save(editText.getText().toString(), id);
    }
}
