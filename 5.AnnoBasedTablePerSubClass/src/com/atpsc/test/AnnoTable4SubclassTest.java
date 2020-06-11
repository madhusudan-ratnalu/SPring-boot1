package com.atpsc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atpsc.entities.InternationalShipment;
import com.atpsc.entities.Shipment;
import com.atpsc.entities.SpeedShipment;
import com.atpsc.helper.SessionFactoryRegistry;

public class AnnoTable4SubclassTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Shipment shipment = null;
		SpeedShipment speedShipment = null;
		InternationalShipment internationalShipment = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionfactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			shipment=new Shipment();
			shipment.setSource("Hyderabad");
			shipment.setDestination("MUMBAI");
			shipment.setPrice(34567);
			shipment.setWeight(45);
			
			int awbNo=(int) session.save(shipment);
			System.out.println(awbNo);
			flag=true;
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				session.close();
			}
			SessionFactoryRegistry.closeSessionfactory();
		}

	}

}
