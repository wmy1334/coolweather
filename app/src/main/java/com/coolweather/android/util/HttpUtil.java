package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017-10-20.
 */

public class HttpUtil {

    public static void sendOkHtttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();     //发起一条Http请求
        client.newCall(request).enqueue(callback);
    }

}
