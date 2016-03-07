package gmc.controlswitchprototipo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Grupo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void atras(View v) {
        Intent intent = new Intent(Grupo1.this,PrinciplaActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonObj1: // Cambia de nombre de boton grupo1
                AlertDialog.Builder builder = new AlertDialog.Builder(this);//creo un alert dialog con un builder
                final EditText entrada = new EditText(this) ;
                builder.setTitle(R.string.CambiarNomTitulo);
                builder.setMessage(R.string.msjCamNom);
                builder.setView(entrada);
                builder.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnObj1);
                        String textobtn = entrada.getText().toString().trim();
                        btn.setText(textobtn);
                    }

                });
                builder.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog = builder.create();
                dialog.show();

                break;
            case R.id.imageButtonObj2:// Cambia de nombre de boton grupo2
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                final EditText entrada2 = new EditText(this) ;
                builder2.setTitle(R.string.CambiarNomTitulo);
                builder2.setMessage(R.string.msjCamNom);
                builder2.setView(entrada2);
                builder2.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnObj2);
                        String textobtn = entrada2.getText().toString().trim();
                        btn.setText(textobtn);
                    }

                });
                builder2.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog2 = builder2.create();
                dialog2.show();
                break;
            case R.id.imageButtonObj3:// Cambia de nombre de boton grupo3
                AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                final EditText entrada3 = new EditText(this) ;
                builder3.setTitle(R.string.CambiarNomTitulo);
                builder3.setMessage(R.string.msjCamNom);
                builder3.setView(entrada3);
                builder3.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnObj3);
                        String textobtn = entrada3.getText().toString().trim();
                        btn.setText(textobtn);
                    }

                });
                builder3.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog3 = builder3.create();
                dialog3.show();
                break;
            case R.id.imageButtonObj4:// Cambia de nombre de boton grupo4
                AlertDialog.Builder builder4 = new AlertDialog.Builder(this);
                final EditText entrada4 = new EditText(this) ;
                builder4.setTitle(R.string.CambiarNomTitulo);
                builder4.setMessage(R.string.msjCamNom);
                builder4.setView(entrada4);
                builder4.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnObj4);
                        String textobtn = entrada4.getText().toString().trim();
                        btn.setText(textobtn);
                    }

                });

                builder4.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog4 = builder4.create();
                dialog4.show();
                break;
            case R.id.btnBorrarObj1:
                Button btn = (Button) findViewById(R.id.btnObj1);
                btn.setText(R.string.btnObj);
                break;
            case R.id.btnBorrarObj2:
                Button btn2 = (Button) findViewById(R.id.btnObj2);
                btn2.setText(R.string.btnObj);
                break;
            case R.id.btnBorrarObj3:
                Button btn3 = (Button) findViewById(R.id.btnObj3);
                btn3.setText(R.string.btnObj);
                break;
            case R.id.btnBorrarObj4:
                Button btn4 = (Button) findViewById(R.id.btnObj4);
                btn4.setText(R.string.btnObj);
                break;
        }
    }


}
