package com.example.logonrm.mylibrary;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by logonrm on 02/08/2017.
 */

public class CustomToast {

    public static void showToast(Context context, String message){
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View customToastRoot = layoutInflater.inflate(R.layout.custom_toast, null);

        Toast customToast = new Toast(context);

        customToast.setView(customToastRoot);
        TextView textView = (TextView) customToastRoot.findViewById(R.id.textView1);
        textView.setText(message);
        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }
}
