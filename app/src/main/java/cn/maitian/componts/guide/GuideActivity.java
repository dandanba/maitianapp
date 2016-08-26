package cn.maitian.componts.guide;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.maitian.R;
import cn.maitian.activity.MaitianActivity;
import me.relex.circleindicator.CircleIndicator;


public class GuideActivity extends MaitianActivity {
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.indicator)
    CircleIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);

        mViewpager.setAdapter(new ImagePagerAdapter());
        mIndicator.setViewPager(mViewpager);
    }
}
