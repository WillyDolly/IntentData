package com.thanhtam.intentdata;

import java.io.Serializable;

/**
 * Created by Administrator on 26/05/2016.
 */
public class SinhVien implements Serializable {
    public String Hoten;
    public Integer NamSinh;
    public Integer SoDT;

    public SinhVien(String hoten, Integer namSinh, Integer soDT) {
        Hoten = hoten;
        NamSinh = namSinh;
        SoDT = soDT;
    }
}
