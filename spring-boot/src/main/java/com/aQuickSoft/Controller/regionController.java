package com.aQuickSoft.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aQuickSoft.Entity.Region;
import com.aQuickSoft.Entity.regionRequest;
import com.aQuickSoft.Entity.regionResponse;
import com.aQuickSoft.Service.regionService;

@Controller
@RequestMapping("/")
public class regionController {
	@Autowired
	regionService service;

	@PostMapping("/saveRegion")
	public regionResponse createRegion(@RequestBody regionRequest request) {
		return service.Create(request);
	}

	@GetMapping("/region/{id}")
	public String getRegionById(@PathVariable("id") int id, Model model) throws Exception {
		model.addAttribute("region", service.getRegionById(id));
		return "Update";
	}

	@GetMapping("/region")
	public String getAllRegions(Model model) {
		model.addAttribute("listOfRegions", service.getAllRegions());
		return "Index";
	}

	@PostMapping("/regionUpdate/{id}")
	public String updateById(@PathVariable("id") int regionid, Model model, Region region, BindingResult result)
			throws Exception {
		service.updateRegionById(regionid, region);
		model.addAttribute("listOfRegions", service.getAllRegions());
		return "Index";
	}

	@PostMapping("/disableById/{id}")
	public String disableById(@PathVariable("id") int regionId, Model model) throws Exception {
		service.disableById(regionId);
		model.addAttribute("listOfRegions", service.getAllRegions());
		return "Index";
	}

	@PostMapping("/enableById/{id}")
	public String enableById(@PathVariable("id") int regionId, Model model) throws Exception {
		service.enableById(regionId);
		model.addAttribute("listOfRegions", service.getAllRegions());
		return "Index";
	}
}
