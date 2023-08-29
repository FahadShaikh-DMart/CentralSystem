package in.dmart.CentralSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.dmart.CentralSystem.entity.Staff;

@Service
public interface CentralStaffService {
//	public Staff findStaffbyEmail(String studenteamil);

	public List<Staff> getStaffTroughDifferentAttributes(String value);
	//String attribute
	public String createStaff(Staff staff);

	public Staff findStafftbyId(int studentid);

	public String addStaff(Staff staff);

	public String addAllStaff(List<Staff> staff);

	public String deleteById(int staffid);

	public Staff updateStaff(Staff staff);

	public List<Staff> findAllStaff();
}
