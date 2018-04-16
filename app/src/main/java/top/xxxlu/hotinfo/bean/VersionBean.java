package top.xxxlu.hotinfo.bean;

/**
 * Created by Administrator on 2017/2/22.
 */

public class VersionBean {

    /**
     * msg : ok
     * data : {"versionCode":"1000","versionName":"1.0.0","title":"升级了","msg":"增加了好多新功能哦！","compel":true,"appUrl":"http://php.xxxlu.top/hotinfo/public/static/app/hotinfo-1.0.0-release.apk"}
     */

    private String msg;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * versionCode : 1000
         * versionName : 1.0.0
         * title : 升级了
         * msg : 增加了好多新功能哦！
         * compel : true
         * appUrl : http://php.xxxlu.top/hotinfo/public/static/app/hotinfo-1.0.0-release.apk
         */

        private int versionCode;
        private String versionName;
        private String title;
        private String msg;
        private boolean compel;
        private String appUrl;

        public int getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(int versionCode) {
            this.versionCode = versionCode;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public boolean isCompel() {
            return compel;
        }

        public void setCompel(boolean compel) {
            this.compel = compel;
        }

        public String getAppUrl() {
            return appUrl;
        }

        public void setAppUrl(String appUrl) {
            this.appUrl = appUrl;
        }
    }
}
