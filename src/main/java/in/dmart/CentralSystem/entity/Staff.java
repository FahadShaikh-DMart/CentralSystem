package in.dmart.CentralSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

	@Id
	private int staffid;
	@Column
	private String staffusername;
	@Column
	private String staffname;

	public String getStaffusername() {
		return staffusername;
	}

	public void setStaffusername(String staffusername) {
		this.staffusername = staffusername;
	}

	@Column
	private String staffemail;
	@Column
	private String staffcontact;

	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", staffusername=" + staffusername + ", staffname=" + staffname
				+ ", staffemail=" + staffemail + ", staffcontact=" + staffcontact + "]";
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getStaffemail() {
		return staffemail;
	}

	public void setStaffemail(String staffemail) {
		this.staffemail = staffemail;
	}

	public String getStaffcontact() {
		return staffcontact;
	}

	public void setStaffcontact(String staffcontact) {
		this.staffcontact = staffcontact;
	}

}
