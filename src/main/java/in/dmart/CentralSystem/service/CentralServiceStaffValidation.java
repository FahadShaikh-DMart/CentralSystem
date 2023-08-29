package in.dmart.CentralSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.dmart.CentralSystem.dao.StaffRepository;
import in.dmart.CentralSystem.entity.Staff;

@Service
public class CentralServiceStaffValidation {

	@Autowired
	StaffRepository staffRepository;

	public void StaffUsername(Staff staff) {
		String staffname = staff.getStaffname();
		Staff prevstaff = staffRepository.existByStaffName(staffname);
		if (prevstaff == null) {
			String currentname = staff.getStaffname();
			staff.setStaffusername("1-" + currentname);
		} else {
			String checkusername = prevstaff.getStaffusername();
			String[] arrOfCheckname = checkusername.split("-", 2);
			int counter = Integer.parseInt(arrOfCheckname[0]);
			counter++;
			staff.setStaffusername(counter + "-" + staff.getStaffname());
		}
	}
	
	public void autoIncrement(Staff staff) {
		int newid = staffRepository.autoIncrementId();
		newid = newid +1;
		staff.setStaffid(newid);
	}
	
	
}