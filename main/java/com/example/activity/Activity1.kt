package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*

class Activity1 : AppCompatActivity() {
    override fun onOptionsItemSelected(item: MenuItem): Boolean {  //Boolean表示只有true和false的布尔值
        when(item.itemId){                  //item是标签，.id是俩不同的，应该还记得吧
            //add_item和remove_item都是标签的一种,你再main。xml里自己设的
            R.id.add_item -> Toast.makeText(this,"䃫ਣ(A)ಉ\u0A49,ξ1,ξ2,…,ξn\u0C77\u0A49 是AX ಉ0的一͗ധ\u2D6D解㈨,ࢠξ1,\n" +
                    "ξ2,…,ξn\u0C77\u0A49 线性ᬍ关,́Aξਾಉ0(ਾಉ1,2,…,n\u0C77\u0A49)౹ࣵ䃫线性ᬍ关向量组\n" +
                    "β1,β2,…,β\u0A4A 与向量组ξ1,ξ2,…,ξn\u0C77\u0A49 等Ф,݆ᓲ有\u0A4Aಉn\u0C77\u0A49,́",
                Toast.LENGTH_SHORT).show()    //show就是让一个窗口显示出来
            R.id.remove_item -> Toast.makeText(this,"10 西城大爷发文鼓励成都确诊女孩",
                Toast.LENGTH_SHORT).show()
            R.id.退出_item -> Toast.makeText(this,"哈哈哈哈哈哈哈哈哈啊啊哈哈哈哈哈哈哈哈哈哈哈",
                Toast.LENGTH_SHORT).show()
        }
        return true

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout) //加载布局界面，没有这个就啥也看不到
        button2.setOnClickListener {
            //设置按钮的响应事件
          val intent = Intent(this,Activi2::class.java)//传入俩参数，第一个是上下文第二个是指定要启动的activity
            startActivity(intent)//该方法顾名思义
        }
        val button1: Button = findViewById(R.id.button1)  //此函数用于在布局文件中获取定义的元素如button1，返回一个继承自view
        //的泛型对象，所以要将button1声明为Button类型
        button1.setOnClickListener{
            //设置按钮的响应事件
            val intent = Intent("come.example.activity.ACTION_START")//使之能被符合action和catagory要求的activi启动
            startActivity(intent)//该方法顾名思义，并且DEFAULT是默认目录，已经添加到这个intent中了。
            Toast.makeText(this,"可怕!居民投诉KTV噪音遭砍门报复",Toast.LENGTH_SHORT).show()
            //创造出一个Toast对象，调用show（）把toast显示出来就可以了，这里传入了三个参数。
            //第一个是Context即上下文，用this代替的Activity即可，第二个是显示的文本内容。第三个是文本显示的时长。可以选择两个内置
        }
    }          //事实上完全不用那么麻烦findViewById(R.id.button1)这个函数不用也罢

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)//这里是一个语法糖
        //实际上调用了父类的getMenuInflater（大概是获取菜单抽象类函数）函数得到一个MenuInflater对象
        //再调用它的inflate方法，这个方法接受两个参数1：通过哪一个资源文件创建菜单2：将菜单添加到哪一个menu中
        return true //表示让创建的菜单显示出来，如果return false就显示不出来
    }//ps：inflater是抽象类的意思，是个后缀如菜单抽象类，inflate就表示其中的某个类
}

