package in.dmart.CentralSystem.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.dmart.CentralSystem.entity.Medicine;

@Repository
public interface MedicineRepository extends ElasticsearchRepository<Medicine, String> {
	 // Use method naming conventions
    List<Medicine> findByNameStartingWith(String prefix);
}
