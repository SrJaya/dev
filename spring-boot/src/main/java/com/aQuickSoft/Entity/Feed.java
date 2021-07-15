package com.aQuickSoft.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feed 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedId;
	private int regionId;
	private String url;
	private String extention;
	private String tableName;
	private String tableInitFile;
	private String location;
	private String title;
	private String category;
	private String company;
	private String jobInsert;
	private String cleaningQuery;
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getExtention() {
		return extention;
	}
	public void setExtention(String extention) {
		this.extention = extention;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}

    public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
		public String getTableInitFile() {
		return tableInitFile;
	}
	public void setTableInitFile(String tableInitFile) {
		this.tableInitFile = tableInitFile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJobInsert() {
		return jobInsert;
	}
	public void setJobInsert(String jobInsert) {
		this.jobInsert = jobInsert;
	}
	public String getCleaningQuery() {
		return cleaningQuery;
	}
	public void setCleaningQuery(String cleaningQuery) {
		this.cleaningQuery = cleaningQuery;
	}
	
	

}
