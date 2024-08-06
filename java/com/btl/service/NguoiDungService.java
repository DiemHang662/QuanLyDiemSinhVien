package com.btl.service;

import com.btl.pojo.NguoiDung;
import com.btl.pojo.SinhVien;
import java.util.List;

public interface NguoiDungService {
    List<NguoiDung> getNguoiDung();
    List<NguoiDung> getAllNguoiDung();
    NguoiDung getNguoiDungById(int id);
    void addNguoiDung(NguoiDung nguoiDung);
    void deleteNguoiDung(int id);
}
