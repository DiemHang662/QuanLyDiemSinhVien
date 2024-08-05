package com.btl.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "vaitro") // Đảm bảo rằng tên bảng khớp với cơ sở dữ liệu
public class VaiTro {

    @Id
    @Column(name = "id") // Đảm bảo rằng tên cột khớp với cơ sở dữ liệu
    private int id;
    
    @Column(name = "name") // Đảm bảo rằng tên cột khớp với cơ sở dữ liệu
    private String name;

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
}
