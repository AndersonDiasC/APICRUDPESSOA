package br.com.athenas.Configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class MysqlDataConnect {
	
@Bean
public DataSource conn() {
	DriverManagerDataSource conn = new DriverManagerDataSource();
	conn.setDriverClassName("com.mysql.cj.jdbc.Driver");
	conn.setUrl("jdbc:mysql://localhost:3306/WebAppAthenas");
	conn.setUsername("root");
	conn.setPassword("37Rn37PCbB");
	return conn;
}

@Bean
public JpaVendorAdapter jpaVendorAdapter() {
	HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	adapter.setDatabase(Database.MYSQL);
	adapter.setShowSql(true);
	adapter.setGenerateDdl(true);
	adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
	adapter.setPrepareConnection(true);
	return adapter;

}


}
