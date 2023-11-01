package com.pierredev.conexionbd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLite extends SQLiteOpenHelper {

//    Constructor
    public ConexionSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

//  Metodo para crear
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

//  Metodo para actualizar
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
