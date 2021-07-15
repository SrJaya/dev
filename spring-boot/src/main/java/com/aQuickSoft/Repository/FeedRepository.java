package com.aQuickSoft.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aQuickSoft.Entity.Feed;

public interface FeedRepository extends CrudRepository<Feed, Long>
{
	
	List<Feed> getFeedByRegionId(int regionId);

}
