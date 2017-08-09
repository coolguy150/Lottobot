package org.androidtown.lottobot;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void login(View view){
//        Toast.makeText(getApplicationContext(), "로그인", Toast.LENGTH_LONG).show();

        EditText etUserName = (EditText)findViewById(R.id.userName);
        String userName = etUserName.getText().toString();

        /*
        * 지금 유저명은 하드코딩. db로 회원관리 할 예정 20170806
        *
        * */
        String[] userList = {"Name","박세현","정예슬","이충희","최윤용","이승규","서보배"};
        boolean chkUser = false;
        for(String tmpUser : userList){
            if(userName.equals(tmpUser)) {
                chkUser = true;
                break;
            }
        }

        if(chkUser){
            Intent intent = new Intent(getApplicationContext(), LottoActivity.class );
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), userName+"는 등록되지 않은 회원입니다.", Toast.LENGTH_LONG).show();
        }

    }


}
