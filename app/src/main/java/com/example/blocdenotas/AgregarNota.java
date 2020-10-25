package com.example.blocdenotas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AgregarNota extends AppCompatActivity
{
    Button Add;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_nota);

        Add = (Button)findViewById(R.id.button_Add);

        Bundle bundle = this.getIntent().getExtras();

        type = bundle.getString("type");

        if(type.equals("add"))
        {
            Add.setText("Add nota");
        }

    }
}
