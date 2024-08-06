package com.btl.service.impl;

import com.btl.pojo.NguoiDung;
import com.btl.repository.NguoiDungRepository;
import com.btl.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Override
    @Transactional
    public List<NguoiDung> getAllNguoiDung() {
        return nguoiDungRepository.getAllNguoiDung();
    }

    @Override
    @Transactional
    public NguoiDung getNguoiDungById(int id) {
        return nguoiDungRepository.getNguoiDungById(id);
    }

    @Override
    @Transactional
    public void addNguoiDung(NguoiDung nguoiDung) {
        nguoiDungRepository.addNguoiDung(nguoiDung);
    }

    @Override
    @Transactional
    public void deleteNguoiDung(int id) {
        nguoiDungRepository.deleteNguoiDung(id);
    }

    @Override
    public List<NguoiDung> getNguoiDung() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
