package com.example.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.Contacts.Intents.Insert.ACTION
import android.provider.ContactsContract.Intents.Insert.ACTION
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_activi2.*

class Activi2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activi2)
        button5.setOnClickListener {
            //设置按钮的响应事件
            finish()//销毁该activity，即返回上一个界面
        }
        button6.setOnClickListener {
            //设置按钮的响应事件
            val intent = Intent(Intent.ACTION_VIEW)//系统内置动作，有常量值
            intent.data = Uri.parse("https://wwww.baidu.com")
            //该函数解析常量成URI对象，再用setData的方法传递
            startActivity(intent)
        }
    }
}



