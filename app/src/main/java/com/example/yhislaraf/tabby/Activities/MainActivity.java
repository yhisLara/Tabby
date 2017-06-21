package com.example.yhislaraf.tabby.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.example.yhislaraf.tabby.Adapters.PagerAdapter;
import com.example.yhislaraf.tabby.Models.Country;
import com.example.yhislaraf.tabby.Models.Utils;
import com.example.yhislaraf.tabby.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        TabLayout tabs = (TabLayout) findViewById(R.id.tabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabs.addTab(tabs.newTab().setText("Form"));
        tabs.addTab(tabs.newTab().setText("List"));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabs.getTabCount());

        Spinner prueba = (Spinner) findViewById(R.id.spinnerCountry);
        ArrayAdapter spinerAdapter = new ArrayAdapter(this, android.R.layout.activity_list_item, countries);
        spinerAdapter.setDropDownViewResource(android.R.layout.activity_list_item);
        prueba.setAdapter(spinerAdapter);

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
