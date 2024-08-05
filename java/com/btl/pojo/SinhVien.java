package com.btl.pojo;

import javax.persistence.*;

@Entity
@Table(name = "sinhvien")
public class SinhVien extends NguoiDung {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "idLopHoc")
    private LopHoc lopHoc;

    @ManyToOne
    @JoinColumn(name = "idKhoa")
    private Khoa khoa;

    @ManyToOne
    @JoinColumn(name = "idNganhDaoTao")
    private NganhDaoTao nganhDaoTao;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }

    public NganhDaoTao getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(NganhDaoTao nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
