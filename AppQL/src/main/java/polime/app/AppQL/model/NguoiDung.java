package polime.app.AppQL.model;

public class NguoiDung {
	private String TenDangNhap, MatKhau, VaiTro;

	public NguoiDung() {

	}

	public NguoiDung(String TenDangNhap, String MatKhau, String VaiTro) {
		this.TenDangNhap = TenDangNhap;
		this.MatKhau = MatKhau;
		this.VaiTro = VaiTro;
	}

	public String getTenDangNhap() {
		return TenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public String getVaiTro() {
		return VaiTro;
	}

	public void setVaiTro(String vaiTro) {
		VaiTro = vaiTro;
	}
}
