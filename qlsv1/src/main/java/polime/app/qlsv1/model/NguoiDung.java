/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polime.app.qlsv1.model;

/**
 *
 * @author Admin
 */
public class NguoiDung {
    private String TenDangNhap,MatKhau,Vaitro;
    public NguoiDung(){}

    public NguoiDung(String TenDangNhap, String MatKhau, String Vaitro) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Vaitro = Vaitro;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaitro() {
        return Vaitro;
    }

    public void setVaitro(String Vaitro) {
        this.Vaitro = Vaitro;
    }
    
}
