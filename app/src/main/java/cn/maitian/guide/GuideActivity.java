package cn.maitian.guide;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import cn.maitian.R;
import cn.maitian.activity.MaitianActivity;
import me.relex.circleindicator.CircleIndicator;


public class GuideActivity extends MaitianActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        viewpager.setAdapter(new ImagePagerAdapter());
        indicator.setViewPager(viewpager);
    }
}
