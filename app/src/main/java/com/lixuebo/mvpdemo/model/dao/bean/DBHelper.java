package com.lixuebo.mvpdemo.model.dao.bean;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.lixuebo.mvpdemo.MyApplication;

/**
 * Created by lixuebo on 17/3/18.
 */

public class DBHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASENAME = "lixuebo.db";
    private static final int VERSION = 1;

    private static DBHelper instance;

    private DBHelper(Context context) {
        super(context, DATABASENAME, null, VERSION);
    }

    /**
     * 单例
     * 双重校验
     * @return
     */
    public static DBHelper getInstance() {

        if (instance == null) {

            synchronized (DBHelper.class) {
                if (instance == null) {
                    instance = new DBHelper(MyApplication.getContext());
                }
            }

        }


        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
