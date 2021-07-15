package com.aQuickSoft.Repository;

import org.springframework.data.repository.CrudRepository;

import com.aQuickSoft.Entity.Region;

public interface regionRepository extends CrudRepository<Region, Long> {

	Region findById(int id);

}
