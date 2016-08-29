package cn.maitian.componts.auth.bean;

/**
 * Created by geng on 2016/8/29.
 */
public class Weixin {
    //    {
//        "unionid": "oNkQAjx7on9_3V-OSHFz6WTkimGM",
//            "province": "北京",
//            "gender": "1",
//            "screen_name": "王庚",
//            "openid": "odTaijrqHBKcYwv6t7HOFMgr7F4U",
//            "language": "zh_CN",
//            "profile_image_url": "http://wx.qlogo.cn/mmopen/ajNVdqHZLLA1NZxb8CziaMaxTccrsqxedvaDhSNo5rLTOfco71Ykma62x2JHxGDAAfVG9KOncUnTv2DB1ebiaGyg/0",
//            "country": "中国",
//            "city": "朝阳"
//    }
    private String unionid;
    private String gender;
    private String screen_name;
    private String openid;
    private String profile_image_url;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
}
