package com.capgemini.spring.org;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.annotation.Resource;

@Component("organization")
public class Organization {
	
	@Value("101")
	private int orgId;
	@Value("AMD")
	private String orgName;
	@Value("250000")
	private double marketPrice;
	@Autowired
	@Resource(name="address")
	private Address address;
	
	@Resource(name="list")
	private List<String> directors;
	@Resource(name="set")
	private Set<String> branches;
	@Resource(name="map")
	private Map<String, String> branchWiseHead;
	@Resource(name="props")
	private Properties ipAddresses;
	@Resource(name="props1")
	private Properties databaseDetails;

	public Organization() {	
	
	}
	public Organization(int orgId, String orgName, double marketPrice, Address address, List<String> directors,
			Set<String> branches, Map<String, String> branchWiseHead, Properties ipAddresses,
			Properties databaseDetails) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.marketPrice = marketPrice;
		this.address = address;
		this.directors = directors;
		this.branches = branches;
		this.branchWiseHead = branchWiseHead;
		this.ipAddresses = ipAddresses;
		this.databaseDetails = databaseDetails;
	}

	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getDirectors() {
		return directors;
	}
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	public Set<String> getBranches() {
		return branches;
	}
	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}
	public Map<String, String> getBranchWiseHead() {
		return branchWiseHead;
	}
	public void setBranchWiseHead(Map<String, String> branchWiseHead) {
		this.branchWiseHead = branchWiseHead;
	}
	public Properties getIpAddresses() {
		return ipAddresses;
	}
	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	public Properties getDatabaseDetails() {
		return databaseDetails;
	}
	public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
	}
	
	
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ", address="
				+ address + ", directors=" + directors + ", branches=" + branches + ", branchWiseHead=" + branchWiseHead
				+ ", ipAddresses=" + ipAddresses + ", databaseDetails=" + databaseDetails + "]";
	}
	

}
