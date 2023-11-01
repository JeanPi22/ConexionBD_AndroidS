package com.pierredev.conexionbd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLite extends SQLiteOpenHelper {

//  Versión y nombre de la base de datos
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "Ferreteria.db";

//  Tablas de la base de datos
    public static final String TABLE_CLIENTE = "t_cliente";
    public static final String TABLE_FACTURA = "t_factura";
    public static final String TABLE_PEDIDO = "t_pedido";
    public static final String TABLE_PRODUCTO = "t_producto";
    public static final String TABLE_PED_PROD = "t_ped_prod";

//    Constructor Bd
    public ConexionSQLite(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

//  Metodo para crear Bd
    @Override
    public void onCreate(SQLiteDatabase FerreteriaDB) {

        FerreteriaDB.execSQL("CREATE TABLE " + TABLE_CLIENTE + "(" +
            "cod_cli INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nombre TEXT," +
            "direccion TEXT," +
            "telefono TEXT)");

        FerreteriaDB.execSQL("CREATE TABLE " + TABLE_FACTURA + "(" +
                "cod_fact INTEGER PRIMARY KEY AUTOINCREMENT," +
                "fecha TEXT," +
                "valor REAL," +
                "cod_cli2 INTEGER," +
                "FOREIGN KEY (cod_cli2) REFERENCES " + TABLE_CLIENTE + "(cod_cli))");

        FerreteriaDB.execSQL("CREATE TABLE " + TABLE_PEDIDO + "(" +
                "cod_ped INTEGER PRIMARY KEY AUTOINCREMENT," +
                "descripcion TEXT," +
                "fecha TEXT," +
                "cod_cli1 INTEGER," +
                "cod_fact1 INTEGER," +
                "FOREIGN KEY (cod_cli1) REFERENCES " + TABLE_CLIENTE + "(cod_cli)," +
                "FOREIGN KEY (cod_fact1) REFERENCES " + TABLE_FACTURA + "(cod_fact))");

    }

//  Metodo para actualizar Bd
    @Override
    public void onUpgrade(SQLiteDatabase FerreteriaDB, int i, int i1) {

    }
}
