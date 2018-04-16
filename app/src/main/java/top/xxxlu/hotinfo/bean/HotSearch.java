package top.xxxlu.hotinfo.bean;

import java.util.List;

/**
 * Created by liu on 2018/3/27.
 */

public class HotSearch {
    /**
     * data : {"top":{"word":"#北京一秒入夏#","is_ad":0},"list":[{"note":"王智产女","word":"王智产女","mid":"4222122488759031","is_new":1,"num":"684836","ai":"1","topic_flag":"0","burst_time":"2018-03-27 10:28","total_number":"A","friend":"4","realpos":0,"flag":1,"is_hot":1},{"note":"白银连环杀人案将宣判","word":"白银连环杀人案将宣判","mid":"4222128994375168","is_new":1,"num":"432335","ai":"1","topic_flag":"0","burst_time":"2018-03-27 10:48","total_number":"A","friend":"16","realpos":1,"flag":1},{"note":"蒋勤勤晒孕肚照","word":"蒋勤勤晒孕肚照","mid":"4222088548064719","is_hot":1,"num":"382435","ai":"8","topic_flag":"0","burst_time":"2018-03-27 08:03","total_number":"A","friend":"4","realpos":2,"flag":2},{"note":"支付宝遭腾讯系封杀","word":"支付宝遭腾讯系封杀","mid":"4222107439348199","is_new":1,"num":"356050","ai":"5","topic_flag":"0","burst_time":"2018-03-27 10:21","total_number":"B","friend":"512","realpos":3,"flag":1},{"note":"携程机票退票费九千多","word":"携程机票退票费九千多","mid":"4222112871123737","is_new":1,"num":"326770","ai":"8","topic_flag":"0","burst_time":"2018-03-27 10:51","total_number":"B","friend":"16","realpos":4,"flag":1},{"note":"成龙批年轻演员","word":"成龙批年轻演员","mid":"4221928056561746","is_hot":1,"num":"282577","ai":"1","topic_flag":"0","burst_time":"2018-03-27 08:11","total_number":"B","friend":"4","realpos":5,"flag":2},{"note":"C罗 强吻","word":"C罗 强吻","mid":"4222116104676062","is_new":1,"num":"226862","ai":"8","topic_flag":"0","burst_time":"2018-03-27 11:11","total_number":"B","friend":"64","realpos":6,"flag":1},{"note":"林志玲起诉获赔8万","word":"林志玲起诉获赔8万","mid":"4222094835203719","num":"211202","ai":"1","topic_flag":"0","burst_time":"2018-03-27 09:21","total_number":"A","friend":"4","realpos":7,"flag":0},{"note":"台湾高雄凌晨枪战","word":"台湾高雄凌晨枪战","mid":"4222097536066182","num":"198499","ai":"5","topic_flag":"0","burst_time":"2018-03-27 09:31","total_number":"B","friend":"16","realpos":8,"flag":0},{"note":"李宇春受伤 声明","word":"李宇春受伤 声明","mid":"4222124614669964","is_new":1,"num":"124155","ai":"8","topic_flag":"0","burst_time":"2018-03-27 11:01","total_number":"A","friend":"4","realpos":9,"flag":1}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * top : {"word":"#北京一秒入夏#","is_ad":0}
         * list : [{"note":"王智产女","word":"王智产女","mid":"4222122488759031","is_new":1,"num":"684836","ai":"1","topic_flag":"0","burst_time":"2018-03-27 10:28","total_number":"A","friend":"4","realpos":0,"flag":1},{"note":"白银连环杀人案将宣判","word":"白银连环杀人案将宣判","mid":"4222128994375168","is_new":1,"num":"432335","ai":"1","topic_flag":"0","burst_time":"2018-03-27 10:48","total_number":"A","friend":"16","realpos":1,"flag":1},{"note":"蒋勤勤晒孕肚照","word":"蒋勤勤晒孕肚照","mid":"4222088548064719","is_hot":1,"num":"382435","ai":"8","topic_flag":"0","burst_time":"2018-03-27 08:03","total_number":"A","friend":"4","realpos":2,"flag":2},{"note":"支付宝遭腾讯系封杀","word":"支付宝遭腾讯系封杀","mid":"4222107439348199","is_new":1,"num":"356050","ai":"5","topic_flag":"0","burst_time":"2018-03-27 10:21","total_number":"B","friend":"512","realpos":3,"flag":1},{"note":"携程机票退票费九千多","word":"携程机票退票费九千多","mid":"4222112871123737","is_new":1,"num":"326770","ai":"8","topic_flag":"0","burst_time":"2018-03-27 10:51","total_number":"B","friend":"16","realpos":4,"flag":1},{"note":"成龙批年轻演员","word":"成龙批年轻演员","mid":"4221928056561746","is_hot":1,"num":"282577","ai":"1","topic_flag":"0","burst_time":"2018-03-27 08:11","total_number":"B","friend":"4","realpos":5,"flag":2},{"note":"C罗 强吻","word":"C罗 强吻","mid":"4222116104676062","is_new":1,"num":"226862","ai":"8","topic_flag":"0","burst_time":"2018-03-27 11:11","total_number":"B","friend":"64","realpos":6,"flag":1},{"note":"林志玲起诉获赔8万","word":"林志玲起诉获赔8万","mid":"4222094835203719","num":"211202","ai":"1","topic_flag":"0","burst_time":"2018-03-27 09:21","total_number":"A","friend":"4","realpos":7,"flag":0},{"note":"台湾高雄凌晨枪战","word":"台湾高雄凌晨枪战","mid":"4222097536066182","num":"198499","ai":"5","topic_flag":"0","burst_time":"2018-03-27 09:31","total_number":"B","friend":"16","realpos":8,"flag":0},{"note":"李宇春受伤 声明","word":"李宇春受伤 声明","mid":"4222124614669964","is_new":1,"num":"124155","ai":"8","topic_flag":"0","burst_time":"2018-03-27 11:01","total_number":"A","friend":"4","realpos":9,"flag":1}]
         */

        private TopBean top;
        private List<ListBean> list;

        public TopBean getTop() {
            return top;
        }

        public void setTop(TopBean top) {
            this.top = top;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class TopBean {
            /**
             * word : #北京一秒入夏#
             * is_ad : 0
             */

            private String word;
            private int is_ad;

            public String getWord() {
                return word;
            }

            public void setWord(String word) {
                this.word = word;
            }

            public int getIs_ad() {
                return is_ad;
            }

            public void setIs_ad(int is_ad) {
                this.is_ad = is_ad;
            }
        }

        public static class ListBean {
            /**
             * note : 王智产女
             * word : 王智产女
             * mid : 4222122488759031
             * is_new : 1
             * num : 684836
             * ai : 1
             * topic_flag : 0
             * burst_time : 2018-03-27 10:28
             * total_number : A
             * friend : 4
             * realpos : 0
             * flag : 1
             * is_hot : 1
             */

            private String note;
            private String word;
            private String mid;
            private int is_new;
            private String num;
            private String ai;
            private String topic_flag;
            private String burst_time;
            private String total_number;
            private String friend;
            private int realpos;
            private int flag;
            private int is_hot;

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public String getWord() {
                return word;
            }

            public void setWord(String word) {
                this.word = word;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getAi() {
                return ai;
            }

            public void setAi(String ai) {
                this.ai = ai;
            }

            public String getTopic_flag() {
                return topic_flag;
            }

            public void setTopic_flag(String topic_flag) {
                this.topic_flag = topic_flag;
            }

            public String getBurst_time() {
                return burst_time;
            }

            public void setBurst_time(String burst_time) {
                this.burst_time = burst_time;
            }

            public String getTotal_number() {
                return total_number;
            }

            public void setTotal_number(String total_number) {
                this.total_number = total_number;
            }

            public String getFriend() {
                return friend;
            }

            public void setFriend(String friend) {
                this.friend = friend;
            }

            public int getRealpos() {
                return realpos;
            }

            public void setRealpos(int realpos) {
                this.realpos = realpos;
            }

            public int getFlag() {
                return flag;
            }

            public void setFlag(int flag) {
                this.flag = flag;
            }

            public int getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(int is_hot) {
                this.is_hot = is_hot;
            }
        }
    }
}
