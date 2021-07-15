package com.aQuickSoft.Entity;

public class regionResponse 
{
	private int id;
	private String name;
	private String regions;
	private String flag;
	private boolean enableDatamapper;
	private boolean isActivated;
	private int resultCount;
	private String googleJobPostingEndpoint;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegions() {
		return regions;
	}
	public void setRegions(String regions) {
		this.regions = regions;
	}
      
	
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public boolean isActivated() {
		return isActivated;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	public boolean isEnableDatamapper() {
		return enableDatamapper;
	}
	public void setEnableDatamapper(boolean enableDatamapper) {
		this.enableDatamapper = enableDatamapper;
	}
	public int getResultCount() {
		return resultCount;
	}
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	public String getGoogleJobPostingEndpoint() {
		return googleJobPostingEndpoint;
	}
	public void setGoogleJobPostingEndpoint(String googleJobPostingEndpoint) {
		this.googleJobPostingEndpoint = googleJobPostingEndpoint;
	}
	
	
	

}
