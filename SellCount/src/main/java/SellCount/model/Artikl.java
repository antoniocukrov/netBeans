/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SellCount.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lord Pupcent
 */
@Entity
public class Artikl extends Entitet{
    private String naziv;
    private String EANcode;
    private Double cijena;
    
    @ManyToOne
    private JM jm;
    @ManyToOne
    private Klasifikacija klasifikacija;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getEANcode() {
        return EANcode;
    }

    public void setEANcode(String EANcode) {
        this.EANcode = EANcode;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

    public JM getJm() {
        return jm;
    }

    public void setJm(JM jm) {
        this.jm = jm;
    }

    public Klasifikacija getKlasifikacija() {
        return klasifikacija;
    }

    public void setKlasifikacija(Klasifikacija klasifikacija) {
        this.klasifikacija = klasifikacija;
    }
    
        
    
}
