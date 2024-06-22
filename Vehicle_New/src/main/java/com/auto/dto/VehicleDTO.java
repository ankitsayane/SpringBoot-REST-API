package com.auto.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.auto.entities.Company;

public class VehicleDTO {

    @NotBlank
    private String vname;

    @NotNull
    private Company company;

    @NotBlank
    @Size(min = 10, max = 10)
    private String vnumber;

    @NotBlank
    private String vtype;

    @NotNull
    private Long uid;

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getVnumber() {
        return vnumber;
    }

    public void setVnumber(String vnumber) {
        this.vnumber = vnumber;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
}
