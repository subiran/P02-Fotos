package com.example.ana.p02_fotos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class p02 extends Activity implements detectaImg {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p02);

        if(savedInstanceState !=null)
            return;

        getFragmentManager().beginTransaction().add(R.id.frag_foto_grande, new FragFotoGran()).commit();
        getFragmentManager().beginTransaction().add(R.id.frag_foto_peque, new FragFotoPeq()).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_p02, menu);
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

    public void detectarBoton(String msg) {
        FragFotoGran f= (FragFotoGran) getFragmentManager().findFragmentById(R.id.frag_foto_grande);

        if(f !=null)
            f.recibirBoton(msg);
    }
}
