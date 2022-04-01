package SellCount.util;

import SellCount.model.Artikl;
import SellCount.model.Jmjera;
import SellCount.model.Klasifikacija;
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
        public static void unosKlas(){
            Session session =HibernateUtil.getSession();
            session.beginTransaction();
            
            Klasifikacija k = new Klasifikacija();
            k.setNaziv("Gorivo");
            session.save(k);
            k = new Klasifikacija();
            k.setNaziv(("Slatkiši"));
            session.save(k);
            k = new Klasifikacija();
            k.setNaziv("Piće");
            session.save(k);
            session.getTransaction().commit();
            
        }
        
        public static void unosJM(){
            Session session =HibernateUtil.getSession();
            session.beginTransaction();
            Jmjera j = new Jmjera();
            j.setNaziv("KOM");
            session.save(j);
            j = new Jmjera();
            j.setNaziv("kg");
            session.save(j);
            j = new Jmjera();
            j.setNaziv("L");
            session.save(j);
            session.getTransaction().commit();
        }
        
        public static void unosArtikala(){
            Session session =HibernateUtil.getSession();
            session.beginTransaction();
            Artikl artikl = new Artikl();
            artikl.setNaziv("Eurosuper 95");
            artikl.setCijena(12.99);
            artikl.setEANcode("3854698546983");
            artikl.setKolicina(24.00);
            session.save(artikl);
            artikl = new Artikl();
            artikl.setNaziv("Eurodiesel");
            artikl.setCijena(13.99);
            artikl.setEANcode("3854698546984");
            artikl.setKolicina(21274.42);
            session.save(artikl);
            artikl = new Artikl();
            artikl.setNaziv("King double");
            artikl.setCijena(15.99);
            artikl.setEANcode("3850116660035");
            artikl.setKolicina(20.00);
            session.save(artikl);
            session.getTransaction().commit();
        }
        
        public static void unosSvega(){
             unosOperatera();
             unosBlagajnika();
             unosJM();
             unosKlas();
             unosArtikala();
        }
}
