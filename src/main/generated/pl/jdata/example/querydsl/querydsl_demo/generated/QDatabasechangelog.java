package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabasechangelog is a Querydsl query type for QDatabasechangelog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabasechangelog extends com.querydsl.sql.RelationalPathBase<QDatabasechangelog> {

    private static final long serialVersionUID = 1583114513;

    public static final QDatabasechangelog databasechangelog = new QDatabasechangelog("databasechangelog");

    public final StringPath author = createString("author");

    public final StringPath comments = createString("comments");

    public final StringPath contexts = createString("contexts");

    public final DateTimePath<java.sql.Timestamp> dateexecuted = createDateTime("dateexecuted", java.sql.Timestamp.class);

    public final StringPath deploymentId = createString("deploymentId");

    public final StringPath description = createString("description");

    public final StringPath exectype = createString("exectype");

    public final StringPath filename = createString("filename");

    public final StringPath id = createString("id");

    public final StringPath labels = createString("labels");

    public final StringPath liquibase = createString("liquibase");

    public final StringPath md5sum = createString("md5sum");

    public final NumberPath<Integer> orderexecuted = createNumber("orderexecuted", Integer.class);

    public final StringPath tag = createString("tag");

    public QDatabasechangelog(String variable) {
        super(QDatabasechangelog.class, forVariable(variable), "public", "databasechangelog");
        addMetadata();
    }

    public QDatabasechangelog(String variable, String schema, String table) {
        super(QDatabasechangelog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabasechangelog(String variable, String schema) {
        super(QDatabasechangelog.class, forVariable(variable), schema, "databasechangelog");
        addMetadata();
    }

    public QDatabasechangelog(Path<? extends QDatabasechangelog> path) {
        super(path.getType(), path.getMetadata(), "public", "databasechangelog");
        addMetadata();
    }

    public QDatabasechangelog(PathMetadata metadata) {
        super(QDatabasechangelog.class, metadata, "public", "databasechangelog");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("author").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(comments, ColumnMetadata.named("comments").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(contexts, ColumnMetadata.named("contexts").withIndex(12).ofType(Types.VARCHAR).withSize(255));
        addMetadata(dateexecuted, ColumnMetadata.named("dateexecuted").withIndex(4).ofType(Types.TIMESTAMP).withSize(29).withDigits(6).notNull());
        addMetadata(deploymentId, ColumnMetadata.named("deployment_id").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(description, ColumnMetadata.named("description").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(exectype, ColumnMetadata.named("exectype").withIndex(6).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(filename, ColumnMetadata.named("filename").withIndex(3).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(labels, ColumnMetadata.named("labels").withIndex(13).ofType(Types.VARCHAR).withSize(255));
        addMetadata(liquibase, ColumnMetadata.named("liquibase").withIndex(11).ofType(Types.VARCHAR).withSize(20));
        addMetadata(md5sum, ColumnMetadata.named("md5sum").withIndex(7).ofType(Types.VARCHAR).withSize(35));
        addMetadata(orderexecuted, ColumnMetadata.named("orderexecuted").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tag, ColumnMetadata.named("tag").withIndex(10).ofType(Types.VARCHAR).withSize(255));
    }

}

