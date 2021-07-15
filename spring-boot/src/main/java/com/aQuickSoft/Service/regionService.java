package com.aQuickSoft.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aQuickSoft.Entity.Region;
import com.aQuickSoft.Entity.regionRequest;
import com.aQuickSoft.Entity.regionResponse;
import com.aQuickSoft.Repository.regionRepository;

@Service
public class regionService {
	@Autowired
	private regionRepository repository;

	public regionResponse Create(regionRequest request) {
		Region reg = new Region();
		reg.setId(request.getId());
		reg.setName(request.getName());
		reg.setRegions(request.getRegions());
		reg.setFlag(request.getFlag());
		reg.setEnableDatamapper(request.isEnableDatamapper());
		reg.setActivated(request.isActivated());
		reg.setResultCount(request.getResultCount());
		reg.setGoogleJobPostingEndpoint(request.getGoogleJobPostingEndpoint());

		reg = repository.save(reg);
		return toResponse(reg);

	}

	private regionResponse toResponse(Region reg) {
		regionResponse response = new regionResponse();
		response.setId(reg.getId());
		response.setName(reg.getName());
		response.setRegions(reg.getRegions());
		response.setFlag(reg.getFlag());
		response.setEnableDatamapper(reg.isEnableDatamapper());
		response.setActivated(reg.isActivated());
		response.setResultCount(reg.getResultCount());
		response.setGoogleJobPostingEndpoint(reg.getGoogleJobPostingEndpoint());

		return response;

	}

	public Region getRegionById(int id) throws Exception {
		Region reg = repository.findById(id);
		return reg;
	}

	public List<Region> getAllRegions() {
		List<Region> reg = new ArrayList<>();
		return reg = (List<Region>) repository.findAll();
	}

	public Region updateRegionById(int id ,Region reg) throws Exception {

		Region region = repository.findById(reg.getId());
		if (region != null) {
			return repository.save(reg);
		}
		return null;

	}

	public Region disableById(int id) throws Exception {

		Region region = repository.findById(id);
		if (region != null && !region.isEnableDatamapper()) {
			region.setActivated(true);
			return repository.save(region);
		}
		return null;
	}

	public Region enableById(int id) throws Exception {

		Region region = repository.findById(id);
		if (region != null && region.isActivated()) {
			region.setActivated(false);
			return repository.save(region);
		}
		return null;
	}
}
