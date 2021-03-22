package polime.app.AppQL.model;

public class SinhVien {
	private String MaSinhVien, HoTen, Email, SDT, DiaChi;
	private int GioiTinh;

	public SinhVien() {
	}

	public SinhVien(String maSinhVien, String hoTen, String email, String sDT, String diaChi, int gioiTinh) {
		MaSinhVien = maSinhVien;
		HoTen = hoTen;
		Email = email;
		SDT = sDT;
		DiaChi = diaChi;
		GioiTinh = gioiTinh;
	}

	public String getMaSinhVien() {
		return MaSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		MaSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		GioiTinh = gioiTinh;
	}

}
