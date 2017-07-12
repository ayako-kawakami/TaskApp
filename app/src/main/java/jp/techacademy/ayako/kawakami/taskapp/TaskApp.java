package jp.techacademy.ayako.kawakami.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by kawakami on 2017/07/10.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
