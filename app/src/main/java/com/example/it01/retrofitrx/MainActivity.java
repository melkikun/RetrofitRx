package com.example.it01.retrofitrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.it01.retrofitrx.activity.ListDrawing;
import com.example.it01.retrofitrx.api.ApiRest;
import com.example.it01.retrofitrx.api.Intro;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.hello)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Intro intro = ApiRest.retrofit().create(Intro.class);
        Observable<String> hay = intro.hallo();
        hay.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("error", e.getMessage());
                    }

                    @Override
                    public void onNext(String s) {
                        textView.setText(s);
                        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), ListDrawing.class);
                        startActivity(intent);
                    }
                });
    }
}
