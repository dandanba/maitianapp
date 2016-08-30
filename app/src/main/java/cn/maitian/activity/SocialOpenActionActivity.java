package cn.maitian.activity;

import android.content.Intent;
import android.os.Bundle;

import cn.maitian.social_sdk.SocialSdk;


/**
 * 分享Activity
 */
public class SocialOpenActionActivity extends MaitianActivity {
    private static final String TAG = SocialOpenActionActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SocialSdk.initProgressDialog(this, "", "加载中...");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SocialSdk.onActivityResult(this, requestCode, resultCode, data);
    }

    public void openShareAction(String text, String title, String tagetUrl, String imageUrl, SocialSdk.SocialShareSdkHandler handler) {
        SocialSdk.openShareAction(this, text, title, tagetUrl, imageUrl, handler);
    }
}