/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SellCount.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author 38595
 */
@Entity
public class Primka extends Entitet {
    
    private String brojOtpremnice;
    private String dobavljac;
    
    @ManyToOne
    private Djelatnik djelatnik;
    
    @ManyToMany (mappedBy = "primke")
    private List<Artikl> artikli;

    public String getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(String brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    public String getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(String dobavljac) {
        this.dobavljac = dobavljac;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public List<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(List<Artikl> artikli) {
        this.artikli = artikli;
    }

    
    
    
}
