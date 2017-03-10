package com.example.it01.retrofitrx.activity;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.it01.retrofitrx.R;
import com.example.it01.retrofitrx.fragment.fragment1;
import com.example.it01.retrofitrx.fragment.fragment2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Fr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn1)
    public void btn1Click(View view){
        loadFragment(new fragment1());
        Toast.makeText(getApplicationContext(), "load fragment 1", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn2)
    public void btn2Click(View view){
        loadFragment(new fragment2());
        Toast.makeText(getApplicationContext(), "load fragment 2", Toast.LENGTH_SHORT).show();
    }

    public void loadFragment(Fragment fragment){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentxx, fragment);
        fragmentTransaction.commit();

    }
}
