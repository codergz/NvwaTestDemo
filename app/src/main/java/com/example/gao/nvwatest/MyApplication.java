package com.example.gao.nvwatest;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import cn.jiajixin.nuwa.Nuwa;
/**
 * Created by gao on 2016/8/18.
 */
public class MyApplication extends Application {

    private static Context context;

    public void onCreate(){
        super.onCreate();
        MyApplication.context = getApplicationContext();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));

    }

    public static Context getAppContext() {
        return MyApplication.context;
    }
}

