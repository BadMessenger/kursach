package com.example.apppizza

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelp(val context: Context, val factory: SQLiteDatabase.CursorFactory?) : SQLiteOpenHelper(context, "appbd", factory, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val qwery = "CREATE TABLE users (id INT PRIMARY KEY, login TEXT, name TEXT, family TEXT, adres TEXT, password TEXT)"
        db!!.execSQL(qwery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }

    fun addUser(user: User){
        val values = ContentValues()
        values.put("login", user.login)
        values.put("name", user.name)
        values.put("family", user.family)
        values.put("adres", user.adres)
        values.put("password", user.password)

        val db = this.writableDatabase
        db.insert("users", null, values)

        db.close()
    }
    fun getUser(login: String, password: String): Boolean{
        val db = this.readableDatabase

        val result = db.rawQuery("SEKECT * FROM users WHERE login = '$login' AND password = '$password'", null)
        return result.moveToFirst()
    }
}