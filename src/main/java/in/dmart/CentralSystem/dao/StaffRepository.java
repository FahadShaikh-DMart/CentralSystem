package in.dmart.CentralSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.dmart.CentralSystem.entity.Staff;

@Repository

public interface StaffRepository extends JpaRepository<Staff, Integer> {

	@Query(name = "Staff-findStaffName", nativeQuery = true)
	public Staff existByStaffName(@Param("n") String n);

	@Query(name = "Staff-autoIncrementId", nativeQuery = true)
	public int autoIncrementId();
//" + ":attribute" +
	@Query(value = "SELECT n.staffid FROM Staff n WHERE n.staffname = :value OR n.staffusername = :value OR n.staffemail = :value OR n.staffcontact = :value", nativeQuery = true)
	public List<Integer> getStaffThroughDifferentAttributes( @Param("value") String value);
}
//@Param("attribute") String attribute,
