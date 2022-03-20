/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SellCount;

import org.hibernate.Session;
import SellCount.util.HibernateUtil;
import SellCount.util.PocetniInsert;
import SellCount.view.SplashScreen;

/**
 *
 * @author Lord Pupcent
 */
public class Start {
    private Session session;
    
    public Start(){
       
    }
    
    public static void main(String[] args) {
            new SplashScreen().setVisible(true);
            //PocetniInsert.unosOperatera();
 
    }
}
