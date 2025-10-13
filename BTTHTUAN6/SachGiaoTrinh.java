package BTTUAN5;

public class SachGiaoTrinh extends Sach
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo)
    {
        super(maSach, tenSach, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public String getMonHoc()
    {
        return monHoc;
    }
    public void setMonHoc(String monHoc)
    {
        this.monHoc = monHoc;
    }
    public String getCapDo()
    {
        return capDo;
    }
    public void setCapDo(String capDo)
    {
        this.capDo = capDo;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Môn học: " + this.monHoc + ", Cấp độ: " + this.capDo;
    }
}
