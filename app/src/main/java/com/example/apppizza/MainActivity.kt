package com.example.apppizza

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Random



class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 2000L
    private var currentLayout = 1
    val rnd = Random()



        //val button: ImageButton = findViewById(R.id.butreg)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiti_str_1)

        val r = rnd.nextInt(2)
        //val userLogin: EditText = findViewById(R.id.mail_login)
        //val userName: EditText = findViewById(R.id.name1)
        //val userFamily: EditText = findViewById(R.id.famili1)
        //val userAdres: EditText = findViewById(R.id.adres1)
        //val userPassword: EditText = findViewById(R.id.password)



      //  val button1: ImageButton = findViewById(R.id.Avt1)
      // button.setOnClickListener{
      //     val login = userLogin.text.toString().trim()
      //     val name = userName.text.toString().trim()
      //     val family = userFamily.text.toString().trim()
      //     val adres = userAdres.text.toString().trim()
      //     val password = userPassword.text.toString().trim()
      //     if (login == " " || password == " "){
      //         Toast.makeText(this, "Заполните почту и пароль", Toast.LENGTH_LONG).show()
      //     }
      //     else{
      //         val user = User(login, name, family, adres, password)

      //         val db = DbHelp(this, null)
      //         db.addUser(user)

      //         setContentView(R.layout.hello_page)
      //     }
      // }


      //  val userLogin1: EditText = findViewById(R.id.log1)
      //  val userPassword1: EditText = findViewById(R.id.pass1)
      // button1.setOnClickListener{
      //     val login = userLogin1.text.toString().trim()
      //     val password = userPassword1.text.toString().trim()
      //     if (login == " " || password == " "){
      //         Toast.makeText(this, "Заполните почту и пароль", Toast.LENGTH_LONG).show()
      //     }
      //     else{
      //         val db = DbHelp(this, null)
      //         val isAuth = db.getUser(login, password)

      //         if (isAuth){
      //             userLogin.text.clear()
      //             userPassword.text.clear()
      //             setContentView(R.layout.menu_set)
      //         }else{
      //             Toast.makeText(this, "Данные введены не верно", Toast.LENGTH_LONG).show()
      //         }


      //     }
      // }

        //обработчик для задержки открытия следующих макетов
        if (r == 1) {
            val handler = Handler()
            val runnable = object : Runnable {
                override fun run() {
                    when (currentLayout) {
                        1 -> setContentView(R.layout.activiti_str_2)
                        2 -> setContentView(R.layout.activiti_str_3)
                        3 -> setContentView(R.layout.activiti_str_4)
                        4 -> setContentView(R.layout.activiti_str_5)
                        5 -> setContentView(R.layout.menu_set)
                    }
                    currentLayout++
                    handler.postDelayed(this, SPLASH_TIME_OUT)
                }
            }
            handler.postDelayed(runnable, SPLASH_TIME_OUT)
        }
        if (r == 0) {
            val handler = Handler()
            val runnable = object : Runnable {
                override fun run() {
                    when (currentLayout) {
                        1 -> setContentView(R.layout.activiti_str_2)
                        2 -> setContentView(R.layout.activiti_str_3)
                        3 -> setContentView(R.layout.activiti_str_4)
                        4 -> setContentView(R.layout.activiti_str_5)
                        5 -> setContentView(R.layout.profil)
                    }
                    currentLayout++
                    handler.postDelayed(this, SPLASH_TIME_OUT)
                }
            }
            handler.postDelayed(runnable, SPLASH_TIME_OUT)
        }
    }

    fun zbpassword(view: View){ //забыл пароль
        setContentView(R.layout.crash_edit_1)
    }
    fun registr(view: View){
        setContentView(R.layout.registr_1)
    }
    fun q3(view: View){ //глав меню
        setContentView(R.layout.menu_1_0)
    }
    fun q4(view: View){
        setContentView(R.layout.profil)
    }
    fun w1(view: View){ //сеты
        setContentView(R.layout.menu_set)
    }
    fun w2(view: View){ //корзина
        setContentView(R.layout.korzina_null)
    }
    fun w3(view: View){ //поделиться
        setContentView(R.layout.podellll)
    }
    fun qw1(view: View){ //код к поделиться
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("label", "https://esia.gosuslugi.ru/login/")
        clipboard.setPrimaryClip(clip)
    }
    fun set1(view: View){
        setContentView(R.layout.eda_menu_set_1)
    }
    fun set2(view: View){
        setContentView(R.layout.eda_menu_set_2)
    }
    fun set3(view: View){
        setContentView(R.layout.eda_menu_set_3)
    }
    fun set4(view: View){
        setContentView(R.layout.eda_menu_set_4)
    }
    fun set5(view: View){
        setContentView(R.layout.eda_menu_set_5)
    }
    fun set6(view: View){
        setContentView(R.layout.eda_menu_set_6)
    }
    fun set7(view: View){
        setContentView(R.layout.eda_menu_set_7)
    }
    fun op1(view: View){
        setContentView(R.layout.korzina_money_me)
    }
    fun z1(view: View){
        setContentView(R.layout.korzina_drop)
    }
    fun nazad_1(view: View){
        setContentView(R.layout.menu_set)
    }

}


