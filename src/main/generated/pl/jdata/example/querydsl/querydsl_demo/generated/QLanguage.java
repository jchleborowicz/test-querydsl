package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLanguage is a Querydsl query type for QLanguage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLanguage extends com.querydsl.sql.RelationalPathBase<QLanguage> {

    private static final long serialVersionUID = -1627391552;

    public static final QLanguage language = new QLanguage("language");

    public final StringPath cd = createString("cd");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QLanguage> languagePkey = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QBook> _bookLanguageFk = createInvForeignKey(id, "language_id");

    public QLanguage(String variable) {
        super(QLanguage.class, forVariable(variable), "public", "language");
        addMetadata();
    }

    public QLanguage(String variable, String schema, String table) {
        super(QLanguage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLanguage(String variable, String schema) {
        super(QLanguage.class, forVariable(variable), schema, "language");
        addMetadata();
    }

    public QLanguage(Path<? extends QLanguage> path) {
        super(path.getType(), path.getMetadata(), "public", "language");
        addMetadata();
    }

    public QLanguage(PathMetadata metadata) {
        super(QLanguage.class, metadata, "public", "language");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cd, ColumnMetadata.named("cd").withIndex(2).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

