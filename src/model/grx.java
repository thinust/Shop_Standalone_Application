package model;

public class grx {

    private String pName;
    private String qty;
    private String mfd;
    private String exd;
    private String bPrice;
    private String sPrice;
    private String brand;

    public grx(String pName, String qty, String mfd, String exd, String bPrice, String sPrice, String brand) {
        this.pName = pName;
        this.qty = qty;
        this.mfd = mfd;
        this.exd = exd;
        this.bPrice = bPrice;
        this.sPrice = sPrice;
        this.brand = brand;
    }
    
    
    
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getMfd() {
        return mfd;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    public String getExd() {
        return exd;
    }

    public void setExd(String exd) {
        this.exd = exd;
    }

    public String getbPrice() {
        return bPrice;
    }

    public void setbPrice(String bPrice) {
        this.bPrice = bPrice;
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
