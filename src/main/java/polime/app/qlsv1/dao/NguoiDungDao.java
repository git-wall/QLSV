/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polime.app.qlsv1.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import polime.app.qlsv1.helper.datebaseconection;
import polime.app.qlsv1.model.NguoiDung;
/**
 *
 * @author Admin
 */
public class NguoiDungDao {
    public NguoiDung checklogin(String TenDangNhap, String MatKhau) throws Exception {
		String sql = "select TenDangNhap,MatKhau,VaiTro from NguoiDung " + " where TenDangNhap = ? And MatKhau = ?";
		try (Connection con = datebaseconection.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
			pstm.setString(1, TenDangNhap);
			pstm.setString(2, MatKhau);
			try (ResultSet rs = pstm.executeQuery();) {
				if (rs.next()) {
					NguoiDung nd = new NguoiDung();
					nd.setTenDangNhap(TenDangNhap);
					nd.setVaitro(rs.getString("VaiTro"));
					return nd;
				}
			}
		}
		return null;
	}
}
