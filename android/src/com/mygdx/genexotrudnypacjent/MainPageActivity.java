package com.mygdx.genexotrudnypacjent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mygdx.genexotrudnypacjent.model.UserData;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Radek on 13.07.2016.
 */
public class MainPageActivity extends AppCompatActivity {
    private UserData mUserData;


    @OnClick(R.id.next)
    void onNext(View view) {
        mUserData.setQuiz_odp1("tak");

        finish();
        BasePresentationActivity.start(this, R.layout.question1, mUserData);
    }

    @OnClick(R.id.next2)
    void onNext2(View view) {
        mUserData.setQuiz_odp2("tak");
        finish();
        BasePresentationActivity.start(this, R.layout.question2, mUserData);
    }


    @OnClick(R.id.next3)
    void onNext3(View view) {
        mUserData.setQuiz_odp3("tak");

        finish();
        BasePresentationActivity.start(this, R.layout.question3, mUserData);
    }


    @OnClick(R.id.next4)
    void onNext4(View view) {
        mUserData.setQuiz_odp4("tak");

        finish();
        BasePresentationActivity.start(this, R.layout.question4, mUserData);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_page);

        ButterKnife.bind(this);

        if(getIntent()!=null) {
            mUserData = (UserData) getIntent().getSerializableExtra("user_data");

            if(mUserData.getQuiz_odp1() != null && mUserData.getQuiz_odp1().length() > 0 ) {
                findViewById(R.id.next).setAlpha(0.5f);
            }
            if(mUserData.getQuiz_odp2() != null && mUserData.getQuiz_odp1().length() > 0) {
                findViewById(R.id.next2).setAlpha(0.5f);
            }
        }
    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        finish();
    }
}
