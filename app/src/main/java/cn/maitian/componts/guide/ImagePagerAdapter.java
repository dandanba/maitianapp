package cn.maitian.componts.guide;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.novoda.viewpageradapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.maitian.R;

public class ImagePagerAdapter extends ViewPagerAdapter<FrameLayout> {
    private final List<Integer> mResIds = new ArrayList<>();
    @BindView(R.id.image)
    ImageView mImageView;

    public ImagePagerAdapter() {
        initResIds();
    }

    @Override
    protected FrameLayout createView(ViewGroup container, int position) {
        // inflate the view, do not attach to parent (the `false` param at the end of the `inflate()`)
        FrameLayout view = (FrameLayout) LayoutInflater.from(container.getContext()).inflate(R.layout.pager_image, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void bindView(FrameLayout view, int position) {
        mImageView.setImageResource(mResIds.get(position));
    }

    @Override
    public int getCount() {
        return mResIds.size();
    }

    private void initResIds() {
        mResIds.add(R.drawable.welcome_page1);
        mResIds.add(R.drawable.welcome_page2);
        mResIds.add(R.drawable.welcome_page3);
        mResIds.add(R.drawable.welcome_page4);
    }
}