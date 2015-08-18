package com.afbb.balakrishna.twostyles;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setTheme_one(View view){
                setMyTheme(R.style.AppTheme1);
    }

    public void setTheme_two(View view){
        setMyTheme(R.style.AppTheme2);
    }

    public void setMyTheme(int themeId) {
        Toast.makeText(getApplicationContext(), "clicked " + themeId, Toast.LENGTH_SHORT).show();
        setTheme(themeId);
        setContentView(R.layout.activity_main);
    }


}
