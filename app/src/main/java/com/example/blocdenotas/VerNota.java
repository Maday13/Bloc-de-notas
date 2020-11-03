package com.example.blocdenotas;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContainer;

public class VerNota extends AppCompatActivity {
    String title, content;
    TextView TITLE, CONTENT;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ver_nota);

        Bundle bundle = this.getIntent().getExtras();

        title = bundle.getString("title");
        content = bundle.getString("content");

        TITLE = (TextView) findViewById(R.id.textView_Titulo);
        CONTENT = (TextView) findViewById(R.id.textView_Content);
        TITLE.setText(title);
        CONTENT.setText(content);
    }
}
