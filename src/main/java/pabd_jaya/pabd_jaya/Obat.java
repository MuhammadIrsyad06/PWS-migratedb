/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pabd_jaya.pabd_jaya;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name = "obat")
@NamedQueries({
    @NamedQuery(name = "Obat.findAll", query = "SELECT o FROM Obat o"),
    @NamedQuery(name = "Obat.findByKodeObat", query = "SELECT o FROM Obat o WHERE o.kodeObat = :kodeObat"),
    @NamedQuery(name = "Obat.findByNama", query = "SELECT o FROM Obat o WHERE o.nama = :nama"),
    @NamedQuery(name = "Obat.findByStok", query = "SELECT o FROM Obat o WHERE o.stok = :stok"),
    @NamedQuery(name = "Obat.findByJenis", query = "SELECT o FROM Obat o WHERE o.jenis = :jenis"),
    @NamedQuery(name = "Obat.findByDeskripsi", query = "SELECT o FROM Obat o WHERE o.deskripsi = :deskripsi")})
public class Obat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_obat")
    private Integer kodeObat;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;
    @Basic(optional = false)
    @Column(name = "jenis")
    private String jenis;
    @Basic(optional = false)
    @Column(name = "deskripsi")
    private String deskripsi;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "obat")
    private Transaksi transaksi;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "obat")
    private Supplier supplier;

    public Obat() {
    }

    public Obat(Integer kodeObat) {
        this.kodeObat = kodeObat;
    }

    public Obat(Integer kodeObat, String nama, int stok, String jenis, String deskripsi) {
        this.kodeObat = kodeObat;
        this.nama = nama;
        this.stok = stok;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
    }

    public Integer getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(Integer kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeObat != null ? kodeObat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obat)) {
            return false;
        }
        Obat other = (Obat) object;
        if ((this.kodeObat == null && other.kodeObat != null) || (this.kodeObat != null && !this.kodeObat.equals(other.kodeObat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pabd_jaya.pabd_jaya.Obat[ kodeObat=" + kodeObat + " ]";
    }
    
}
