package com.example.me.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;


public class MainActivity extends Activity {
    private HashMap<Integer, Button> _buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _buttons = new HashMap<Integer, Button>();
        _buttons.put(R.id.btnSpotify, (Button) findViewById(R.id.btnSpotify));
        _buttons.put(R.id.btnScores, (Button) findViewById(R.id.btnScores));
        _buttons.put(R.id.btnLibraryApp, (Button) findViewById(R.id.btnLibraryApp));
        _buttons.put(R.id.btnBuildItBigger, (Button) findViewById(R.id.btnBuildItBigger));
        _buttons.put(R.id.btnBaconReader, (Button) findViewById(R.id.btnBaconReader));
        _buttons.put(R.id.btnMyOwnApp, (Button) findViewById(R.id.btnMyOwnApp));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void showToast(View vw) {
        int btnId = vw.getId();
        String strButtonName = (_buttons.containsKey(btnId)) ? _buttons.get(btnId).getText().toString() : "";
        Context context = this.getApplicationContext();
        CharSequence text = String.format("This button will launch %s", strButtonName);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
