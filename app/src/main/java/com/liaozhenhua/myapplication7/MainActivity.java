package com.liaozhenhua.myapplication7;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        final Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        final Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //替换碎片，总的技术是在replace()方法下进行的
        switch (v.getId()){
            case R.id.button1:
                //首先要有碎片的对象
                AnotherRight1Fragment arf1 = new AnotherRight1Fragment();
                //求到碎片管理的对象
                FragmentManager fm = getSupportFragmentManager();
                //得到碎片管理对象的目的是为了求事物
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.right_layout,arf1,"arg");
                ft.addToBackStack(null);
                ft.commit();
                break;
                default:
        }
        //替换碎片，总的技术是在replace()方法下进行的
        switch (v.getId()){
            case R.id.button2:
                //首先要有碎片的对象
                AnotherRight2Fragment arf2 = new AnotherRight2Fragment();
                //求到碎片管理的对象
                FragmentManager fm = getSupportFragmentManager();
                //得到碎片管理对象的目的是为了求事物
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.right_layout,arf2,"arg");
                ft.addToBackStack(null);
                ft.commit();
                break;
            default:
        }
        //替换碎片，总的技术是在replace()方法下进行的
        switch (v.getId()){
            case R.id.button3:
                //首先要有碎片的对象
                AnotherRight3Fragment arf3 = new AnotherRight3Fragment();
                //求到碎片管理的对象
                FragmentManager fm = getSupportFragmentManager();
                //得到碎片管理对象的目的是为了求事物
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.right_layout,arf3,"arg");
                ft.addToBackStack(null);
                ft.commit();
                break;
            default:
        }
    }
}
