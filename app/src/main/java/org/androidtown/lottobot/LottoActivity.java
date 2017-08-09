package org.androidtown.lottobot;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class LottoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.repeatNum, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }

    //번호추출
    public void extraction(View view){

        Spinner spExtractionNum = (Spinner)findViewById(R.id.spinner);
        String extractionNum =spExtractionNum.getSelectedItem().toString();

        //숫자만 추출
        extractionNum = extractionNum.replaceAll("[\\D]","");

        Toast.makeText(getApplicationContext(), extractionNum, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getApplicationContext(), LottoResultActivity.class );
        intent.putExtra("extractionNum", extractionNum);
        startActivity(intent);
    }

}
