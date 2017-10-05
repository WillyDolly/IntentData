package com.thanhtam.intentdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ManHinh2 extends AppCompatActivity {
TextView txtNoidung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
        txtNoidung = (TextView)findViewById(R.id.textView);

        Intent myIntent = getIntent();
      //  int noidung = myIntent.getIntExtra("data",9999);
      //  txtNoidung.setText("" + noidung);
      //  int[]array = myIntent.getIntArrayExtra("data");
     //   SinhVien sinhvien = (SinhVien) myIntent.getSerializableExtra("data");
        Bundle myBundle = myIntent.getBundleExtra("data");
        String chuoi = myBundle.getString("chuoi");
        int so = myBundle.getInt("so");
        String[] mangchuoi = myBundle.getStringArray("mangChuoi");
        SinhVien sinhVien = (SinhVien) myBundle.getSerializable("doituong");


        txtNoidung.setText("" + chuoi + "-" + so + "-" + mangchuoi[2] + "-" +sinhVien.Hoten);
    }
}
