/* 
 * Copyright (C) 2012 WIMM Labs Incorporated
 */

package com.test.starterapp;

import android.os.Bundle;
import com.wimm.framework.app.LauncherActivity;

/*
 * This is a demo hello world app on the WIMM which uses
 * a imageView as the peekview.                                 
 */
public class StarterAppActivity extends LauncherActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}