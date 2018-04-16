package top.xxxlu.hotinfo.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.Html;

import top.xxxlu.hotinfo.BaseApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import top.xxxlu.hotinfo.BaseApplication;

/**
 * 字符串操作类
 * Created by liu on 2018/2/7.
 */

public class StringUtils {

    /**
     * 安全的string判空方式
     */
    public static boolean isEmptyText(String text){
        return !(text != null && !text.isEmpty());
    }

    /**
     * 通过获取指定颜色的文本
     * @param colorResource
     * @param text
     * @return
     */
    public static String getColorHtmlText(int colorResource, String text) {
        return "<font color='" + "#" + BaseApplication.getAppContext().getResources().getString(colorResource).substring(3) + "'>" + text
                + "</font>";
    }

    /**
     * 获取指定颜色的粗体文本
     * @param colorResource
     * @param text
     * @return
     */
    public static String getColorHtmlTextArrow(int colorResource, String text) {
        return "<b><strong><font color='" + "#" + BaseApplication.getAppContext().getResources().getString(colorResource).substring(3) + "'>"
                + text + "</font></strong></b>";
    }


    /**
     * 格式化保留两位小数
     *
     * @param price
     * @return
     */
    public static String get2price(String price) {
        try {
            return new java.text.DecimalFormat("######0.00").format(Double.valueOf(price));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 格式化无小数点价格
     *
     * @param price
     * @return
     */
    public static String get2nopointprice(String price) {
        try {
            return new java.text.DecimalFormat("#0").format(Double.valueOf(price));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 过滤字符串中的特殊字符
     */
    public static String stringFilter(String str) {
        String regEx = "[/:*?<>.|\"\n\t]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }

    /**
     * 将字符串中的指定内容替换为灰色
     * 返回可供使用的html格式
     */
    public static CharSequence getGrayHtml(String string,String s){
        String infodata = string.replace(s,"<font color=\"#e4e4e4\">"+s+"</font>");
        CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            charSequence = Html.fromHtml(infodata,Html.FROM_HTML_MODE_LEGACY);
        } else {
            charSequence = Html.fromHtml(infodata);
        }
        return charSequence;
    }

    /**
     * 将字符串中的指定内容替换为红色
     * 返回可供使用的html格式
     */
    public static CharSequence getRedHtml(String string,String s){
        String infodata = string.replace(s,"<font color=\"#ff0000\">"+s+"</font>");
        CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            charSequence = Html.fromHtml(infodata,Html.FROM_HTML_MODE_LEGACY);
        } else {
            charSequence = Html.fromHtml(infodata);
        }
        return charSequence;
    }

    /**
     * public int indexOf(int ch, int fromIndex)
     * 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索
     *
     * @param srcText
     * @param findText
     * @return
     */
    public static int appearNumber(String srcText, String findText) {
        int count = 0;
        int index = 0;
        while ((index = srcText.indexOf(findText, index)) != -1) {
            index = index + findText.length();
            count++;
        }
        return count;
    }


    /**
     * 读取Assert文件夹下txt文本并变为String的方法
     *
     * @param context
     * @param strAssertFileName
     * @return
     */
    public static String readAssertResource(Context context, String strAssertFileName) {
        AssetManager assetManager = context.getAssets();
        String strResponse = "";
        try {
            InputStream ims = assetManager.open(strAssertFileName);
            strResponse = getStringFromInputStream(ims);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strResponse;
    }

    // 读取Assert文件夹下txt文本并变为String的方法
    private static String getStringFromInputStream(InputStream a_is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            br = new BufferedReader(new InputStreamReader(a_is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return sb.toString();
    }


    /**
     * 判断字符串是否为null或长度为0
     *
     * @param s 待校验字符串
     * @return {@code true}: 空<br> {@code false}: 不为空
     */
    public static boolean isEmpty(CharSequence s) {
        return s == null || s.length() == 0;
    }

    /**
     * 判断字符串是否为null或全为空格
     *
     * @param s 待校验字符串
     * @return {@code true}: null或全空格<br> {@code false}: 不为null且不全空格
     */
    public static boolean isSpace(String s) {
        return (s == null || s.trim().length() == 0);
    }


    /**
     * 返回字符串长度
     *
     * @param s 字符串
     * @return null返回0，其他返回自身长度
     */
    public static int length(CharSequence s) {
        return s == null ? 0 : s.length();
    }


    /**
     * 首字母大写
     *
     * @param s 待转字符串
     * @return 首字母大写字符串
     */
    public static String upperFirstLetter(String s) {
        if (isEmpty(s) || !Character.isLowerCase(s.charAt(0))) {
            return s;
        }
        return String.valueOf((char) (s.charAt(0) - 32)) + s.substring(1);
    }

    /**
     * 首字母小写
     *
     * @param s 待转字符串
     * @return 首字母小写字符串
     */
    public static String lowerFirstLetter(String s) {
        if (isEmpty(s) || !Character.isUpperCase(s.charAt(0))) {
            return s;
        }
        return String.valueOf((char) (s.charAt(0) + 32)) + s.substring(1);
    }


    /**
     * 反转字符串
     *
     * @param s 待反转字符串
     * @return 反转字符串
     */
    public static String reverse(String s) {
        int len = length(s);
        if (len <= 1) return s;
        int mid = len >> 1;
        char[] chars = s.toCharArray();
        char c;
        for (int i = 0; i < mid; ++i) {
            c = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = c;
        }
        return new String(chars);
    }

    /**
     * 转化为半角字符
     *
     * @param s 待转字符串
     * @return 半角字符串
     */
    public static String toDBC(String s) {
        if (isEmpty(s)) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0, len = chars.length; i < len; i++) {
            if (chars[i] == 12288) {
                chars[i] = ' ';
            } else if (65281 <= chars[i] && chars[i] <= 65374) {
                chars[i] = (char) (chars[i] - 65248);
            } else {
                chars[i] = chars[i];
            }
        }
        return new String(chars);
    }

    /**
     * 转化为全角字符
     *
     * @param s 待转字符串
     * @return 全角字符串
     */
    public static String toSBC(String s) {
        if (isEmpty(s)) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0, len = chars.length; i < len; i++) {
            if (chars[i] == ' ') {
                chars[i] = (char) 12288;
            } else if (33 <= chars[i] && chars[i] <= 126) {
                chars[i] = (char) (chars[i] + 65248);
            } else {
                chars[i] = chars[i];
            }
        }
        return new String(chars);
    }
}
