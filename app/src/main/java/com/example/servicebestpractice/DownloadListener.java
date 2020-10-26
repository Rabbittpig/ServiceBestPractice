package com.example.servicebestpractice;

import android.os.IBinder;

/**
 * Created by Zwp on 2020/10/26
 */
public interface DownloadListener{
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
