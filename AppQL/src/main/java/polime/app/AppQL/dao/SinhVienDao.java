package polime.app.AppQL.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import polime.app.AppQL.helper.databasehelper;
import polime.app.AppQL.model.SinhVien;

public class SinhVienDao {
	public boolean insert(SinhVien sv) throws Exception {
		String sql = "INSERT INTO [dbo].[SinhVien]([MaSinhVien],[HoTen],[Email],[SDT],[GioiTinh],[DiaChi]) "
				+ " VALUES (?,?,?,?,?,?)";
		try (Connection con = databasehelper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
			pstm.setString(1, sv.getMaSinhVien());
			pstm.setString(2, sv.getHoTen());
			pstm.setString(3, sv.getEmail());
			pstm.setString(4, sv.getSDT());
			pstm.setInt(5, sv.getGioiTinh());
			pstm.setString(6, sv.getDiaChi());
			return pstm.executeUpdate() > 0;
		}
	}

	public boolean update(SinhVien sv) throws Exception {
		String sql = "UPDATE dbo.SinhVien " + " SET HoTen = ?, Email = ?, SDT = ?,GioiTinh = ?,DiaChi = ?"
				+ " where MaSinhVien = ?";
		try (Connection con = databasehelper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
			pstm.setString(6, sv.getMaSinhVien());
			pstm.setString(1, sv.getHoTen());
			pstm.setString(2, sv.getEmail());
			pstm.setString(3, sv.getSDT());
			pstm.setInt(4, sv.getGioiTinh());
			pstm.setString(5, sv.getDiaChi());
			return pstm.executeUpdate() > 0;
		}
	}

	public boolean delete(SinhVien sv) throws Exception {
		String sql = "delete from SinhVien " + " where MaSinhVien = ?";
		try (Connection con = databasehelper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
			pstm.setString(1, sv.getMaSinhVien());
			return pstm.executeUpdate() > 0;
		}
	}
}
