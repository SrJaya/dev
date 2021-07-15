package com.aQuickSoft.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aQuickSoft.Entity.Feed;
import com.aQuickSoft.Entity.FeedRequest;
import com.aQuickSoft.Entity.FeedResponse;

import com.aQuickSoft.Service.FeedService;

@RestController
@RequestMapping
public class FeedController 
{
	@Autowired
     FeedService feedSerive;
	@PostMapping("/saveFeed")
	public FeedResponse create (@RequestBody FeedRequest request) 
	{
		return feedSerive .create(request);
	}

	
	@GetMapping("/feed/region/{regionId}")
	public List<Feed> getAllFeedsByRegionId(@PathVariable int regionId) {
		return  feedSerive.getAllFeedsByRegionId(regionId);
	}
}
