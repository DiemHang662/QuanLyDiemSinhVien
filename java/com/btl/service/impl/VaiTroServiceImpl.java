package com.btl.service.impl;

import com.btl.pojo.VaiTro;
import com.btl.repository.VaiTroRepository;
import com.btl.service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VaiTroServiceImpl implements VaiTroService {
    @Autowired
    private VaiTroRepository vaiTroRepository;

    @Override
    @Transactional
    public List<VaiTro> getVaiTro() {
        return vaiTroRepository.getVaiTro();
    }
}