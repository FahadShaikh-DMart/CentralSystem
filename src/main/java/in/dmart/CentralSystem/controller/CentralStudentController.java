package in.dmart.CentralSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.dmart.CentralSystem.entity.Students;
import in.dmart.CentralSystem.entity.Teachers;
import in.dmart.CentralSystem.service.CentralStudentService;
import in.dmart.CentralSystem.service.CentralTeacherService;

@RestController
@RequestMapping("/centralsystem")
public class CentralStudentController {

	@Autowired
	CentralStudentService studentService;

	@Autowired
	CentralTeacherService centralTeacherService;
	
	

//	@ApiOperation(value = "Find User By ID")
//	@GetMapping(value = "/find/{userid}")
//	public User findOne(@PathVariable int userid) {
//		return userService.findOne(userid);
//	}

	@GetMapping("/findstudentbyemail/{studentemail}")
	public Students findStudentbyEmail(@PathVariable String studentemail) {
		return studentService.findStudentbyEmail(studentemail);
	}

	@GetMapping("/findstudentbyid/{studentid}")
	public Students findStudentbyId(@PathVariable int studentid) {
		return studentService.findStudentbyId(studentid);
	}

	@PostMapping("/addstudent")
	public String addStudent(@RequestBody Students student) {
		return studentService.addStudent(student);
	}

	@PostMapping("/addmultiplestudent/{student}")
	public String addAllStudent(@RequestBody List<Students> student) {
		return studentService.addAllStudents(student);
	}

	@DeleteMapping("/deletestudentbyid/{studentid}")
	public String deleteStudentById(@PathVariable int studentid) {
		return studentService.deleteById(studentid);
	}

	@PutMapping("/updatestudent")
	public Students updateStudent(@RequestBody Students student) {
		return studentService.updateStudent(student);
	}

	@GetMapping("/findallstudent")
	public List<Students> findallStudent() {
		return studentService.findAllStudents();
	}

	

}
