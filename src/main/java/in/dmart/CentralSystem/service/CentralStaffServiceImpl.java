package in.dmart.CentralSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.dmart.CentralSystem.dao.GenericRepository;
import in.dmart.CentralSystem.dao.StaffRepository;
import in.dmart.CentralSystem.entity.Staff;

@Service
@Transactional
public class CentralStaffServiceImpl implements CentralStaffService {
	@Autowired
	GenericRepository<Staff> genericRepository;

	@Autowired
	StaffRepository staffRepository;

//	@Override
//	public Staff findStaffbyEmail(String staffemail) {
//		// TODO Auto-generated method stub
//		return staffRepository.findStaffbyEmail(staffemail);
//	}

	@Autowired
	CentralServiceStaffValidation centralServiceStaffValidation;

	@Override
	public String createStaff(Staff staff) {
		centralServiceStaffValidation.StaffUsername(staff);
		centralServiceStaffValidation.autoIncrement(staff);
		staffRepository.save(staff);
		return "Staff has been added with username : " + staff.getStaffusername() + " and id: " + staff.getStaffid();
	}

	public List<Staff> getStaffTroughDifferentAttributes(String value) {
		// attribute,
		List<Integer> staffgeneratedid = staffRepository.getStaffThroughDifferentAttributes(value);
		List<Staff> stafflist = new ArrayList<>();
		for(int onestaffvalue:staffgeneratedid) {
			stafflist.add(genericRepository.findOne(Staff.class, onestaffvalue));
		}
		return stafflist;
	}

	@Override
	public Staff findStafftbyId(int staffid) {
		// TODO Auto-generated method stub
		return genericRepository.findOne(Staff.class, staffid);
	}

	@Override
	public String addStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffRepository.save(staff);
		return "New Student has been added, StudentID = " + staff.getStaffid();
	}

	@Override
	public String addAllStaff(List<Staff> staff) {
		// TODO Auto-generated method stub
		staffRepository.saveAll(staff);
		return "All New Staff has been added into Database";
	}

	@Override
	public String deleteById(int staffid) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(staffid);
		return "Staff object is deleted with id = " + staffid;
	}

	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return genericRepository.update(staff);
	}

	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		List<Staff> staff = staffRepository.findAll();
		System.out.println(staffRepository);
		return staff;
	}

}
