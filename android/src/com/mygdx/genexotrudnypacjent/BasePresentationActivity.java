package com.mygdx.genexotrudnypacjent;

import android.content.Context;
import android.content.Intent;
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
public class BasePresentationActivity extends AppCompatActivity {
    private UserData mUserData;

    public static void start(Context context, int layoutId, UserData userData) {
        Intent intent = new Intent(context, BasePresentationActivity.class);
        intent.putExtra("user_data", userData);
        intent.putExtra("layoutId", layoutId);

        context.startActivity(intent);
    }

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
        Intent intent = new Intent(this, PresentationSummaryActivity.class);
        intent.putExtra("user_data", mUserData);

        finish();
        startActivity(intent);
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layoutId = getIntent().getIntExtra("layoutId", -1);

        setContentView(layoutId);

        ButterKnife.bind(this);

        if(getIntent()!=null) {
            mUserData = (UserData) getIntent().getSerializableExtra("user_data");
            //	Log.d("user data", mUserData.toString());
        }
    }
}
