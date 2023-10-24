/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Hibernate;
import services.MachineService;
import services.SalleService;
import util.HibernateUtil;

/**
 *
 * @author PC
 */
public class Test {

    public static void main(String[] args) {
  MachineService ms = new MachineService();
           IDao<Machine> dao = new MachineService();
           IDao<Salle> daosalle = new SalleService();
           SalleService ss = new SalleService();
//           daosalle.create(new Salle("b1"));
//            daosalle.create(new Salle("b1"));
//            daosalle.create(new Salle("b1"));
//                   dao.create(new Machine("latitude", "DELL", 3000,daosalle.findById(1)));
//        dao.create(new Machine("sumsung", "i7", 2000,daosalle.findById(1)));
//        dao.create(new Machine("sumsung", "i9", 4000,daosalle.findById(1)));
//        
//        for(Machine m: dao.findAll()){
//            System.out.println(m);}
////          
////
//////    }
////          System.out.println("salee-------------------");
//     Machine m = new Machine("hbd", "dg", 10,null);
//     ms.create(m);
//}
        System.out.println(dao.findById(11));
        ms.delete(dao.findById(11));
}
}
