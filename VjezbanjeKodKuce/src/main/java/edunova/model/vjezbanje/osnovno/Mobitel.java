/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model.vjezbanje.osnovno;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Admin
 */
// DZ SAZNAT KOJE SU DRUGE HIBERNATE ALTERNATIVE
@Entity
public class Mobitel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifra;
    private String naziv;
    private BigDecimal cijena;
    private Date datumKupnje;
    private boolean ispravan;
    private String opis;
    private String napomena;

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public void setDatumKupnje(Date datumKupnje) {
        this.datumKupnje = datumKupnje;
    }

    public void setIspravan(boolean ispravan) {
        this.ispravan = ispravan;
    }

    public int getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public Date getDatumKupnje() {
        return datumKupnje;
    }

    public boolean isIspravan() {
        return ispravan;
    }
    
    
    
}
