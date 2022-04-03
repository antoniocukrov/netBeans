package SellCount.util;

import SellCount.controller.ObradaJmjera;
import SellCount.model.Artikl;
import SellCount.model.Jmjera;
import SellCount.model.Klasifikacija;
import SellCount.model.Operater;
import com.github.javafaker.Faker;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.BarcodeEAN;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

public class PocetniInsert {

    private ObradaJmjera obradaJM;

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

    public static void unosBenze() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();
                
        Jmjera j = new Jmjera();
        j.setNaziv("L");
        session.save(j);
        
        Klasifikacija k = new Klasifikacija();
        k.setNaziv("Gorivo");
        session.save(k);

        Artikl artikl = new Artikl();
        artikl.setNaziv("Eurosuper 95");
        artikl.setCijena(12.45);
        artikl.setEANcode("385" + faker.number().digits(10));
        artikl.setKolicina(28763.87);
        artikl.setJmjera(j);
        artikl.setKlasifikacija(k);
        session.save(artikl);
        artikl = new Artikl();
        artikl.setNaziv("Eurosuper 100 BS AmbrošPower!");
        artikl.setCijena(13.79);
        artikl.setEANcode("385" + faker.number().digits(10));
        artikl.setKolicina(27402.18);
        artikl.setJmjera(j);
        artikl.setKlasifikacija(k);
        session.save(artikl);
        artikl = new Artikl();
        artikl.setNaziv("Eurodiesel BS");
        artikl.setCijena(13.51);
        artikl.setEANcode("385" + faker.number().digits(10));
        artikl.setKolicina(21274.42);
        artikl.setJmjera(j);
        artikl.setKlasifikacija(k);
        session.save(artikl);
        artikl = new Artikl();
        artikl.setNaziv("Eurodiesel BS AmbrošPower!");
        artikl.setCijena(14.86);
        artikl.setEANcode("385" + faker.number().digits(10));
        artikl.setKolicina(17453.10);
        artikl.setJmjera(j);
        artikl.setKlasifikacija(k);
        session.save(artikl);
        artikl = new Artikl();
        artikl.setNaziv("Autoplin");
        artikl.setCijena(6.82);
        artikl.setEANcode("385" + faker.number().digits(10));
        artikl.setKolicina(3853.32);
        artikl.setJmjera(j);
        artikl.setKlasifikacija(k);
        
        
        
        
        
        session.save(artikl);
        session.getTransaction().commit();

    }

    public static void unosSvega() {
        unosOperatera();
        unosBlagajnika();

        unosBenze();
    }
}
