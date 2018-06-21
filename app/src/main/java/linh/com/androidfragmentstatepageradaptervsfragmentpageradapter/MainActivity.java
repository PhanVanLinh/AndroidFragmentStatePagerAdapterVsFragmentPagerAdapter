package linh.com.androidfragmentstatepageradaptervsfragmentpageradapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager mPager;

    PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = findViewById(R.id.viewPager);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());

        mPagerAdapter.addFragment(Fragment1.newInstance());
        mPagerAdapter.addFragment(Fragment2.newInstance());
        mPagerAdapter.addFragment(Fragment3.newInstance());

        mPager.setOffscreenPageLimit(1);
        mPager.setAdapter(mPagerAdapter);
    }

    private class PagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }

        public Fragment getCurrentFragment(int currentPos) {
            return mFragmentList.get(currentPos);
        }
    }
}
