package com.gk.uits_scheduler.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gk.uits_scheduler.R;
import com.gk.uits_scheduler.model.Note;
import com.gk.uits_scheduler.utils.DbHelper;


public class NoteInfoActivity extends AppCompatActivity {

    private DbHelper db;
    private Note note;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_info);
        setupIntent();
    }

    private void setupIntent() {
        db = new DbHelper(NoteInfoActivity.this);
        note = (Note) getIntent().getSerializableExtra(NotesActivity.KEY_NOTE);
        text = findViewById(R.id.edittextNote);
        if (note.getText() != null) {
            text.setText(note.getText());
        }
    }

    @Override
    public void onBackPressed() {
        note.setText(text.getText().toString());
        db.updateNote(note);
        Toast.makeText(NoteInfoActivity.this, getResources().getString(R.string.saved), Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                note.setText(text.getText().toString());
                db.updateNote(note);
                Toast.makeText(NoteInfoActivity.this, getResources().getString(R.string.saved), Toast.LENGTH_SHORT).show();
                super.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
