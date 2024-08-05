package com.btl.service.impl;

import com.btl.pojo.SinhVien;
import com.btl.repository.SinhVienRepository;
import com.btl.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    private final SinhVienRepository sinhVienRepository;

    public SinhVienServiceImpl(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }

    @Override
    public SinhVien findById(int id) {
        return sinhVienRepository.findById(id);
    }

    @Override
    public List<SinhVien> findAll() {
        return sinhVienRepository.findAll();
    }

    @Override
    public void save(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public void update(SinhVien sinhVien) {
        sinhVienRepository.update(sinhVien);
    }

    @Override
    public void deleteById(int id) {
        sinhVienRepository.deleteById(id);
    }
}
