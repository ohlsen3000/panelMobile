package com.gratz.thepanel;

public class ButtonToSoundMapper {
	
	public static int mapButtonToSound(int buttonId) {
		switch (buttonId) {
			case R.id.button_butch: return R.raw.butch; 
			case R.id.button_was: return R.raw.was; 
			case R.id.button_was_jetzt: return R.raw.wasjetzt; 
			case R.id.button_was_ansteht: return R.raw.ansteht; 
			case R.id.button_bieker: return R.raw.bieker; 
			case R.id.button_annee: return R.raw.aneene; 
			case R.id.button_delate: return R.raw.delate;
			case R.id.button_wiegeil: return R.raw.geil;
			case R.id.button_fail: return R.raw.gescheitert_satan;
			case R.id.button_jeopardy: return R.raw.jeopardy;
			case R.id.button_kahn: return R.raw.khan;
			case R.id.button_sonicht: return R.raw.sonicht;
			case R.id.button_das_ist: return R.raw.dasist;
			case R.id.button_alarm: return R.raw.alarm;
			
			default: return R.raw.sonicht;
		}
	}

}
