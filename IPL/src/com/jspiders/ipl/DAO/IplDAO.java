    package com.jspiders.ipl.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.ipl.dto.IplDTO;

public class IplDAO {
	
	public void saveIPLTeam(IplDTO iplteam){
		
		System.out.println("save method started...");
		
		
		// Component 1
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(IplDTO.class);//this is for mapping 
		
		
		// Component 2
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		// Component 3
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(iplteam);
		tx.commit();
		 
		session.close();
		factory.close();
		
		System.out.println("save method ended..");
		
	}
	
	public IplDTO fatchTeam(int pk){
		
		System.out.println("fatchTeam() method started..");
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(IplDTO.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session  = factory.openSession();
		IplDTO dtoFromDB = session.get(IplDTO.class, pk);
		
		System.out.println("fatchTeam() method ended..");
		
		return dtoFromDB;
		
		
	}
	
	public void updateCoach(){
		System.out.println("updateCoach() method started..");
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(IplDTO.class);
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Session session = factory.openSession();
		IplDTO dtoFromDB = session.get(IplDTO.class, 1);
		if(dtoFromDB!=null){
			
			dtoFromDB.setOwner("yyy");
			
			session.update(dtoFromDB);
			
			Transaction tx = session.beginTransaction();
			
			tx.commit();
			
			System.out.println("Update succesfully..");
		}else{
			System.out.println("Somthing went wrong");
		}
		
		System.out.println("updateCoach() method ended..");
	}
	
	public void deleteX(){
		
		System.out.println("deleteX() method started..");
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(IplDTO.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		IplDTO dtoFromDB = session.get(IplDTO.class, 2);
		
		if(dtoFromDB != null){
			
		session.delete(dtoFromDB);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		System.out.println("deleteX() method ended..");
		
		}
		
		
	}

}
