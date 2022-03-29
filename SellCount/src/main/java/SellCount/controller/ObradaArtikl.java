/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SellCount.controller;

import SellCount.model.Artikl;
import SellCount.util.SellCountException;
import java.util.List;

/**
 *
 * @author Lord Pupcent
 */
public class ObradaArtikl extends Obrada<Artikl>{
    
    @Override
    public List<Artikl> read(){
        return session.createQuery("from Artikl a order by a.naziv").list();
    }
    
    public List<Artikl> read(String uvjet) {
        return session.createQuery("from Artikl p "
                + " where concat(p.naziv) "
                + " like :uvjet order by p.naziv")
                .setParameter("uvjet","%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
    
    
    @Override
    protected void kontrolaCreate() throws SellCountException {
        
    }

    @Override
    protected void kontrolaUpdate() throws SellCountException {
        
    }

    @Override
    protected void kontrolaDelete() throws SellCountException {
       
    }
    
}
