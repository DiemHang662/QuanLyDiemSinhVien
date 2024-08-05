package com.btl.pojo;

import javax.persistence.*;

@Entity
@Table(name = "LopHoc")
public class LopHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "idNganhDaoTao")
    private NganhDaoTao nganhDaoTao;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NganhDaoTao getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(NganhDaoTao nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
