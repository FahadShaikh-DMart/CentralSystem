package in.dmart.CentralSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.dmart.CentralSystem.entity.Staff;
import in.dmart.CentralSystem.service.CentralStaffService;

@RestController
@RequestMapping("/centralsystem")
public class CentralStaffController {
	@Autowired
	CentralStaffService centralStaffService;

	@PostMapping("/saveStaff")
	public String saveStaff(@RequestBody Staff staff) {
		return centralStaffService.createStaff(staff);
	}
	
	@PostMapping("/getStaffTroughDifferentAttributes/{attribute}/{value}")
	public List<Staff> getStaffTroughDifferentAttributes(@PathVariable String attribute,@PathVariable String value) {
		return centralStaffService.getStaffTroughDifferentAttributes(value);
	}
	
	
	
}
