package com.jspiders.ipl;

import com.jspiders.ipl.dto.IplDTO;
import com.jspiders.ipl.DAO.IplDAO;

public class Testclass {

	public static void main(String[] args) {

		System.out.println("main method started...");
		
		IplDTO dto = new IplDTO();
		dto.setId(2);
		dto.setTeamName("KKR");
		dto.setOwner("KHAN");
		dto.setNoOfMatches(14);
		dto.setNoOfPlayers(18);
		dto.setBuget(400000000.00);
		
		
		// saving object into databse
		/*IplDAO dao = new  IplDAO();
		dao.saveIPLTeam(dto);*/
		
		// fatching object from database
		/*IplDAO dao = new  IplDAO();
		IplDTO teamName = dao.fatchTeam(1);
		System.out.println(teamName);*/
		
		// updating present object in database 
		/*IplDAO dao = new IplDAO();
		dao.updateCoach();*/
		
		// deleting particular object
		IplDAO dao = new IplDAO();
		dao.deleteX();
		
		System.out.println("main method ended...");

	}

}
