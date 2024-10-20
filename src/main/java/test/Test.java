/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Machine;
import entities.Salle;
import java.util.Date;
import org.hibernate.Hibernate;
import services.MachineService;
import services.SalleService;
import util.HibernateUtil;

public class Test {

    public static void main(String[] args) {
        SalleService ss = new SalleService();
        MachineService ms = new MachineService();
//        ss.create(new Salle("B3"));
//        ss.create(new Salle("B4"));

//        for(Salle s : ss.findAll())
//            System.out.println(s.getCode());
//        ms.create(new Machine("ER34", new Date(), ss.findById(1)));
//        ms.create(new Machine("ER33", new Date("2000/09/09"), ss.findById(2)));

//        for(Machine m : ss.findById(1).getMachines())
//            System.out.println(m.getRef());
        
        for(Machine m : ms.findBetweenDate(new Date("2010/01/01"), new Date()))
            System.out.println(m.getRef());
    }
}
