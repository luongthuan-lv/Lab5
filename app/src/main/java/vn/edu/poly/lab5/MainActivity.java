package vn.edu.poly.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Screen1(View view) {
        startActivity(new Intent(MainActivity.this,Bai1Activity.class));
    }

    public void Screen4(View view) {
        startActivity(new Intent(MainActivity.this,Bai4Activity.class));
    }

    public void Screen3(View view) {
        startActivity(new Intent(MainActivity.this,Bai3Activity.class));
    }

    public void Screen2(View view) {
        startActivity(new Intent(MainActivity.this,Bai2Activity.class));
    }
}
