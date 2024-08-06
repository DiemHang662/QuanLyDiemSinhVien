package com.btl.repository.impl;

import com.btl.pojo.SinhVien;
import com.btl.repository.SinhVienRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;

@Repository
public class SinhVienRepositoryImpl implements SinhVienRepository {

    private final JdbcTemplate jdbcTemplate;

    public SinhVienRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public SinhVien findById(int id) {
        String sql = "SELECT * FROM SinhVien WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new SinhVienRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null; // Xử lý theo yêu cầu
        }
    }

    @Override
    public List<SinhVien> findAll() {
        String sql = "SELECT * FROM SinhVien";
        return jdbcTemplate.query(sql, new SinhVienRowMapper());
    }

//    @Override
//    public void save(SinhVien sinhVien) {
//        String sql = "INSERT INTO SinhVien (id, name, idLopHoc, idKhoa, idNganhDaoTao) VALUES (?, ?, ?, ?, ?)";
//        jdbcTemplate.update(sql, sinhVien.getId(), sinhVien.getName(), sinhVien.getLopHoc().getId(), sinhVien.getKhoa().getId(), sinhVien.getNganhDaoTao().getId());
//    }

//    @Override
//    public void update(SinhVien sinhVien) {
//        String sql = "UPDATE SinhVien SET name = ?, idLopHoc = ?, idKhoa = ?, idNganhDaoTao = ? WHERE id = ?";
//        jdbcTemplate.update(sql, sinhVien.getName(), sinhVien.getLopHoc().getId(), sinhVien.getKhoa().getId(), sinhVien.getNganhDaoTao().getId(), sinhVien.getId());
//    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM SinhVien WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void save(SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class SinhVienRowMapper implements RowMapper<SinhVien> {
        @Override
        public SinhVien mapRow(ResultSet rs, int rowNum) throws SQLException {
            SinhVien sinhVien = new SinhVien();
            sinhVien.setId(rs.getInt("id"));
            sinhVien.setName(rs.getString("name"));
            // Set các đối tượng liên quan nếu cần
            // Ví dụ: sinhVien.setLopHoc(new LopHoc(rs.getInt("idLopHoc"), ...));
            // sinhVien.setKhoa(new Khoa(rs.getInt("idKhoa"), ...));
            // sinhVien.setNganhDaoTao(new NganhDaoTao(rs.getInt("idNganhDaoTao"), ...));
            return sinhVien;
        }
    }
}
