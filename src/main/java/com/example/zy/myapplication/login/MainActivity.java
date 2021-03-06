package com.example.zy.myapplication.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zy.myapplication.main.SecondActivity;
import com.example.zy.myapplication.main.Tablayout2Activity;
import com.example.zy.myapplication.main.Tablayout3Activity;
import com.example.zy.myapplication.main.TablayoutActivity;
import com.example.zy.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.b_jump1)
    Button bJump1;
    @BindView(R.id.b_jump2)
    Button bJump2;
    @BindView(R.id.b_jump3)
    Button bJump3;
    @BindView(R.id.b_jump4)
    Button bJump4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.b_jump1, R.id.b_jump2,R.id.b_jump3,R.id.b_jump4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.b_jump1:
                Intent intent1 = new Intent(this, TablayoutActivity.class);
                startActivity(intent1);
                break;
            case R.id.b_jump2:
                Intent intent2 = new Intent(this, Tablayout2Activity.class);
                startActivity(intent2);
                break;
            case R.id.b_jump3:
                Intent intent3 = new Intent(this, Tablayout3Activity.class);
                startActivity(intent3);
                break;
            case R.id.b_jump4:
                Intent intent4 = new Intent(this, SecondActivity.class);
                startActivity(intent4);
                break;
        }
    }


}
