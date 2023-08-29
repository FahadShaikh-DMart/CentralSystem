package in.dmart.CentralSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.dmart.CentralSystem.entity.Students;

@Service
public interface CentralStudentService {

	public Students findStudentbyEmail(String studenteamil);

	public Students findStudentbyId(int studentid);

	public String addStudent(Students student);

	public String addAllStudents(List<Students> student);

	public String deleteById(int studentid);

//		public String updateStudent(Students student);

	public Students updateStudent(Students student);

	public List<Students> findAllStudents();

}
