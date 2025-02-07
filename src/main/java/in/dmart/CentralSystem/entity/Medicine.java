package in.dmart.CentralSystem.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = "medicines")
@Setting(settingPath = "elasticsearch-settings.json") // Edge n-gram configuration
public class Medicine {

	@Id
	private String id;

	@Field(type = FieldType.Text, analyzer = "edge_ngram_analyzer", searchAnalyzer = "standard")
	private String name;

	@Field(type = FieldType.Text)
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}