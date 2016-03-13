package com.example.testspinner;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
private TextView text;
private Spinner spinner;
private List<String> list;
private ArrayAdapter<String> adapter;	
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView) findViewById(R.id.tv_text);
		spinner = (Spinner) findViewById(R.id.spinner);
		list = new ArrayList<String>();
		list.add("北京");
		list.add("广州");
		list.add("厦门");
		list.add("武汉");
		list.add("重庆");
		list.add("上海");
		//适配器
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
