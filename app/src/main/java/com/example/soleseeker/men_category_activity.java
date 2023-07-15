package com.example.soleseeker;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class men_category_activity extends AppCompatActivity {

	private ImageButton basketball;
	private ImageButton running;
	private ImageButton casual;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.men_category);

		basketball = findViewById(R.id.Basketball);
		running = findViewById(R.id.Running);
		casual = findViewById(R.id.Casual);

		basketball.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(men_category_activity.this, main_menu_activity.class);
				startActivity(intent);
			}
		});

		running.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(men_category_activity.this, main_menu_activity.class);
				startActivity(intent);
			}
		});

		casual.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(men_category_activity.this, main_menu_activity.class);
				startActivity(intent);
			}
		});

		TabLayout tabLayout = findViewById(R.id.tabLayout);
		ViewPager viewPager = findViewById(R.id.viewPager);

	/*	List<Fragment> fragments = new ArrayList<>();
		fragments.add(new MenFragment());
		fragments.add(new WomenFragment());
		fragments.add(new BrandFragment());

		PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), fragments);
		viewPager.setAdapter(pagerAdapter);
		tabLayout.setupWithViewPager(viewPager);*/
	}

	public class PagerAdapter extends FragmentPagerAdapter {
		private List<Fragment> fragments;

		public PagerAdapter(FragmentManager fm, List<Fragment> fragments) {
			super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
			this.fragments = fragments;
		}

		@NonNull
		@Override
		public Fragment getItem(int position) {
			return fragments.get(position);
		}

		@Override
		public int getCount() {
			return fragments.size();
		}
	}
}