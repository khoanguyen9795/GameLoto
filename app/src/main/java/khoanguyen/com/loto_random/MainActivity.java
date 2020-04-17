package khoanguyen.com.loto_random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 EditText mEdtSobatdau,mEdtSoketthuc;
 Button mBtnRandom;
 TextView mTvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSobatdau = findViewById(R.id.edittextSobatdau);
        mEdtSobatdau = findViewById(R.id.edittextSoketthuc);
        mBtnRandom =  findViewById(R.id.buttonRandom);
        mTvKetqua = findViewById(R.id.textviewKetqua);
        Random random = new Random();
        for (int i =0;i<10;i++){
        int value = random.nextInt(7)+5;
        Log.d("BBB",value+"");}
    }
}
