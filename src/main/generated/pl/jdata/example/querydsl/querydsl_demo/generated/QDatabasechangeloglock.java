package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabasechangeloglock is a Querydsl query type for QDatabasechangeloglock
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabasechangeloglock extends com.querydsl.sql.RelationalPathBase<QDatabasechangeloglock> {

    private static final long serialVersionUID = -1725809220;

    public static final QDatabasechangeloglock databasechangeloglock = new QDatabasechangeloglock("databasechangeloglock");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath locked = createBoolean("locked");

    public final StringPath lockedby = createString("lockedby");

    public final DateTimePath<java.sql.Timestamp> lockgranted = createDateTime("lockgranted", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QDatabasechangeloglock> databasechangeloglockPkey = createPrimaryKey(id);

    public QDatabasechangeloglock(String variable) {
        super(QDatabasechangeloglock.class, forVariable(variable), "public", "databasechangeloglock");
        addMetadata();
    }

    public QDatabasechangeloglock(String variable, String schema, String table) {
        super(QDatabasechangeloglock.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabasechangeloglock(String variable, String schema) {
        super(QDatabasechangeloglock.class, forVariable(variable), schema, "databasechangeloglock");
        addMetadata();
    }

    public QDatabasechangeloglock(Path<? extends QDatabasechangeloglock> path) {
        super(path.getType(), path.getMetadata(), "public", "databasechangeloglock");
        addMetadata();
    }

    public QDatabasechangeloglock(PathMetadata metadata) {
        super(QDatabasechangeloglock.class, metadata, "public", "databasechangeloglock");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(locked, ColumnMetadata.named("locked").withIndex(2).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(lockedby, ColumnMetadata.named("lockedby").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lockgranted, ColumnMetadata.named("lockgranted").withIndex(3).ofType(Types.TIMESTAMP).withSize(29).withDigits(6));
    }

}

