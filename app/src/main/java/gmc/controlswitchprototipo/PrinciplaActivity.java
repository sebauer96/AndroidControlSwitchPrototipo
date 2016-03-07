package gmc.controlswitchprototipo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;



public class PrinciplaActivity extends AppCompatActivity {

    public String textobtn, textobtn2, textobtn3, textobtn4;
    public int btnpert1 = 1, btnpert2, btnpert3, btnpert4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principla);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        AlertDialog.Builder builder5 = new AlertDialog.Builder(this);
        final EditText entrada5 = new EditText(this);
        builder5.setTitle("Tareas");
        builder5.setMessage("Deben ser 10 grupos de 8 objetos cada uno.Los objetos deben ser un boton on y otro off.Y todos en la misma pantalla, en cambio los grupos pueden ser en dos.Crear base de datos");

        builder5.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog5 = builder5.create();
        dialog5.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principla, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View v) {

        switch (v.getId()) {


            case R.id.imageButtonGr1: // Cambia de nombre de boton grupo1
                AlertDialog.Builder builder = new AlertDialog.Builder(this);//creo un alert dialog con un builder
                final EditText entrada = new EditText(this);
                builder.setTitle(R.string.CambiarNomTitulo);
                builder.setMessage(R.string.msjCamNom);
                builder.setView(entrada);
                builder.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnGrupo1);
                        textobtn = entrada.getText().toString().trim();
                        btn.setText(textobtn);


                    }

                });
                builder.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog = builder.create();
                dialog.show();

                break;

            case R.id.imageButtonGr2:// Cambia de nombre de boton grupo2
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                final EditText entrada2 = new EditText(this);
                builder2.setTitle(R.string.CambiarNomTitulo);
                builder2.setMessage(R.string.msjCamNom);
                builder2.setView(entrada2);
                builder2.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnGrupo2);
                        textobtn = entrada2.getText().toString().trim();
                        btn.setText(textobtn);

                    }

                });
                builder2.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog2 = builder2.create();
                dialog2.show();

                break;
            case R.id.imageButtonGr3:// Cambia de nombre de boton grupo3
                AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                final EditText entrada3 = new EditText(this);
                builder3.setTitle(R.string.CambiarNomTitulo);
                builder3.setMessage(R.string.msjCamNom);
                builder3.setView(entrada3);
                builder3.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnGrupo3);
                        textobtn = entrada3.getText().toString().trim();
                        btn.setText(textobtn);
                    }

                });
                builder3.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog3 = builder3.create();
                dialog3.show();

                break;
            case R.id.imageButtonGr4:// Cambia de nombre de boton grupo4
                AlertDialog.Builder builder4 = new AlertDialog.Builder(this);
                final EditText entrada4 = new EditText(this);
                builder4.setTitle(R.string.CambiarNomTitulo);
                builder4.setMessage(R.string.msjCamNom);
                builder4.setView(entrada4);
                builder4.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button btn = (Button) findViewById(R.id.btnGrupo4);
                        textobtn = entrada4.getText().toString().trim();
                        btn.setText(textobtn);
                    }

                });

                builder4.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog4 = builder4.create();
                dialog4.show();


                break;
            case R.id.btnBorrarGr1:
                Button btn = (Button) findViewById(R.id.btnGrupo1);
                btn.setText(R.string.btn1);

                break;
            case R.id.btnBorrarGr2:
                Button btn2 = (Button) findViewById(R.id.btnGrupo2);
                btn2.setText(R.string.btn1);
                break;
            case R.id.btnBorrarGr3:
                Button btn3 = (Button) findViewById(R.id.btnGrupo3);
                btn3.setText(R.string.btn1);
                break;
            case R.id.btnBorrarGr4:
                Button btn4 = (Button) findViewById(R.id.btnGrupo4);
                btn4.setText(R.string.btn1);
                break;
        }
    }

    public void actgr1(View v) {

        Intent intent = new Intent(PrinciplaActivity.this, Grupo1.class);
        startActivity(intent);
        finish();
    }

}

   /* public void alta(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();

        ContentValues registro = new ContentValues();  //es una clase para guardar datos

        registro.put("nombtn", textobtn);

        bd.insert("tbnombtn", null, registro);
        bd.close();

        Toast.makeText(this, "Se cargaron los datos de la persona",
                Toast.LENGTH_SHORT).show();*/

/*public void regnom1(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText entrada = new EditText(this) ;
        builder.setTitle(R.string.CambiarNomTitulo);
        builder.setMessage(R.string.msjCamNom);
        builder.setView(entrada);
        builder.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Button btn = (Button) findViewById(R.id.btnGrupo1);
                String textobtn = entrada.getText().toString().trim();
                btn.setText(textobtn);
            }

        });
        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();
    }
    public void regnom2(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText entrada = new EditText(this) ;
        builder.setTitle(R.string.CambiarNomTitulo);
        builder.setMessage(R.string.msjCamNom);
        builder.setView(entrada);
        builder.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Button btn = (Button) findViewById(R.id.btnGrupo2);
                String textobtn = entrada.getText().toString().trim();
                btn.setText(textobtn);
            }

        });
        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();
    }
    public void regnom3(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText entrada = new EditText(this) ;
        builder.setTitle(R.string.CambiarNomTitulo);
        builder.setMessage(R.string.msjCamNom);
        builder.setView(entrada);
        builder.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Button btn = (Button) findViewById(R.id.btnGrupo3);
                String textobtn = entrada.getText().toString().trim();
                btn.setText(textobtn);
            }

        });
        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();
    }
    public void regnom4(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText entrada = new EditText(this) ;
        builder.setTitle(R.string.CambiarNomTitulo);
        builder.setMessage(R.string.msjCamNom);
        builder.setView(entrada);
        builder.setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Button btn = (Button) findViewById(R.id.btnGrupo4);
                String textobtn = entrada.getText().toString().trim();
                btn.setText(textobtn);
            }

        });

        builder.setNegativeButton(android.R.string.cancel, null);
        Dialog dialog = builder.create();
        dialog.show();
    }

    public void borrargrupo1(View v){
        Button btn = (Button) findViewById(R.id.btnGrupo1);
        btn.setText(R.string.btn1);

    }
    public void borrargrupo2(View v){
        Button btn = (Button) findViewById(R.id.btnGrupo2);
        btn.setText(R.string.btn1);

    }
    public void borrargrupo3(View v){
        Button btn = (Button) findViewById(R.id.btnGrupo3);
        btn.setText(R.string.btn1);

    }
    public void borrargrupo4(View v){
        Button btn = (Button) findViewById(R.id.btnGrupo4);
        btn.setText(R.string.btn1);

    }*/

