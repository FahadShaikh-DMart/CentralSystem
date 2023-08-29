package in.dmart.CentralSystem.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	@Value("${spring.datasource.url}")
	String url;

	@Value("${spring.datasource.username}")
	String username;

	@Value("${spring.datasource.password}")
	String password;

	@Value("${spring.datasource.driver-class-name}")
	String driverName;

	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create().driverClassName(driverName).url(url).username(username).password(password)
				.build();

	}

}
