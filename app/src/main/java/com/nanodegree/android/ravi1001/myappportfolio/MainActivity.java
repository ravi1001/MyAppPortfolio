/*
 * Copyright (C) 2015 Ravi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nanodegree.android.ravi1001.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the on click event handler for all buttons.
        ((Button)findViewById(R.id.btn_popular_movies)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_alexandria)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_football_scores)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_build_it_bigger)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_xyz_reader)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_news_bytes)).setOnClickListener(this);

    }

    /**
     * Handles button click events and launches the app clicked on.
     */
    @Override
    public void onClick(View v) {
        // Get the view Id.
        int viewId = v.getId();

        // Determine the button clicked and display appropriate toast.
        switch (viewId) {
            case R.id.btn_popular_movies: {
                Toast.makeText(this, R.string.toast_spotify_streamer_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_alexandria: {
                Toast.makeText(this, R.string.toast_scores_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_football_scores: {
                Toast.makeText(this, R.string.toast_library_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_build_it_bigger: {
                Toast.makeText(this, R.string.toast_build_it_bigger_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_xyz_reader: {
                Toast.makeText(this, R.string.toast_xyz_reader_app, Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn_news_bytes: {
                Toast.makeText(this, R.string.toast_capstone_app, Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
