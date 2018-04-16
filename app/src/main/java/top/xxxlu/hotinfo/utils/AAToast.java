package top.xxxlu.hotinfo.utils;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import top.xxxlu.hotinfo.R;


public class AAToast {

    public static void toastShow(Context act, String text) {
        View toastRoot = View.inflate(act.getApplicationContext(),R.layout.aa_toast, null);
        TextView tv_toast = (TextView) toastRoot.findViewById(R.id.tv_toast);
        tv_toast.setText(text);
        Toast toast = new Toast(act.getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(toastRoot);
        toast.show();
    }

    public static void toastShowLong(Activity act, String text) {
        View toastRoot = View.inflate(act.getApplicationContext(),R.layout.aa_toast, null);
        TextView tv_toast = (TextView) toastRoot.findViewById(R.id.tv_toast);
        tv_toast.setText(text);
        Toast toast = new Toast(act.getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastRoot);
        toast.show();
    }
}
