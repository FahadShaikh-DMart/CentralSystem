package in.dmart.CentralSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.dmart.CentralSystem.dao.GenericRepository;
import in.dmart.CentralSystem.dao.StudentRepository;
import in.dmart.CentralSystem.entity.Students;

@Service
@Transactional
public class CentralStudentServiceImpl implements CentralStudentService {

	@Autowired
	GenericRepository<Students> genericRepository;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Students findStudentbyEmail(String studenteamil) {
		return studentRepository.findStudentbyEmail(studenteamil);
	}

	@Override
	public Students findStudentbyId(int studentid) {
		return genericRepository.findOne(Students.class, studentid);
		// return null;
	}

	@Override
	public String addStudent(Students student) {
		studentRepository.save(student);
		return "New Student has been added, StudentID = " + student.getStudentid();
	}

	@Override
	public String addAllStudents(List<Students> student) {
		studentRepository.saveAll(student);
		return "All New Student has been added into Database";
	}

	@Override
	public String deleteById(int studentid) {
		// Employee employee = dao.findById(EmpId);
		studentRepository.deleteById(studentid);
		return "Student object is deleted with id = " + studentid;
	}

//	public String updateStudent(Students student) {
//		
//		genericRepository.update(student);
//		return "Student is updated = " + student.getStudentid();
//	}

	@Override
	public Students updateStudent(Students student) {

		return genericRepository.update(student);
		// return "Student is updated = " + student.getStudentid();
	}

	public List<Students> findAllStudents() {
		List<Students> students = studentRepository.findAll();
		System.out.println(studentRepository);
		return students;
	}

}
