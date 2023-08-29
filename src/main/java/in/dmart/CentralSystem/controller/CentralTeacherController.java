package in.dmart.CentralSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.dmart.CentralSystem.entity.Teachers;
import in.dmart.CentralSystem.service.CentralTeacherService;

@RestController
@RequestMapping("/centralsystem")
public class CentralTeacherController {

	@Autowired
	CentralTeacherService teacherService;
	
	@GetMapping("/findteacherbyid/{teacherid}")
	public Teachers findTeacherbyId(@PathVariable int teacherid) {
		return teacherService.findTeacherbyId(teacherid);
	}

	@PostMapping("/addteacher")
	public String addTeacher(@RequestBody Teachers teacher) {
		return teacherService.addTeacher(teacher);
	}
}
