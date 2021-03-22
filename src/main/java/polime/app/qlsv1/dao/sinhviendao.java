/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polime.app.qlsv1.dao;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import polime.app.qlsv1.helper.datebaseconection;
import polime.app.qlsv1.model.hocsinh;

/**
 *
 * @author Admin
 */
public class sinhviendao {

    public boolean insert(hocsinh sv) throws Exception {
        String sql = "INSERT INTO [dbo].[SinhVien]([MaSinhVien],[HoTen],[Email],[SDT],[GioiTinh],[DiaChi]) "
                + " VALUES (?,?,?,?,?)";
        try (Connection con = datebaseconection.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, sv.getMaSinhVien());
            pstm.setString(2, sv.getHoTen());
            pstm.setString(3, sv.getEmail());
            pstm.setString(4, sv.getSDT());
            pstm.setInt(5, sv.getGioiTinh());
            pstm.setString(6, sv.getDiaChi());
            return pstm.executeUpdate() > 0;
        }
    }

    public boolean update(hocsinh sv) throws Exception {
        String sql = "UPDATE dbo.SinhVien " + " SET HoTen = ?, Email = ?, SDT = ?,GioiTinh = ?,DiaChi = ?"
                + " where MaSinhVien = ?";
        try (Connection con = datebaseconection.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(6, sv.getMaSinhVien());
            pstm.setString(1, sv.getHoTen());
            pstm.setString(2, sv.getEmail());
            pstm.setString(3, sv.getSDT());
            pstm.setInt(4, sv.getGioiTinh());
            pstm.setString(5, sv.getDiaChi());
            return pstm.executeUpdate() > 0;
        }
    }

    public boolean delete(String MaSinhVien) throws Exception {
        String sql = "delete from SinhVien " + " where MaSinhVien = ?";
        try (Connection con = datebaseconection.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, MaSinhVien);
            return pstm.executeUpdate() > 0;
        }
    }

    public hocsinh findID(String MaSinhVien) throws Exception {
        String sql = "select *from SinhVien where MaSinhVien = ?";
        try (Connection con = datebaseconection.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, MaSinhVien);
            try (ResultSet rs = pstm.executeQuery();) {
                if (rs.next()) {
                    hocsinh a = createsinhvien(rs);
                    return a;
                }
            }
            return null;
        }}

    private hocsinh createsinhvien(final ResultSet rs) throws SQLException {
        hocsinh a = new hocsinh();
        a.setMaSinhVien(rs.getString("MaSinhVien"));
        a.setHoTen(rs.getString("HoTen"));
        a.setEmail(rs.getString("Email"));
        a.setSDT(rs.getString("SDT"));
        a.setGioiTinh(rs.getInt("GioiTinh"));
        a.setDiaChi(rs.getString("DiaChi"));
        return a;
    }
    public List<hocsinh> findall() throws Exception {
        String sql = "select *from SinhVien";
        try (Connection con = datebaseconection.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            try (ResultSet rs = pstm.executeQuery();) {
                List<hocsinh> list=new ArrayList<>();
                while (rs.next()) {
                    hocsinh a = createsinhvien(rs);
                    list.add(a);
                }return list;
            }
            
        }}
}
    
