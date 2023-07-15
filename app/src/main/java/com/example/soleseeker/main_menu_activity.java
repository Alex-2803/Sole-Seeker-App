package com.example.soleseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_menu_activity extends Activity {

	private Button shoeBrandButton;
	private Button scanBrandButton;
	private Button shoeSizingButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);

		shoeBrandButton = findViewById(R.id.shoeBrandButton);
		scanBrandButton = findViewById(R.id.scanBrandButton);
		shoeSizingButton = findViewById(R.id.shoeSizingButton);

		shoeBrandButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(main_menu_activity.this, men_category_activity.class);
				startActivity(intent);
			}
		});

		// Add click listeners for other buttons if needed
	}
}
