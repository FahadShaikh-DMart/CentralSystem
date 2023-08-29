package in.dmart.CentralSystem.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.dmart.CentralSystem.entity.Students;

@Repository
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public interface StudentRepository extends JpaRepository<Students, Integer> {

	@Query(name = "Student-findStudentByEmail")
	public Students findStudentbyEmail(@Param("s") String s);
}