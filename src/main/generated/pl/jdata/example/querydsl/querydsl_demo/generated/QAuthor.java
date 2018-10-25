package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAuthor is a Querydsl query type for QAuthor
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuthor extends com.querydsl.sql.RelationalPathBase<QAuthor> {

    private static final long serialVersionUID = 1154548211;

    public static final QAuthor author = new QAuthor("author");

    public final DatePath<java.sql.Date> dateOfBirth = createDate("dateOfBirth", java.sql.Date.class);

    public final NumberPath<Short> distinguished = createNumber("distinguished", Short.class);

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath lastName = createString("lastName");

    public final NumberPath<Integer> yearOfBirth = createNumber("yearOfBirth", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAuthor> authorPkey = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QBook> _bookAuthorFk = createInvForeignKey(id, "author_id");

    public QAuthor(String variable) {
        super(QAuthor.class, forVariable(variable), "public", "author");
        addMetadata();
    }

    public QAuthor(String variable, String schema, String table) {
        super(QAuthor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuthor(String variable, String schema) {
        super(QAuthor.class, forVariable(variable), schema, "author");
        addMetadata();
    }

    public QAuthor(Path<? extends QAuthor> path) {
        super(path.getType(), path.getMetadata(), "public", "author");
        addMetadata();
    }

    public QAuthor(PathMetadata metadata) {
        super(QAuthor.class, metadata, "public", "author");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateOfBirth, ColumnMetadata.named("date_of_birth").withIndex(4).ofType(Types.DATE).withSize(13));
        addMetadata(distinguished, ColumnMetadata.named("distinguished").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(2).ofType(Types.VARCHAR).withSize(50));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(yearOfBirth, ColumnMetadata.named("year_of_birth").withIndex(5).ofType(Types.INTEGER).withSize(10));
    }

}

