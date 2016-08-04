package com.mygdx.genexotrudnypacjent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mygdx.genexotrudnypacjent.database.DatabaseHelper;
import com.mygdx.genexotrudnypacjent.dialog.ChooseElementDialog;
import com.mygdx.genexotrudnypacjent.dialog.ChooseStanowiskoDialog;
import com.mygdx.genexotrudnypacjent.model.Row;
import com.mygdx.genexotrudnypacjent.model.UserData;
import com.mygdx.genexotrudnypacjent.util.KeyboardUtil;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Radek on 2016-02-27.
 */
public class FormActivity extends AppCompatActivity {
    UserData userData = null;
    @Bind(R.id.przedst)
    TextView mPrzedstawicielMedyczny;

    @Bind(R.id.miasto)
    TextView mMiasto;

    @Bind(R.id.apteka)
    TextView mApteka;



    @Bind(R.id.dalej)
    View mQuiz;
    @OnClick(R.id.dalej)
    void onDalej(View v) {
        if(mImie.isEnabled() && mImie.getText().length()>0 ) {
            userData.setUserData(mImie.getText().toString(), "", "", "", true, true, true);
            //Intent intent = new Intent(this, MainPageActivity.class);
            Intent intent = new Intent(this, SendingDataActivity.class);
            intent.putExtra("user_data", userData);
            finish();
            startActivity(intent);
        } else {
            Toast.makeText(this, "Uzupełnij wszystkie dane!", Toast.LENGTH_SHORT).show();
        }
    }



    @Bind(R.id.imie)
    EditText mImie;


    String imie_przedstawiciela;
    String nazwisko_przedstawiciela;
    String miasto;
    String nazwa_apteki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        userData = (UserData) getIntent().getSerializableExtra("user_data");
        setContentView(R.layout.form_activity);

        ButterKnife.bind(this);


        KeyboardUtil keyboardUtil = new KeyboardUtil(this, findViewById(R.id.content));

//enable it
        keyboardUtil.enable();

        mMiasto.setEnabled(false);
        mApteka.setEnabled(false);

        mImie.setEnabled(false);

        mPrzedstawicielMedyczny.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new ChooseElementDialog() {

                    @Override
                    public String getRowText(Row row) {
                        return row.imie_przedstawiciela + " " + row.nazwisko_przedstawiciela;
                    }

                    @Override
                    public List<Row> getRows(Context context) {
                        return DatabaseHelper.rowsForPrzedstawiciel(context);
                    }

                    @Override
                    public void onRowSelected(Row row) {
                        imie_przedstawiciela = row.imie_przedstawiciela;
                        nazwisko_przedstawiciela = row.nazwisko_przedstawiciela;
                        mPrzedstawicielMedyczny.setText(getRowText(row));
                        mMiasto.setEnabled(true);
                        mMiasto.setText("Miasto");
                        mApteka.setText("Apteka");



                        mApteka.setEnabled(false);

                        mImie.setEnabled(false);

                    }
                }.show(getSupportFragmentManager(), "tag");
            }
        });



        mMiasto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new ChooseElementDialog() {

                    @Override
                    public String getRowText(Row row) {
                        return row.miasto;
                    }

                    @Override
                    public List<Row> getRows(Context context) {
                        return DatabaseHelper.rowsForPrzedstawiciel(imie_przedstawiciela, nazwisko_przedstawiciela, context);
                    }

                    @Override
                    public void onRowSelected(Row row) {
                        miasto = row.miasto;
                        mMiasto.setText(miasto);

                        mApteka.setEnabled(true);
                        mApteka.setText("Apteka");


                        mImie.setEnabled(false);

                    }
                }.show(getSupportFragmentManager(), "tag");
            }
        });

        mApteka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new ChooseElementDialog() {

                    @Override
                    public boolean isTwoLines() {
                        return true;
                    }

                    @Override
                    public String getRowText(Row row) {
                        return row.nazwa_apteki;
                    }

                    @Override
                    public List<Row> getRows(Context context) {
                        return DatabaseHelper.rowsForPrzedstawiciel(imie_przedstawiciela, nazwisko_przedstawiciela, miasto, context);
                    }

                    @Override
                    public void onRowSelected(Row row) {
                        nazwa_apteki = row.nazwa_apteki;
                        mApteka.setText(nazwa_apteki);



                        mImie.setEnabled(true);



                        userData.setRow(row);
                    }
                }.show(getSupportFragmentManager(), "tag");
            }
        });




        mImie.addTextChangedListener(mTextWatcher);

    }

    private void checkConditions() {
        if(mImie.isEnabled() && mImie.getText().length()>0) {
            mQuiz.setAlpha(1);

        } else {
            mQuiz.setAlpha(0.5f);
        }
    }

    CompoundButton.OnCheckedChangeListener mOnCheckCahangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            checkConditions();
        }
    };

    TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            checkConditions();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
