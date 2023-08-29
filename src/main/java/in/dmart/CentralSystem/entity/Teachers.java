package in.dmart.CentralSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teachers {

	@Id
	private int teacherid;
	@Column
	private String teachername;
	@Column
	private String teacheremail;
	@Column
	private String teachercontact;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacheremail() {
		return teacheremail;
	}
	public void setTeacheremail(String teacheremail) {
		this.teacheremail = teacheremail;
	}
	public String getTeachercontact() {
		return teachercontact;
	}
	public void setTeachercontact(String teachercontact) {
		this.teachercontact = teachercontact;
	}
	@Override
	public String toString() {
		return "Teachers [teacherid=" + teacherid + ", teachername=" + teachername + ", teacheremail=" + teacheremail
				+ ", teachercontact=" + teachercontact + "]";
	}
}
