package com.btl.repository;

import com.btl.pojo.NguoiDung;
import java.util.List;

public interface NguoiDungRepository {
    List<NguoiDung> getAllNguoiDung();
    NguoiDung getNguoiDungById(int id);
    void addNguoiDung(NguoiDung nguoiDung);
    void deleteNguoiDung(int id);
}
