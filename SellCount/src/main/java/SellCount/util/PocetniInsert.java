package SellCount.util;

import SellCount.model.Operater;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

public class PocetniInsert {
    public static void unosOperatera() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Operater o = new Operater();
        o.setUsername("partner");
        o.setUloga("oper");
        o.setLozinka(BCrypt.hashpw("potvrda", BCrypt.gensalt()));
        
        session.save(o);
        session.getTransaction().commit();
        }
        public static void unosBlagajnika() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Operater o = new Operater();
        o.setUsername("blagajnik");
        o.setUloga("djelatnik");
        o.setLozinka(BCrypt.hashpw("racun", BCrypt.gensalt()));
        
        session.save(o);
        session.getTransaction().commit();
    }
}
