/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author os
 */
@Entity
@Table(name = "PhanLoaiHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhanLoaiHang.findAll", query = "SELECT p FROM PhanLoaiHang p"),
    @NamedQuery(name = "PhanLoaiHang.findById", query = "SELECT p FROM PhanLoaiHang p WHERE p.id = :id"),
    @NamedQuery(name = "PhanLoaiHang.findByMa", query = "SELECT p FROM PhanLoaiHang p WHERE p.ma = :ma"),
    @NamedQuery(name = "PhanLoaiHang.findByTen", query = "SELECT p FROM PhanLoaiHang p WHERE p.ten = :ten")})
public class PhanLoaiHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @OneToMany(mappedBy = "idPhanLoaiHang")
    private List<ChiTietSP> chiTietSPList;

    public PhanLoaiHang() {
    }

    public PhanLoaiHang(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @XmlTransient
    public List<ChiTietSP> getChiTietSPList() {
        return chiTietSPList;
    }

    public void setChiTietSPList(List<ChiTietSP> chiTietSPList) {
        this.chiTietSPList = chiTietSPList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhanLoaiHang)) {
            return false;
        }
        PhanLoaiHang other = (PhanLoaiHang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhanLoaiHang{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", chiTietSPList=" + chiTietSPList + '}';
    }

    
    
}
