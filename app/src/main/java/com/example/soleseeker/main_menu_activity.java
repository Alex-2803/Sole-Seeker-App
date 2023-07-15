package com.example.soleseeker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class main_menu_activity extends Activity {

	private View _bg__main_menu_ek2;
	private View rectangle_326;
	private TextView shoe_fitting;
	private TextView shoe_fitting_ek1;
	private ImageView shoe_brand;
	private View image_104;
	private View rectangle_326_ek1;
	private TextView scan_brand;
	private ImageView scanbrand;
	private View rectangle_326_ek2;
	private TextView shoe_sizing;
	private ImageView shoe_size;
	private ImageView ruler;
	private ImageView steppin;
	private ImageView hello;
	private ImageView screenshot_2023_05_30_19_50_52_421_com_android_1;
	private TextView ole_eeker;
	private Button shoeBrandButton;
	private Button scanBrandButton;
	private Button shoeSizingButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);

		hello = findViewById(R.id.hello);
		steppin = findViewById(R.id.steppin);
		shoeBrandButton = findViewById(R.id.shoeBrandButton);
		scanBrandButton = findViewById(R.id.scanBrandButton);
		shoeSizingButton = findViewById(R.id.shoeSizingButton);

		// Set click listener for the shoeBrandButton
		shoeBrandButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(main_menu_activity.this, men_category_activity.class);
				startActivity(intent);
			}
		});

/*
		// Set click listener for the scanBrandButton
		scanBrandButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle Scan Brand button click
				// ...
			}
		});

		// Set click listener for the shoeSizingButton
		shoeSizingButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle Shoe Sizing button click
				// ...
			}
		});
*/

		/* Uncomment and customize the remaining views and buttons as needed */
	}
}