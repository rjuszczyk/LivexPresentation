package com.mygdx.genexotrudnypacjent;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.mygdx.genexotrudnypacjent.database.DatabaseHelper;
import com.mygdx.genexotrudnypacjent.database.DbRepository;
import com.mygdx.genexotrudnypacjent.model.NotSendUser;
import com.mygdx.genexotrudnypacjent.model.Row;
import com.mygdx.genexotrudnypacjent.model.RowResponse;
import com.mygdx.genexotrudnypacjent.network.MyRetrofit;
import com.mygdx.genexotrudnypacjent.util.SharedPreferencesUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

/**
 * Created by Radek on 2016-02-26.
 */
public class StartActivity extends AppCompatActivity {


    void trySend(View v){
        startActivity(new Intent(this, ResendActivity.class));
    }


    @Bind(R.id.update)
    TextView mUpdate;

    @OnClick(R.id.update)
    void openUpdate(View view) {
        Intent intent = new Intent(this, DataActivity.class);
        intent.putExtra("update", true);
        startActivity(intent);
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.zapraszamy_activity);

            ButterKnife.bind(this);

            DbRepository.getDb(this);
            mUpdate.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onResume() {
            List<NotSendUser> notSendUsers = cupboard().withDatabase(DbRepository.getDb(this)).query(NotSendUser.class).list();

            int count = notSendUsers.size();
            if(count>0)
                trySend(null);
            else {
                if(!SharedPreferencesUtils.isStoreIndexInserted(this)) {
                    startActivity(new Intent(this, DataActivity.class));
                } else {
                    //Intent intent = new Intent(this, FormActivity.class);
                    Intent intent = new Intent(this, QuizEntryActivity.class);
                    startActivity(intent);
                }
            }

            super.onResume();
        }

}
