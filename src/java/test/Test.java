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
          SalleService ss = new SalleService();
     
}
}
