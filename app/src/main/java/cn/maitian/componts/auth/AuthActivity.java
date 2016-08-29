package cn.maitian.componts.auth;

import android.os.Bundle;
import android.view.View;

import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.maitian.R;
import cn.maitian.activity.SocialPlatformInfoActivity;
import cn.maitian.logger.LoggerUtil;
import cn.maitian.social_sdk.SocialSdk;

/**
 * Created by geng on 2016/8/29.
 */
public class AuthActivity extends SocialPlatformInfoActivity {
    private final SocialSdk.SocialAuthSdkHandler mGetPlatformInfoHandler = new SocialSdk.SocialAuthSdkHandler() {
        public void onComplete(SHARE_MEDIA share_media, int action, Map<String, String> map) {
            if (share_media == SHARE_MEDIA.QQ) {
                //  {is_yellow_year_vip=0, vip=0, level=0, province=北京, yellow_vip_level=0, is_yellow_vip=0, gender=男, openid=E27BE65237E4EBAA28F4843B91B00632, screen_name=dandanBa, msg=, profile_image_url=http://q.qlogo.cn/qqapp/1103682262/E27BE65237E4EBAA28F4843B91B00632/100, city=朝阳}
                LoggerUtil.i("map:%1$s", map.toString());
            } else if (share_media == SHARE_MEDIA.WEIXIN) {
                // map:{unionid=oNkQAjx7on9_3V-OSHFz6WTkimGM, province=北京, gender=1, screen_name=王庚, openid=odTaijrqHBKcYwv6t7HOFMgr7F4U, language=zh_CN, profile_image_url=http://wx.qlogo.cn/mmopen/ajNVdqHZLLA1NZxb8CziaMaxTccrsqxedvaDhSNo5rLTOfco71Ykma62x2JHxGDAAfVG9KOncUnTv2DB1ebiaGyg/0, country=中国, city=朝阳}
                LoggerUtil.i("map:%1$s", map.toString());
            } else if (share_media == SHARE_MEDIA.SINA) {
                // map:{location=北京 朝阳区, remark=, block_app=0, verified_reason=, statuses_count=1394, city=5, favourites_count=15, idstr=2747487034, description=, verified=false, province=11, gender=m, weihao=, status={"pic_urls":[],"visible":{"type":0,"list_id":0},"textLength":146,"attitudes_count":0,"darwin_tags":[],"isLongText":false,"in_reply_to_screen_name":"","mlevel":0,"source_type":1,"truncated":false,"userType":0,"id":3994292693911172,"idstr":"3994292693911172","in_reply_to_status_id":"","reposts_count":0,"created_at":"Wed Jul 06 17:24:11 +0800 2016","biz_ids":[100404],"positive_recom_flag":0,"gif_ids":"","hasActionTypeCard":0,"comments_count":0,"text":"我刚更新了#新浪微盘Android客户端 V3.4.5#，这次微盘君增加了VIP会员，更多特权等你来发现！快来和我一起体验微盘V3.4.5吧！下载地址：http:\/\/t.cn\/R512rBG","text_tag_tips":[],"geo":null,"source_allowclick":0,"hot_weibo_tags":[],"source":"<a href=\"http:\/\/app.weibo.com\/t\/feed\/2R0oBt\" rel=\"nofollow\">微盘<\/a>","favorited":false,"biz_feature":0,"page_type":32,"in_reply_to_user_id":"","mid":"3994292693911172","is_show_bulletin":0}, class=1, mbrank=0, url=, cover_image_phone=http://ww1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg, friends_count=102, profile_image_url=http://tva4.sinaimg.cn/crop.0.0.180.180.50/a3c3533ajw1e8qgp5bmzyj2050050aa8.jpg, follow_me=false, ptype=0, verified_source_url=, verified_type=-1, verified_source=, lang=zh-cn, credit_score=80, id=2747487034, verified_trade=, following=false, name=耕一土, domain=, created_at=Thu Mar 29 11:05:35 +0800 2012, user_ability=0, followers_count=166, online_status=0, profile_url=u/2747487034, bi_followers_count=24, geo_enabled=true, star=0, urank=18, allow_all_comment=true, avatar_hd=http://tva4.sinaimg.cn/crop.0.0.180.180.1024/a3c3533ajw1e8qgp5bmzyj2050050aa8.jpg, allow_all_act_msg=false, avatar_large=http://tva4.sinaimg.cn/crop.0.0.180.180.180/a3c3533ajw1e8qgp5bmzyj2050050aa8.jpg, pagefriends_count=0, verified_reason_url=, screen_name=耕一土, mbtype=0, block_word=0}
                LoggerUtil.i("map:%1$s", map.toString());
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.qq_button, R.id.sina_button, R.id.weixin_button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.qq_button:
                getPlatformInfoQQ(mGetPlatformInfoHandler);
                break;
            case R.id.sina_button:
                getPlatformInfoSina(mGetPlatformInfoHandler);
                break;
            case R.id.weixin_button:
                getPlatformInfoWeiXin(mGetPlatformInfoHandler);
                break;
            default:
                break;
        }
    }
}

