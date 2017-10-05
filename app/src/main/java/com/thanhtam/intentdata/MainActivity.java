package com.thanhtam.intentdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnChuyen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChuyen = (Button)findViewById(R.id.buttonChuyen);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ManHinh2.class);
     //           intent.putExtra("data","");
      //          startActivity(intent);
               String[] mangTen = {"ABC","DEF","QWE","RTY","UIO"};
        //        intent.putExtra("data", mangTen);
           //     int[] arrayNumber = {123,456,789};
         //       intent.putExtra("data",arrayNumber);
         //       startActivity(intent);
                SinhVien sv = new SinhVien("Nguyen Van A",1999,34839487);
               Bundle bundel = new Bundle();
               bundel.putString("Chuoi","Noi dung dung chuoi");
               bundel.putInt("so",1234);
               bundel.putStringArray("mangChuoi",mangTen);
               bundel.putSerializable("doituong",bundel);

                intent.putExtra("data",sv);
                startActivity(intent);
            }
        });
    }
}
