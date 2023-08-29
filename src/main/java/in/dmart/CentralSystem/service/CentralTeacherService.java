package in.dmart.CentralSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.dmart.CentralSystem.entity.Students;
import in.dmart.CentralSystem.entity.Teachers;

@Service
public interface CentralTeacherService {

	//public Students findStudentbyEmail(String studenteamil);

	public Teachers findTeacherbyId(int teacherid);

	public String addTeacher(Teachers teacher);

	public String addAllTeachers(List<Teachers> teacher);

	public String deleteById(int teacherid);

//		public String updateStudent(Students student);

	public Students updateStudent(Teachers teacher);

	public List<Teachers> findAllStudents();

}
