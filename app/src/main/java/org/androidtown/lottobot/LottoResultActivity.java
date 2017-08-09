package org.androidtown.lottobot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LottoResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_lotto);

        //파라미터 전달받음
        Bundle extras = getIntent().getExtras();
        String extractionNum = extras.getString("extractionNum");

        //로또봇 로직 수행
        getNum(extractionNum);
    }

    //LottoBot 추출로직
    public void getNum(String extractionNum){





    }



}
