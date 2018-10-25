package pl.jdata.example.querydsl.querydsl_demo;

import javax.sql.DataSource;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.PostgreSQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QueryDslDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueryDslDemoApplication.class, args);
    }

    @Bean
    public SQLQueryFactory sqlQueryFactory(DataSource dataSource) {
        final SQLTemplates templates = new PostgreSQLTemplates();
        final Configuration configuration = new Configuration(templates);

        return new SQLQueryFactory(configuration, dataSource);
    }
}
