package com.btl.repository;

import com.btl.pojo.VaiTro;
import java.util.List;

public interface VaiTroRepository {
    List<VaiTro> getVaiTro();
    void saveVaiTro(VaiTro vaiTro);
    void deleteVaiTro(int id);
}
