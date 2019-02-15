package com.zzq.order.ordering.been;

import java.util.Date;

/**
 * @developer Zhengquan Zhang
 * @Date 2019/2/15 22:10
 */
public class Sellor {
    private String sellorId;
    private String sellName;
    private String address;
    private String telephone;
    private String creatTime;
    public String getSellorId() {
        return sellorId;
    }

    public void setSellorId(String sellorId) {
        this.sellorId = sellorId;
    }

    public String getSellName() {
        return sellName;
    }

    public void setSellName(String sellName) {
        this.sellName = sellName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public Sellor() {
    }

    public Sellor(String sellorId, String sellName, String address, String telephone, String creatTime) {
        this.sellorId = sellorId;
        this.sellName = sellName;
        this.address = address;
        this.telephone = telephone;
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Sellor{" +
                "sellorId='" + sellorId + '\'' +
                ", sellName='" + sellName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }
}
