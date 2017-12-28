package com.grow.plantillatabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.grow.plantillatabs.adapter.SimpleFragmentPageAdapter;
import com.grow.plantillatabs.fragments.FistFragment;
import com.grow.plantillatabs.fragments.SecondFragment;
import com.grow.plantillatabs.fragments.ThirdFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sliding_tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupTabs();
    }

    private void setupTabs() {

        // Find the view pager that will allow the user to swipe between fragments
        SimpleFragmentPageAdapter adapter = new SimpleFragmentPageAdapter(getSupportFragmentManager());

        //Adding Fragments and Tab Names
        adapter.addFragment(new FistFragment(), getString(R.string.firstTabName));
        adapter.addFragment(new SecondFragment(), getString(R.string.secondTabName));
        adapter.addFragment(new ThirdFragment(), getString(R.string.thirdTabName));

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        tabLayout.setupWithViewPager(viewPager);

    }

}
