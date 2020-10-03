package com.dina;

import android.os.Parcel;
import android.os.Parcelable;

class DataDiri implements Parcelable {

String nama,nim ,tgl,jk,jurusan;

        protected DataDiri(Parcel in){
            nama= in.readString();
            nim= in.readString();
            tgl= in.readString();
            jk= in.readString();
            jurusan= in.readString();

        }

        public DataDiri(String nama,String nim,String tgl,String jk,String jurusan){
            this.nama = nama;
            this.nim = nim;
            this.tgl = tgl;
            this.jk = jk;
            this.jurusan = jurusan;

        }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTanggal() {
        return tgl;
    }

    public void setTanggal(String tanggal) {
        this.tgl = tanggal;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public static Creator<DataDiri> getCREATOR() {
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(nim);
        dest.writeString(tgl);
        dest.writeString(jk);
        dest.writeString(jurusan);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DataDiri> CREATOR = new Creator<DataDiri>() {
        @Override
        public DataDiri createFromParcel(Parcel in) {
            return new DataDiri(in);
        }

        @Override
        public DataDiri[] newArray(int size) {
            return new DataDiri[size];
        }
    };




}
