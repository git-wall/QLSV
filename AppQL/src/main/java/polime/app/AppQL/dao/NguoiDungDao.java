package polime.app.AppQL.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import polime.app.AppQL.helper.databasehelper;
import polime.app.AppQL.model.NguoiDung;

public class NguoiDungDao {
	public NguoiDung checklogin(String TenDangNhap, String MatKhau) throws Exception {
		String sql = "select TenDangNhap,MatKhau,VaiTro from NguoiDung " + " where TenDangNhap = ? And MatKhau = ?";
		try (Connection con = databasehelper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
			pstm.setString(1, TenDangNhap);
			pstm.setString(2, MatKhau);
			try (ResultSet rs = pstm.executeQuery();) {
				if (rs.next()) {
					NguoiDung nd = new NguoiDung();
					nd.setTenDangNhap(TenDangNhap);
					nd.setVaiTro(rs.getString("VaiTro"));
					return nd;
				}
			}
		}
		return null;
	}
}
