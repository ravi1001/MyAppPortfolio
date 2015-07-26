package com.nanodegree.android.ravi1001.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the on click event handler for all buttons.
        ((Button)findViewById(R.id.btn_spotify_streamer_app)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_scores_app)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_library_app)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_build_it_bigger_app)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_xyz_reader_app)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_capstone_app)).setOnClickListener(this);

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

    /**
     * Handles button click events. Presently, displays a toast corresponding to the button
     * clicked. Later, once the project apps are ready, it will launch these apps from here.
     */
    @Override
    public void onClick(View v) {
        // Get the view Id.
        int viewId = v.getId();

        // Determine the button clicked and display appropriate toast.
        switch (viewId) {
            case R.id.btn_spotify_streamer_app: {
                Toast.makeText(this, R.string.toast_spotify_streamer_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_scores_app: {
                Toast.makeText(this, R.string.toast_scores_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_library_app: {
                Toast.makeText(this, R.string.toast_library_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_build_it_bigger_app: {
                Toast.makeText(this, R.string.toast_build_it_bigger_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_xyz_reader_app: {
                Toast.makeText(this, R.string.toast_xyz_reader_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_capstone_app: {
                Toast.makeText(this, R.string.toast_capstone_app, Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
