package com.btl.controllers;

import com.btl.pojo.SinhVien;
import com.btl.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SinhVienController {

    private final SinhVienService sinhVienService;

    @Autowired
    public SinhVienController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    @GetMapping("/dssv")
    public String listSinhViens(Model model) {
        List<SinhVien> sinhVienList = sinhVienService.findAll(); // Lấy danh sách sinh viên từ service
        model.addAttribute("sinhVienList", sinhVienList); // Thêm danh sách vào model
        return "SinhVienList"; // Trả về tên JSP
    }
}
