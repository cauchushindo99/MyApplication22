package com.example.myapplication;

public class CarResponse {
    private String idXe;
    private String tenXe;
    private Integer soKhoi;
    private String nhaSanXuat;

    public CarResponse() {
        this.idXe = idXe;
        this.tenXe = tenXe;
        this.soKhoi = soKhoi;
        this.nhaSanXuat = nhaSanXuat;
    }



    public String getIdXe() {
        return idXe;
    }

    public void setIdXe(String idXe) {
        this.idXe = idXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public Integer getSoKhoi() {
        return soKhoi;
    }

    public void setSoKhoi(Integer soKhoi) {
        this.soKhoi = soKhoi;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

}
