package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView textview = (TextView) findViewById(R.id.text);
		textview.setText("\\xf0\\xa2\\x83\\x87" + "\uf0a28387");
		
	}
}
