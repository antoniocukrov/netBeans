package SellCount.controller;

import SellCount.model.Primka;
import SellCount.util.SellCountException;
import java.util.List;

public class ObradaPrimka extends Obrada<Primka>{
    
    @Override
    public List<Primka> read(){
        return session.createQuery("from Primka a order by a.naziv").list();
    }
    
  public List<Primka> read(String uvjet) {
        return session.createQuery("from Jmjera p "
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
