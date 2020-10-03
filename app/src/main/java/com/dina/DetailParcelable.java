package com.dina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailParcelable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_parcelable);


        TextView nama = (TextView) findViewById(R.id.txtNama);
        TextView nim = (TextView) findViewById(R.id.txtNim);
        TextView tanggal = (TextView) findViewById(R.id.txtTtl);
        TextView jk = (TextView) findViewById(R.id.txtJk);
        TextView jurusan = (TextView) findViewById(R.id.txtJurusan);

        DataDiri show = getIntent().getParcelableExtra("TAMPIL");

        nama.setText( show.getNama());
        nim.setText( show.getNim());
        tanggal.setText( show.getTanggal());
        jk.setText( show.getJk());
        jurusan.setText( show.getJurusan());

    }
}