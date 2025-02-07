package in.dmart.CentralSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.dmart.CentralSystem.entity.Medicine;
import in.dmart.CentralSystem.service.MedicineService;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@GetMapping("/suggestions")
	public List<Medicine> getSuggestions(@RequestParam String query) {
		return medicineService.searchByPrefix(query);
	}

	@PostMapping("/savemedicine")
	public List<Medicine> addMedicines(@RequestBody List<Medicine> medicines) {
		return medicineService.saveAll(medicines);
	}
}
