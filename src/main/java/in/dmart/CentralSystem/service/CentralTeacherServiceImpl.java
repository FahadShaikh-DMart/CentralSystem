package in.dmart.CentralSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.dmart.CentralSystem.dao.GenericRepository;
import in.dmart.CentralSystem.dao.TeacherRepository;
import in.dmart.CentralSystem.entity.Students;
import in.dmart.CentralSystem.entity.Teachers;

@Service
@Transactional
public class CentralTeacherServiceImpl implements CentralTeacherService {

	@Autowired
	GenericRepository<Teachers> genericRepository;

	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public Teachers findTeacherbyId(int teacherid) {

		return genericRepository.findOne(Teachers.class, teacherid);
	}

	@Override
	public String addTeacher(Teachers teacher) {
		// TODO Auto-generated method stub
		teacherRepository.save(teacher);
		return "New Student has been added, StudentID = " + teacher.getTeacherid();
	}

	@Override
	public String addAllTeachers(List<Teachers> teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(int teacherid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Students updateStudent(Teachers teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teachers> findAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
