package es.jotamontero.dondeestamicoche;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        Handler handler = new Handler();
        // Mostramos la pantalla del logo durante unos segundos.
        // Aquí hay que añadir las comprobaciones de ubicación e internet.
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LogoActivity.this, InicioActivity.class);
                startActivity(i);
                finish();
            }
        }, 4500);
    }

}
