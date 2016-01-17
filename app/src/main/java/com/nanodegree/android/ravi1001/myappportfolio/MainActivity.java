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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Reference to all the buttons to launch the various apps.
    private Button mModernArtBtn;
    private Button mPopularMoviesBtn;
    private Button mAlexandriaBtn;
    private Button mFootballScoresBtn;
    private Button mBuildItBiggerBtn;
    private Button mXYZReaderBtn;
    private Button mGoUbiquitousBtn;
    private Button mNewsBytesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the references to each button.
        mModernArtBtn = (Button) findViewById(R.id.btn_modern_art);
        mPopularMoviesBtn = (Button) findViewById(R.id.btn_popular_movies);
        mAlexandriaBtn = (Button) findViewById(R.id.btn_alexandria);
        mFootballScoresBtn = (Button) findViewById(R.id.btn_football_scores);
        mBuildItBiggerBtn = (Button) findViewById(R.id.btn_build_it_bigger);
        mXYZReaderBtn = (Button) findViewById(R.id.btn_xyz_reader);
        mGoUbiquitousBtn = (Button) findViewById(R.id.btn_go_ubiquitous);
        mNewsBytesBtn = (Button) findViewById(R.id.btn_news_bytes);

        // Set the on click event handler for each button.
        mModernArtBtn.setOnClickListener(this);
        mPopularMoviesBtn.setOnClickListener(this);
        mAlexandriaBtn.setOnClickListener(this);
        mFootballScoresBtn.setOnClickListener(this);
        mBuildItBiggerBtn.setOnClickListener(this);
        mXYZReaderBtn.setOnClickListener(this);
        mGoUbiquitousBtn.setOnClickListener(this);
        mNewsBytesBtn.setOnClickListener(this);
    }

    /**
     * Launches the app corresponding to the button clicked on.
     */
    @Override
    public void onClick(View v) {
        // Get the view Id.
        int viewId = v.getId();

        // Determine the button clicked and launch the corresponding app.
        switch (viewId) {
            case R.id.btn_modern_art: {
                // Launch the modern art ui app.
                launchApp(getString(R.string.package_modern_art));
                break;
            }
            case R.id.btn_popular_movies: {
                // Launch the popular movies app.
                launchApp(getString(R.string.package_popular_movies));
                break;
            }
            case R.id.btn_alexandria: {
                // Launch the alexandria app.
                launchApp(getString(R.string.package_alexandria));
                break;
            }
            case R.id.btn_football_scores: {
                // Launch the football scores app.
                launchApp(getString(R.string.package_football_scores));
                break;
            }
            case R.id.btn_build_it_bigger: {
                // Launch the build it bigger app.
                launchApp(getString(R.string.package_build_it_bigger));
                break;
            }
            case R.id.btn_xyz_reader: {
                // Launch the xyz reader app.
                launchApp(getString(R.string.package_xyz_reader));
                break;
            }
            case R.id.btn_go_ubiquitous: {
                break;
            }
            case R.id.btn_news_bytes: {
                // Launch the news bytes app.
                launchApp(getString(R.string.package_news_bytes));
                break;
            }
        }
    }

    /**
     * Launches the app whose fully qualified package name is specified.
     */
    private void launchApp(String packageName) {
        // Get the launch intent from the package manager for the specified package.
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);

        // Check if the app is installed on the device.
        if(launchIntent != null) {
            // Launch the app.
            launchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(launchIntent);
        } else {
            // Show error message to user.
            Toast.makeText(this, getString(R.string.msg_err_app_not_found), Toast.LENGTH_LONG).show();
        }
    }
}
