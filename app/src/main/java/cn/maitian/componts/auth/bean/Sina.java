package cn.maitian.componts.auth.bean;

/**
 * Created by geng on 2016/8/29.
 */
public class Sina {

    //    {
//        "location": "北京 朝阳区",
//            "remark": "",
//            "block_app": "0",
//            "verified_reason": "",
//            "statuses_count": "1394",
//            "city": "5",
//            "favourites_count": "15",
//            "idstr": "2747487034",
//            "description": "",
//            "verified": "false",
//            "province": "11",
//            "gender": "m",
//            "weihao": "",
//            "mbrank": "0",
//            "url": "",
//            "cover_image_phone": "http: //ww1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg",
//            "friends_count": "102",
//            "profile_image_url": "http: //tva4.sinaimg.cn/crop.0.0.180.180.50/a3c3533ajw1e8qgp5bmzyj2050050aa8.jpg",
//            "follow_me": "false",
//            "ptype": "0",
//            "verified_source_url": "",
//            "verified_type": "-1",
//            "verified_source": "",
//            "lang": "zh-cn",
//            "credit_score": "80",
//            "id": "2747487034",
//            "verified_trade": "",
//            "following": "false",
//            "name": "耕一土",
//            "domain": "",
//            "created_at": "ThuMar2911: 05: 35+08002012",
//            "user_ability": "0",
//            "followers_count": "166",
//            "online_status": "0",
//            "profile_url": "u/2747487034",
//            "bi_followers_count": "24",
//            "geo_enabled": "true",
//            "star": "0",
//            "urank": "18",
//            "allow_all_comment": "true",
//            "avatar_hd": "http: //tva4.sinaimg.cn/crop.0.0.180.180.1024/a3c3533ajw1e8qgp5bmzyj2050050aa8.jpg",
//            "allow_all_act_msg": "false",
//            "avatar_large": "http: //tva4.sinaimg.cn/crop.0.0.180.180.180/a3c3533ajw1e8qgp5bmzyj2050050aa8.jpg",
//            "pagefriends_count": "0",
//            "verified_reason_url": "",
//            "screen_name": "耕一土",
//            "mbtype": "0",
//            "block_word": "0"
//    }
    private String gender;
    private String profile_image_url;
    private String id;
    private String screen_name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

}
