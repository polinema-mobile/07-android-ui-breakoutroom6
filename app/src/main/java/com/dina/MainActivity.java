package com.dina;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView TanggalLahir;
    Calendar calendar;
    EditText nim, ttl, nama;
    Button btn;
    Spinner jurusan;
    RadioButton LL,W;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.edtNama);
        nim = (EditText) findViewById(R.id.edtNim);
        ttl = (EditText) findViewById(R.id.edtTanggalLahir);
        jurusan = (Spinner) findViewById(R.id.spinnerJurusan);
        btn = (Button) findViewById(R.id.btnSubmit);
        LL = (RadioButton) findViewById(R.id.radioButton);
        W = (RadioButton) findViewById(R.id.radioButton);


        btn= (Button) findViewById(R.id.btnSubmit);

        TanggalLahir = (TextView) findViewById(R.id.edtTanggalLahir);

        TanggalLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                int hari = calendar.get(Calendar.DAY_OF_MONTH);
                int bulan = calendar.get(Calendar.MONTH);
                int tahun = calendar.get(Calendar.YEAR);

                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mhari, int mbulan, int mtahun) {
                        TanggalLahir.setText(mhari + "/" + (mbulan + 1) + "/" + mtahun);
                    }
                }, hari, bulan, tahun);
                datePickerDialog.show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String nameValue = nama.getText().toString();
                String nimValue = nim.getText().toString();
                String ttlValue = ttl.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("NAME",nameValue);
                intent.putExtra("NIM",nimValue);
                intent.putExtra("TTL",ttlValue);
                startActivity(intent);
            }
        });





    }


}