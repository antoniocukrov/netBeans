/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.edunovajp25baza;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Admin
 */
//
@MappedSuperclass
public class EntitetJP25 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }
    
}
