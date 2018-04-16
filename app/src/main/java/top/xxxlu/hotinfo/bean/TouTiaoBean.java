package top.xxxlu.hotinfo.bean;

import java.util.List;

public class TouTiaoBean {

    /**
     * message : success
     * data : [{"open_url":"/group/6542414318435041805/","group_id":"6542414318435041805","image_url":"//p3.pstatp.com/list/240x240/pgc-image/15232744854463a293241ea","title":"卸任半个月，副国级再出发"},{"open_url":"/group/6542442252302549507/","group_id":"6542442252302549507","image_url":"//p3.pstatp.com/list/240x240/pgc-image/152327248118579f285ef6e","title":"一节打花！广厦力克山东3-3续命 福特森31+13 丁彦雨航13分"},{"open_url":"/group/6542327491430711812/","group_id":"6542327491430711812","image_url":"//p3.pstatp.com/list/240x240/pgc-image/15232540447860e55899348","title":"六旬老太洛阳旅游走失  3天后被今日头条好心用户认出"},{"open_url":"/group/6542312167507493383/","group_id":"6542312167507493383","image_url":"//p3.pstatp.com/list/240x240/78ad000751f5630ece96","title":"财政部领导班子成员具体工作分工已公布"},{"open_url":"/group/6542411590413582855/","group_id":"6542411590413582855","image_url":"//p3.pstatp.com/list/240x240/78ab0008ef68670cb2a6","title":"中方对印军越界巡逻抗议的具体内容是什么？中方回应"},{"open_url":"/group/6542356664547279373/","group_id":"6542356664547279373","image_url":"//p3.pstatp.com/list/240x240/pgc-image/1523260918675ad776caede","title":"火爆！恒大预备队两名球员互殴，互相挥拳拉都拉不开，吃一红一黄"},{"open_url":"/group/6542290594327167502/","group_id":"6542290594327167502","image_url":"//p1.pstatp.com/list/240x240/pgc-image/152324570381988d16a3079","title":"蚂蚁金服井贤栋回应彭蕾卸任：世界级人材梯队是实现愿景最大保证"},{"open_url":"/group/1597272109881351/","group_id":"1597272109881351","image_url":"//p3.pstatp.com/list/240x240/66390004b0cc8a170485","title":"关于对球员王军辉、司徒华龙等人的处罚决定。"},{"open_url":"/group/6542364808707047940/","group_id":"6542364808707047940","image_url":"//p9.pstatp.com/list/240x240/78ac00086c4a2409c16f","title":"又喊制裁又喊谈判，外交部：美国这戏演给谁看？"},{"open_url":"/group/6542341231962227213/","group_id":"6542341231962227213","image_url":"//p3.pstatp.com/list/240x240/pgc-image/15232572278142257f7a5ca","title":"\u201c记录美好生活\u201d的抖音得罪了谁？"}]
     */

    private String message;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * open_url : /group/6542414318435041805/
         * group_id : 6542414318435041805
         * image_url : //p3.pstatp.com/list/240x240/pgc-image/15232744854463a293241ea
         * title : 卸任半个月，副国级再出发
         */

        private String open_url;
        private String group_id;
        private String image_url;
        private String title;

        public String getOpen_url() {
            return open_url;
        }

        public void setOpen_url(String open_url) {
            this.open_url = open_url;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
