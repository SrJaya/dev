package com.aQuickSoft.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aQuickSoft.Entity.Feed;
import com.aQuickSoft.Entity.FeedRequest;
import com.aQuickSoft.Entity.FeedResponse;
import com.aQuickSoft.Entity.Region;
import com.aQuickSoft.Repository.FeedRepository;
@Service
public class FeedService
{
	
	@Autowired
	FeedRepository feedRepo;
	
     public FeedResponse create (FeedRequest request) 
     {
    	 Feed feed = new Feed ();
    	 feed.setRegionId(request.getRegionId());
    	 feed.setUrl(request.getUrl());
    	 feed.setExtention(request.getExtention());
    	 feed.setFeedId(request.getFeedId());
    	 feed.setTableName(request.getTableName());
    	 feed.setTableInitFile(request.getTableInitFile());
    	 feed.setLocation(request.getLocation());
    	 feed.setTitle(request.getTitle());
    	 feed.setCategory(request.getCategory());
    	 feed.setCompany(request.getCompany());
    	 feed.setJobInsert(request.getJobInsert());
    	 feed.setCleaningQuery(request.getCleaningQuery());
    	  
    	 feed= feedRepo.save(feed);
    	 return toResponse (feed);
    	 
     }
      
     private FeedResponse toResponse(Feed feed) 
     {
    	 FeedResponse fresponse = new FeedResponse();
    	 fresponse.setRegionId(feed.getRegionId());
    	 fresponse.setUrl(feed.getUrl());
    	 fresponse.setExtention(feed.getExtention());
    	 fresponse.setFeedId(feed.getFeedId());
    	 fresponse.setTableName(feed.getTableName());
         fresponse.setTableInitFile(feed.getTableInitFile());
    	 fresponse.setLocation(feed.getLocation());
    	 fresponse.setTitle(feed.getTitle());
    	 fresponse.setCategory(feed.getCategory());
    	 fresponse.setCompany(feed.getCompany());
    	 fresponse.setJobInsert(feed.getJobInsert());
    	 fresponse.setCleaningQuery(feed.getCategory());
    	 
    	 return fresponse;
    	 
     }
     
     public List<Feed> getAllFeedsByRegionId(int regionId)
     {
 		List<Feed> feedList = new ArrayList<>();
 		return feedList = (List<Feed>) feedRepo.getFeedByRegionId(regionId);
     }
     
     
 }
