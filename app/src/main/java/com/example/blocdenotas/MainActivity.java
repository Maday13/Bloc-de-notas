package com.example.blocdenotas;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int ADD = Menu.FIRST;
    private static final int DELETE = Menu.FIRST + 1;
    private static final int EXIST = Menu.FIRST + 2;
    ListView lista;
    TextView textLista;
    AdaptadorBD DB;
    List<String> item = null;
    String getTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textLista = (TextView)findViewById(R.id.textView_Lista);
        lista = (ListView)findViewById(R.id.listView_Lista);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        /* El primer valor del botón es la colocación del mismo en la pantalla, el segundo es
        el final int creado anteriormente y que despues nos servira para saber que botón se
        ha pulsado, por último encontramos el valor del texto del botón dado por el
        valor de los string contenidos en string.xml*/

        menu.add(1, ADD, 0, R.string.menu_crear);
        menu.add(2, DELETE, 0, R.string.menu_borrar_todas);
        menu.add(3, EXIST, 0, R.string.menu_salir);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    //Método sobreescrito de la clase listActivity que pasa a la acción
    //cuando se pulsa un botón del menú
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id)
        {
            case ADD:
                actividad("add");
                return true;

            case DELETE:
                return true;
            case EXIST:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void actividad (String act)
    {
        String type = "", content = "";
        if (act.equals("add"))
        {
            type = "add";
            Intent intent = new Intent(MainActivity.this,AgregarNota.class);
            intent.putExtra("type",type);
            startActivity(intent);
        }
    }
}