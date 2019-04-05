package com.capgemini.spring.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.org.*;
import java.util.*; 
import java.io.*;

@Configuration
public class AppConfig {
	
	public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
 		directors.add("AMD");
		directors.add("RAM");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
 		branches.add("manager");
		branches.add("hr");
		return branches;
	}

	public Map<String,String> getBranchWiseHead(){
		Map<String,String> branchWiseHead = new HashMap<>();
 		branchWiseHead.put("manager","AMD");
		branchWiseHead.put("hr","RAM");
		return branchWiseHead;
	}

	public Properties getIpAddresses(){
		Properties ipAddress = new Properties();
		ipAddress.put("manager", "192.168.1.1");
		ipAddress.put("hr", "192.168.1.2");
		return ipAddress;
	}
	public Properties getDatabaseDetails(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/dbConfig.properties");
			databaseDetails.load(reader);
	
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return databaseDetails;
	}

	public Address getAddress(){
		Address address = new Address("Maharashtra","India");
		return address;
	}	

	@Bean("organization")
	public Organization organization(){
		Organization organization = new Organization();
		organization.setOrgId(11);
		organization.setOrgName("Capgemini");
		organization.setMarketPrice(90000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddresses());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}