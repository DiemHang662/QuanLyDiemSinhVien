package com.btl.service;

import com.btl.pojo.SinhVien;

import java.util.List;

public interface SinhVienService {
    SinhVien findById(int id);
    List<SinhVien> findAll();
    void save(SinhVien sinhVien);
    void update(SinhVien sinhVien);
    void deleteById(int id);
}
