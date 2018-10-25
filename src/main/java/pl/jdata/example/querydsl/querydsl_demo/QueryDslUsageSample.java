package pl.jdata.example.querydsl.querydsl_demo;

import javax.annotation.PostConstruct;

import com.querydsl.sql.SQLQueryFactory;
import org.springframework.stereotype.Component;
import pl.jdata.example.querydsl.querydsl_demo.generated.QBook;

@Component
public class QueryDslUsageSample {

    private final SQLQueryFactory sqlQueryFactory;

    public QueryDslUsageSample(SQLQueryFactory sqlQueryFactory) {
        this.sqlQueryFactory = sqlQueryFactory;
    }

    @PostConstruct
    public void performTesting() {
        final QBook bookTable = QBook.book;

        this.sqlQueryFactory.select(bookTable.all())
                .from(bookTable)
                .fetch()
                .forEach(System.out::println);
    }
}
