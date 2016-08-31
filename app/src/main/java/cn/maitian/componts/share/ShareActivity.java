package cn.maitian.componts.share;

import android.os.Bundle;
import android.view.View;

import com.umeng.socialize.bean.SHARE_MEDIA;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.maitian.R;
import cn.maitian.activity.SocialOpenActionActivity;
import cn.maitian.logger.LoggerUtil;
import cn.maitian.social_sdk.SocialSdk;

/**
 * Created by geng on 2016/8/30.
 */
public class ShareActivity extends SocialOpenActionActivity {

    private final SocialSdk.SocialShareSdkHandler mShareHandler = new SocialSdk.SocialShareSdkHandler() {
        @Override
        public void onResult(SHARE_MEDIA share_media) {
            super.onResult(share_media);
            LoggerUtil.i("onResult:%1$s", share_media.name());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.share_button, R.id.crash_button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.share_button:
                String text = "据每日邮报报道，澳洲女子Shanti Korporaal想过上一种富有科幻电影般的生活，她将双手植入了微型芯片，现在最常用到的就是无钥匙开门，免密开机。";
                String title = "女子双手植入芯片变“超人”：挥手就能开门";
                String targetUrl = "http://news.ifeng.com/a/20160829/49858064_0.shtml";
                String imageUrl = "http://p0.ifengimg.com/cmpp/2016/08/29/17/561861ad-adaa-4a7e-8039-c7f195d2b059_size23_w600_h361.jpeg-contentimage";
                openShareAction(text, title, targetUrl, imageUrl, mShareHandler);
                break;
            case R.id.crash_button:
                forceCrash(view);
                break;
            default:
                break;
        }
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }

}
