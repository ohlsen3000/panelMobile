package com.gratz.thepanel;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class PanelController extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel_controller);
        
        ((Button) findViewById(R.id.button_butch)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_was)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_was_jetzt)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_was_ansteht)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_annee)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_bieker)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_wiegeil)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_fail)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_jeopardy)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_kahn)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_sonicht)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_annee)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_delate)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_das_ist)).setOnClickListener(buttonListener);
        ((Button) findViewById(R.id.button_alarm)).setOnClickListener(buttonListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_panel_controller, menu);
        return true;
    }
    
    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View view) {
        	
        	int clipId = ButtonToSoundMapper.mapButtonToSound(view.getId());
        	MediaPlayer mp = MediaPlayer.create(getApplicationContext(), clipId);
        	mp.start();
        }	
    };
    
    
}
