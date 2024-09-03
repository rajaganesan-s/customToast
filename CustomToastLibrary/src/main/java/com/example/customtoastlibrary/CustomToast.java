package com.example.customtoastlibrary;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {
    public void showCustomToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
