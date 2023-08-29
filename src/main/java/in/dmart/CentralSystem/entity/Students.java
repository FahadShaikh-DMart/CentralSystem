package in.dmart.CentralSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "students")
public class Students {

	@Id
	private int studentid;
	@Column
	private String studentname;
	@Column
	private String studentemail;
	@Column
	private String studentcontact;
	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", studentcontact=" + studentcontact + "]";
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public String getStudentcontact() {
		return studentcontact;
	}
	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}
	
}
