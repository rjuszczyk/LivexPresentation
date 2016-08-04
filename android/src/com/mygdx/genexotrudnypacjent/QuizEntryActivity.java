package com.mygdx.genexotrudnypacjent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mygdx.genexotrudnypacjent.model.UserData;

/**
 * Created by Radek on 03.08.2016.
 */
public class QuizEntryActivity extends AppCompatActivity {
    UserData userData = new UserData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.quiz_entry_activity);

        Intent intent = new Intent(QuizEntryActivity.this, MainPageActivity.class);
        intent.putExtra("user_data", userData);
        finish();
        startActivity(intent) ;
    }
}
