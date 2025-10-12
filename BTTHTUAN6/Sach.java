
package sach;

public class Sach 
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong; 

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    
    public Sach() 
    {
        
    }

    public String getMaSach()
    {
        return maSach;
    }
    public void setMaSach(String maSach)
    {
        this.maSach=maSach;
    }
    public String getTieuDe()
    {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe)
    {
        this.tieuDe=tieuDe;
    }
    public String getTacGia()
    {
        return tacGia;
    }
    public void setTacGia(String tacGia)
    {
        this.tacGia=tacGia;
    }
    public int getNamXuatBan()
    {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan)
    {
        this.namXuatBan=namXuatBan;
    }
    public int getSoLuong()
    {
        return soLuong;
    }
    public void setSoLuong(int soLuong)
    {
        this.soLuong=soLuong;
    }
    
    public void hienThiThongTin() 
    {
        System.out.println("Ma sach: " + (maSach != null ? maSach : "--"));
        System.out.println("Tieu de: " + (tieuDe != null ? tieuDe : "--"));
        System.out.println("Tac gia: " + (tacGia != null ? tacGia : "--"));
        System.out.println("Nam xuat ban: " + (namXuatBan != 0 ? namXuatBan : "--"));
        System.out.println("So luong: " + (soLuong != 0 ? soLuong : "--"));
    }
  
    
}
