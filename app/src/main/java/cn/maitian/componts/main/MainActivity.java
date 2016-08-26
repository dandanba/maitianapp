package cn.maitian.componts.main;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.gigamole.navigationtabbar.ntb.NavigationTabBar;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.maitian.R;
import cn.maitian.activity.MaitianActivity;
import cn.maitian.base.BaseFragment;
import me.tabak.fragmentswitcher.FragmentStateArrayPagerAdapter;

public class MainActivity extends MaitianActivity {
    @BindView(R.id.viewpager)
    ViewPager mViewPager;
    FragmentStateArrayPagerAdapter mFragmentAdapter;
    @BindView(R.id.ntb)
    NavigationTabBar mNavigationTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initSwitcherAndNTB(new BlankFragment(), new BlankFragment(), new BlankFragment(), new BlankFragment(), new BlankFragment());
    }

    public void initSwitcherAndNTB(BaseFragment... fragments) {
        mFragmentAdapter = new FragmentStateArrayPagerAdapter(getSupportFragmentManager());
        mFragmentAdapter.addAll(fragments);
        mViewPager.setAdapter(mFragmentAdapter);


        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_first), Color.TRANSPARENT)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_sixth))
                .title("Heart")
                // badgeTitle("NTB")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_second), Color.TRANSPARENT)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                .title("Cup")
                // badgeTitle("with")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_third), Color.TRANSPARENT)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_seventh))
                .title("Diploma")
                // badgeTitle("state")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_fourth), Color.TRANSPARENT)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                .title("Flag")
                // badgeTitle("icon")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_fifth), Color.TRANSPARENT)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                .title("Medal")
                .build()
        );

        mNavigationTabBar.setModels(models);
        mNavigationTabBar.setViewPager(mViewPager, 0);
    }
}
