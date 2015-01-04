package com.farseen.andriod.farseenplayground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class WebViewActivity extends Activity {
	private OnEditorActionListener textListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		WebView wv = (WebView) this.findViewById(R.id.webView);
		String url = "http://www.google.com";
		Intent intent = getIntent();
		String id = intent.getStringExtra(ItemDetailFragment.ARG_ITEM_ID);
		if (id.equals("1")) {
			url = "file:///android_asset/game.html";
		}
		wv.loadUrl(url);
		/* Set up editText */
		EditText urlText = (EditText) this.findViewById(R.id.urlinput);
		textListener = new OnEditorActionListener(){

			@Override
			public boolean onEditorAction(TextView arg0, int arg1, KeyEvent arg2) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		urlText.setOnEditorActionListener(textListener);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_view, menu);
		return true;
	}

}
