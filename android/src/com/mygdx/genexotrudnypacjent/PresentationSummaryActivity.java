package com.mygdx.genexotrudnypacjent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import com.mygdx.genexotrudnypacjent.model.UserData;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Radek on 13.07.2016.
 */
public class PresentationSummaryActivity extends AppCompatActivity {
    private UserData mUserData;

    @OnClick(R.id.main_page)
    void goToMainPage(View view) {
        Intent intent = new Intent(this, MainPageActivity.class);
        intent.putExtra("user_data", mUserData);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.next)
    void onNext(View view) {
        gotoNext();
    }

    private void gotoNext() {
        //Intent intent = new Intent(this, SendingDataActivity.class);
        Intent intent = new Intent(this, FormActivity.class);
        intent.putExtra("user_data", mUserData);
        finish();
        startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.question3);

        ButterKnife.bind(this);

        if(getIntent()!=null) {
            mUserData = (UserData) getIntent().getSerializableExtra("user_data");
            //	Log.d("user data", mUserData.toString());
        }


    }


}
