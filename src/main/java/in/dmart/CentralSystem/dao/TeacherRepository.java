package in.dmart.CentralSystem.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.dmart.CentralSystem.entity.Teachers;

@Repository
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public interface TeacherRepository extends JpaRepository<Teachers, Integer> {

//	@Query(name = "Student-findTeacherByEmail")
//	public Teachers findStudentbyEmail(@Param("s") String s);
}
