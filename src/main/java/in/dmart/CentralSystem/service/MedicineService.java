package in.dmart.CentralSystem.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.stereotype.Service;

import in.dmart.CentralSystem.dao.MedicineRepository;
import in.dmart.CentralSystem.entity.Medicine;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Autowired
	private ElasticsearchRestTemplate elasticsearchRestTemplate;

	public List<Medicine> searchByPrefix(String prefix) {
		NativeSearchQuery searchQuery = new NativeSearchQuery(QueryBuilders.matchPhrasePrefixQuery("name", prefix));

		org.springframework.data.elasticsearch.core.SearchHits<Medicine> searchHits = elasticsearchRestTemplate
				.search(searchQuery, Medicine.class);

		return searchHits.stream().map(hit -> hit.getContent()).collect(Collectors.toList());
	}

	public List<Medicine> saveAll(List<Medicine> medicines) {
		try {
			return (List<Medicine>) medicineRepository.saveAll(medicines);
		} catch (Exception e) {
			e.printStackTrace(); // Debugging error message
			return Collections.emptyList();
		}
	}

}
